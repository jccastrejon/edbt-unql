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
public class Neo4jUtil {
	/**
	 * 
	 * @param relationName
	 * @param attributes
	 * @param conditions
	 * @return
	 */
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

		// TODO: Get connection data as argument
		returnValue = new StringBuilder();

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

		return returnValue.toString();
	}

	/**
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
	 * TODO: Refactor with getAttributesList()
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
