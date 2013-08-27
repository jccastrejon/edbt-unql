package fr.imag.unql.transformation.util;

import java.util.List;

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
		StringBuilder returnValue;
		returnValue = new StringBuilder();
		
		returnValue.append("TODO: Actual Neo4j invocation with relation: " + relationName + ", attributes: " + attributes);
		return returnValue.toString();
	}
}
