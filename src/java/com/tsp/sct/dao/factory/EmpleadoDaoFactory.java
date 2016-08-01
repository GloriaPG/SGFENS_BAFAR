/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.factory;

import java.sql.Connection;
import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.jdbc.*;

public class EmpleadoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return EmpleadoDao
	 */
	public static EmpleadoDao create()
	{
		return new EmpleadoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return EmpleadoDao
	 */
	public static EmpleadoDao create(Connection conn)
	{
		return new EmpleadoDaoImpl( conn );
	}

}