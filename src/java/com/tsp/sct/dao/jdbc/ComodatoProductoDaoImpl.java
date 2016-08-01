/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.jdbc;

import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.factory.*;
import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ComodatoProductoDaoImpl extends AbstractDAO implements ComodatoProductoDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT ID_COMODATO_PRODUCTO, ID_COMODATO, ID_CONCEPTO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_COMODATO_PRODUCTO, ID_COMODATO, ID_CONCEPTO ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_COMODATO_PRODUCTO = ?, ID_COMODATO = ?, ID_CONCEPTO = ? WHERE ID_COMODATO_PRODUCTO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_COMODATO_PRODUCTO = ?";

	/** 
	 * Index of column ID_COMODATO_PRODUCTO
	 */
	protected static final int COLUMN_ID_COMODATO_PRODUCTO = 1;

	/** 
	 * Index of column ID_COMODATO
	 */
	protected static final int COLUMN_ID_COMODATO = 2;

	/** 
	 * Index of column ID_CONCEPTO
	 */
	protected static final int COLUMN_ID_CONCEPTO = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column ID_COMODATO_PRODUCTO
	 */
	protected static final int PK_COLUMN_ID_COMODATO_PRODUCTO = 1;

	/** 
	 * Inserts a new row in the comodato_producto table.
	 */
	public ComodatoProductoPk insert(ComodatoProducto dto) throws ComodatoProductoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isIdComodatoProductoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_COMODATO_PRODUCTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdComodatoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_COMODATO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdConceptoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CONCEPTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString(), Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.isIdComodatoProductoModified()) {
				stmt.setInt( index++, dto.getIdComodatoProducto() );
			}
		
			if (dto.isIdComodatoModified()) {
				if (dto.isIdComodatoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdComodato() );
				}
		
			}
		
			if (dto.isIdConceptoModified()) {
				if (dto.isIdConceptoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdConcepto() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdComodatoProducto( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComodatoProductoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the comodato_producto table.
	 */
	public void update(ComodatoProductoPk pk, ComodatoProducto dto) throws ComodatoProductoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isIdComodatoProductoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_COMODATO_PRODUCTO=?" );
				modified=true;
			}
		
			if (dto.isIdComodatoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_COMODATO=?" );
				modified=true;
			}
		
			if (dto.isIdConceptoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CONCEPTO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_COMODATO_PRODUCTO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdComodatoProductoModified()) {
				stmt.setInt( index++, dto.getIdComodatoProducto() );
			}
		
			if (dto.isIdComodatoModified()) {
				if (dto.isIdComodatoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdComodato() );
				}
		
			}
		
			if (dto.isIdConceptoModified()) {
				if (dto.isIdConceptoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdConcepto() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdComodatoProducto() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComodatoProductoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the comodato_producto table.
	 */
	public void delete(ComodatoProductoPk pk) throws ComodatoProductoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdComodatoProducto() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComodatoProductoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the comodato_producto table that matches the specified primary-key value.
	 */
	public ComodatoProducto findByPrimaryKey(ComodatoProductoPk pk) throws ComodatoProductoDaoException
	{
		return findByPrimaryKey( pk.getIdComodatoProducto() );
	}

	/** 
	 * Returns all rows from the comodato_producto table that match the criteria 'ID_COMODATO_PRODUCTO = :idComodatoProducto'.
	 */
	public ComodatoProducto findByPrimaryKey(int idComodatoProducto) throws ComodatoProductoDaoException
	{
		ComodatoProducto ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_COMODATO_PRODUCTO = ?", new Object[] {  new Integer(idComodatoProducto) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the comodato_producto table that match the criteria ''.
	 */
	public ComodatoProducto[] findAll() throws ComodatoProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_COMODATO_PRODUCTO", null );
	}

	/** 
	 * Returns all rows from the comodato_producto table that match the criteria 'ID_COMODATO_PRODUCTO = :idComodatoProducto'.
	 */
	public ComodatoProducto[] findWhereIdComodatoProductoEquals(int idComodatoProducto) throws ComodatoProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COMODATO_PRODUCTO = ? ORDER BY ID_COMODATO_PRODUCTO", new Object[] {  new Integer(idComodatoProducto) } );
	}

	/** 
	 * Returns all rows from the comodato_producto table that match the criteria 'ID_COMODATO = :idComodato'.
	 */
	public ComodatoProducto[] findWhereIdComodatoEquals(int idComodato) throws ComodatoProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COMODATO = ? ORDER BY ID_COMODATO", new Object[] {  new Integer(idComodato) } );
	}

	/** 
	 * Returns all rows from the comodato_producto table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public ComodatoProducto[] findWhereIdConceptoEquals(int idConcepto) throws ComodatoProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CONCEPTO = ? ORDER BY ID_CONCEPTO", new Object[] {  new Integer(idConcepto) } );
	}

	/**
	 * Method 'ComodatoProductoDaoImpl'
	 * 
	 */
	public ComodatoProductoDaoImpl()
	{
	}

	/**
	 * Method 'ComodatoProductoDaoImpl'
	 * 
	 * @param userConn
	 */
	public ComodatoProductoDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "comodato_producto";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ComodatoProducto fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ComodatoProducto dto = new ComodatoProducto();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ComodatoProducto[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ComodatoProducto dto = new ComodatoProducto();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ComodatoProducto ret[] = new ComodatoProducto[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ComodatoProducto dto, ResultSet rs) throws SQLException
	{
		dto.setIdComodatoProducto( rs.getInt( COLUMN_ID_COMODATO_PRODUCTO ) );
		dto.setIdComodato( rs.getInt( COLUMN_ID_COMODATO ) );
		if (rs.wasNull()) {
			dto.setIdComodatoNull( true );
		}
		
		dto.setIdConcepto( rs.getInt( COLUMN_ID_CONCEPTO ) );
		if (rs.wasNull()) {
			dto.setIdConceptoNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ComodatoProducto dto)
	{
		dto.setIdComodatoProductoModified( false );
		dto.setIdComodatoModified( false );
		dto.setIdConceptoModified( false );
	}

	/** 
	 * Returns all rows from the comodato_producto table that match the specified arbitrary SQL statement
	 */
	public ComodatoProducto[] findByDynamicSelect(String sql, Object[] sqlParams) throws ComodatoProductoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComodatoProductoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the comodato_producto table that match the specified arbitrary SQL statement
	 */
	public ComodatoProducto[] findByDynamicWhere(String sql, Object[] sqlParams) throws ComodatoProductoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComodatoProductoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}