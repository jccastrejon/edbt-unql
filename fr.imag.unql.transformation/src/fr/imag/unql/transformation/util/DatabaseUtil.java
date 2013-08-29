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

import java.util.List;

/**
 * Defines methods that classes that interact with databases should implement.
 * 
 * @author jccastrejon
 * 
 */
public interface DatabaseUtil {
	/**
	 * Execute a query in the associated database with the specified parameters.
	 * 
	 * @param relationName
	 * @param connectionURL
	 * @param connectionUsername
	 * @param connectionPassword
	 * @param attributes
	 * @param conditions
	 * @return
	 */
	public abstract String executeQuery(final String relationName,
			final String connectionURL, final String connectionUsername,
			final String connectionPassword, final List<String> attributes,
			final List<String> conditions);
}