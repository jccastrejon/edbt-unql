/**
 * Copyright 2013 jccastrejon
 * 
 * This file is part of EDBT-unql.
 * EDBT-unql is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * EDBT-unql is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with EDBT-unql.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.imag.unql.transformation.util;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.neo4j.rest.graphdb.RestAPI;
import org.neo4j.rest.graphdb.RestAPIFacade;
import org.neo4j.rest.graphdb.query.QueryEngine;
import org.neo4j.rest.graphdb.query.RestCypherQueryEngine;
import org.neo4j.rest.graphdb.util.QueryResult;

/**
 * 
 * @author jccastrejon
 * 
 */
public class Neo4jUtil implements DatabaseUtil {

	@Override
	public String executeQuery(final String relationName,
			final String connectionURL, final String connectionUsername,
			final String connectionPassword, final List<String> attributes,
			final List<String> conditions) {
		RestAPI graphDb;
		StringBuilder returnValue;
		Map<String, Object> resultRow;
		QueryResult<Map<String, Object>> result;
		QueryEngine<Map<String, Object>> engine;
		Iterator<Map<String, Object>> resultIterator;

		returnValue = new StringBuilder();

		try {
			// Database connection
			if ((connectionUsername != null) && (connectionPassword != null)) {
				graphDb = new RestAPIFacade(connectionURL, connectionUsername,
						connectionPassword);
			} else {
				graphDb = new RestAPIFacade(connectionURL);
			}

			// Build and execute Cypher query
			engine = new RestCypherQueryEngine(graphDb);
			result = engine.query(
					"start " + relationName + "=node(*)"
							+ this.getConditionsList(conditions) + "return "
							+ this.getAttributesList(attributes),
					Collections.EMPTY_MAP);

			// Analyze query results
			resultIterator = result.iterator();
			if (resultIterator != null) {
				while (resultIterator.hasNext()) {
					resultRow = resultIterator.next();
					returnValue.append(resultRow.toString());
				}
			}
		} catch (Exception e) {
			returnValue.append("Error while executing Cypher query: "
					+ e.getMessage());
		}

		return returnValue.toString();
	}

	/**
	 * Format attributes that will be projected.
	 * 
	 * @param attributes
	 * @return
	 */
	private String getAttributesList(final List<String> attributes) {
		String returnValue;
		StringBuilder attributesList;

		// Join all attributes in a single String, specifying that all of them
		// can be optional
		attributesList = new StringBuilder();
		for (String attribute : attributes) {
			attributesList.append(attribute).append("? as ")
					.append(attribute.substring(attribute.indexOf('.') + 1))
					.append(",");
		}

		// Remove last comma
		returnValue = attributesList.toString().substring(0,
				attributesList.toString().lastIndexOf(","));

		return returnValue;
	}

	/**
	 * Format conditions that will be applied. - TODO: Refactor with
	 * getAttributesList()
	 * 
	 * @param conditions
	 * @return
	 */
	private String getConditionsList(final List<String> conditions) {
		String returnValue;
		StringBuilder conditionsList;

		if ((conditions != null) && (!conditions.isEmpty())) {
			// Join all attributes in a single String, specifying that all of
			// them can be optional
			conditionsList = new StringBuilder();
			for (String condition : conditions) {
				conditionsList.append(condition.replace("=", "?=")).append(
						" and ");
			}

			returnValue = " where "
					+ conditionsList.toString().substring(0,
							conditionsList.toString().lastIndexOf(" and "));
		} else {
			returnValue = "";
		}

		return returnValue;
	}
}
