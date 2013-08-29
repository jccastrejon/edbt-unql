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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 * Allows the execution of queries in MongoDB databases.
 * 
 * @author jccastrejon
 * 
 */
public class MongoDBUtil implements DatabaseUtil {

	@Override
	public String executeQuery(final String relationName,
			final String connectionURL, final String connectionUsername,
			final String connectionPassword, final List<String> attributes,
			final List<String> conditions) {
		DB database;
		DBCursor queryResults;
		DBCollection collection;
		MongoClient mongoClient;
		StringBuilder returnValue;
		BasicDBObject searchQuery;
		BasicDBObject searchAttributes;
		
		returnValue = new StringBuilder();
		Map<String, String> conditionsMap;
		Map<String, String> attributesMap;
		
		try {
			searchQuery = new BasicDBObject();
			searchAttributes = new BasicDBObject();
			mongoClient = new MongoClient(connectionURL);
			database = mongoClient.getDB(relationName);

			// Database connection
			if ((connectionUsername != null) && (connectionPassword != null)) {
				database.authenticate(connectionUsername,
						connectionPassword.toCharArray());
			}

			// Format attributes that will be projected
			attributesMap = this.getAttributesMap(relationName, attributes);
			for (String key : attributesMap.keySet()) {
				searchAttributes.put(key, attributesMap.get(key));
			}

			// Format conditions that will be applied
			conditionsMap = this.getConditionsMap(relationName, conditions);
			for (String key : conditionsMap.keySet()) {
				searchQuery.put(key, conditionsMap.get(key));
			}

			// Execute query and retrieve results
			collection = database.getCollection(relationName);
			queryResults = collection.find(searchQuery, searchAttributes);
			while (queryResults.hasNext()) {
				returnValue.append(queryResults.next());
			}
		} catch (Exception e) {
			returnValue.append("Error while executing MongoDB query: "
					+ e.getMessage());
		}

		return returnValue.toString();
	}

	/**
	 * Format attributes that will be projected.
	 * 
	 * @param relationName
	 * @param attributes
	 * @return
	 */
	private Map<String, String> getAttributesMap(final String relationName,
			final List<String> attributes) {
		Map<String, String> returnValue;

		returnValue = new HashMap<String, String>();
		if (attributes != null) {
			for (String attribute : attributes) {
				returnValue.put(attribute.replace(relationName + ".", ""), "1");
			}
		}

		return returnValue;
	}

	/**
	 * Format conditions that will be applied. - TODO: Refactor with
	 * getAttributesMap()
	 * 
	 * @param relationName
	 * @param conditions
	 * @return
	 */
	private Map<String, String> getConditionsMap(final String relationName,
			final List<String> conditions) {
		String key;
		String value;
		int operatorIndex;
		Map<String, String> returnValue;

		returnValue = new HashMap<String, String>();
		if (conditions != null) {
			for (String condition : conditions) {
				operatorIndex = condition.indexOf('=');
				key = condition.substring(0, operatorIndex)
						.replace(relationName + ".", "").trim();
				value = condition
						.substring(operatorIndex + 1, condition.length())
						.replace("'", "").replace(relationName + ".", "")
						.trim();
				returnValue.put(key, value);
			}
		}

		return returnValue;
	}
}
