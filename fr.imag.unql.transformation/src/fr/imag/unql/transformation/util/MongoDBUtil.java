package fr.imag.unql.transformation.util;

import java.util.List;

/**
 * 
 * @author jccastrejon
 *
 */
public class MongoDBUtil {
	/**
	 * 
	 * @param relationName
	 * @param attributes
	 * @return
	 */
	public String executeQuery(String relationName, List<String> attributes) {
		StringBuilder returnValue;
		returnValue = new StringBuilder();
		
		returnValue.append("TODO: Actual MongoDB invocation with relation: " + relationName + ", attributes: " + attributes);
		return returnValue.toString();
	}
}
