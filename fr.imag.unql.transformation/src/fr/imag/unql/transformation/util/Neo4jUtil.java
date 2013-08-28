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
	 * @return
	 */
	public String executeQuery(String relationName, List<String> attributes) {
		RestAPI graphDb;
		StringBuilder returnValue;
		Map<String, Object> resultRow;
		QueryResult<Map<String, Object>> result;
		QueryEngine<Map<String, Object>> engine;
		Iterator<Map<String, Object>> resultIterator;

		returnValue = new StringBuilder();
		graphDb = new RestAPIFacade("http://localhost:7474/db/data");
		engine = new RestCypherQueryEngine(graphDb);

		result = engine.query(
				"start n=node(*) return "
						+ this.getAttributesList("n", attributes),
				Collections.EMPTY_MAP);
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
	 * @param nodeName
	 * @param attributes
	 * @return
	 */
	private String getAttributesList(final String nodeName,
			final List<String> attributes) {
		String returnValue;
		StringBuilder attributesList;

		// Join all attributes in a single String, specifying that all of them
		// can be optional
		attributesList = new StringBuilder();
		for (String attribute : attributes) {
			attributesList.append(nodeName).append(".").append(attribute)
					.append("? as ").append(attribute).append(",");
		}

		// Remove last comma
		returnValue = attributesList.toString().substring(0,
				attributesList.toString().length() - 1);

		return returnValue;
	}
}
