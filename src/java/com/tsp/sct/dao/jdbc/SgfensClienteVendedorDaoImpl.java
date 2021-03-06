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
import java.util.Date;
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

public class SgfensClienteVendedorDaoImpl extends AbstractDAO implements SgfensClienteVendedorDao
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
	protected final String SQL_SELECT = "SELECT ID_CLIENTE, ID_USUARIO_VENDEDOR, ID_USUARIO_CONDUCTOR_ASIGNADO, ID_USUARIO_VENDEDOR_REASIGNADO, FECHA_LIMITE_REASIGANCION FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_CLIENTE, ID_USUARIO_VENDEDOR, ID_USUARIO_CONDUCTOR_ASIGNADO, ID_USUARIO_VENDEDOR_REASIGNADO, FECHA_LIMITE_REASIGANCION ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_CLIENTE = ?, ID_USUARIO_VENDEDOR = ?, ID_USUARIO_CONDUCTOR_ASIGNADO = ?, ID_USUARIO_VENDEDOR_REASIGNADO = ?, FECHA_LIMITE_REASIGANCION = ? WHERE ID_CLIENTE = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_CLIENTE = ?";

	/** 
	 * Index of column ID_CLIENTE
	 */
	protected static final int COLUMN_ID_CLIENTE = 1;

	/** 
	 * Index of column ID_USUARIO_VENDEDOR
	 */
	protected static final int COLUMN_ID_USUARIO_VENDEDOR = 2;

	/** 
	 * Index of column ID_USUARIO_CONDUCTOR_ASIGNADO
	 */
	protected static final int COLUMN_ID_USUARIO_CONDUCTOR_ASIGNADO = 3;

	/** 
	 * Index of column ID_USUARIO_VENDEDOR_REASIGNADO
	 */
	protected static final int COLUMN_ID_USUARIO_VENDEDOR_REASIGNADO = 4;

	/** 
	 * Index of column FECHA_LIMITE_REASIGANCION
	 */
	protected static final int COLUMN_FECHA_LIMITE_REASIGANCION = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column ID_CLIENTE
	 */
	protected static final int PK_COLUMN_ID_CLIENTE = 1;

	/** 
	 * Inserts a new row in the sgfens_cliente_vendedor table.
	 */
	public SgfensClienteVendedorPk insert(SgfensClienteVendedor dto) throws SgfensClienteVendedorDaoException
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
			if (dto.isIdClienteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CLIENTE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdUsuarioVendedorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_USUARIO_VENDEDOR" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdUsuarioConductorAsignadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_USUARIO_CONDUCTOR_ASIGNADO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdUsuarioVendedorReasignadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_USUARIO_VENDEDOR_REASIGNADO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaLimiteReasigancionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_LIMITE_REASIGANCION" );
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
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdClienteModified()) {
				stmt.setInt( index++, dto.getIdCliente() );
			}
		
			if (dto.isIdUsuarioVendedorModified()) {
				stmt.setInt( index++, dto.getIdUsuarioVendedor() );
			}
		
			if (dto.isIdUsuarioConductorAsignadoModified()) {
				if (dto.isIdUsuarioConductorAsignadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdUsuarioConductorAsignado() );
				}
		
			}
		
			if (dto.isIdUsuarioVendedorReasignadoModified()) {
				if (dto.isIdUsuarioVendedorReasignadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdUsuarioVendedorReasignado() );
				}
		
			}
		
			if (dto.isFechaLimiteReasigancionModified()) {
				stmt.setTimestamp(index++, dto.getFechaLimiteReasigancion()==null ? null : new java.sql.Timestamp( dto.getFechaLimiteReasigancion().getTime() ) );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensClienteVendedorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the sgfens_cliente_vendedor table.
	 */
	public void update(SgfensClienteVendedorPk pk, SgfensClienteVendedor dto) throws SgfensClienteVendedorDaoException
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
			if (dto.isIdClienteModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CLIENTE=?" );
				modified=true;
			}
		
			if (dto.isIdUsuarioVendedorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_USUARIO_VENDEDOR=?" );
				modified=true;
			}
		
			if (dto.isIdUsuarioConductorAsignadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_USUARIO_CONDUCTOR_ASIGNADO=?" );
				modified=true;
			}
		
			if (dto.isIdUsuarioVendedorReasignadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_USUARIO_VENDEDOR_REASIGNADO=?" );
				modified=true;
			}
		
			if (dto.isFechaLimiteReasigancionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_LIMITE_REASIGANCION=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_CLIENTE=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdClienteModified()) {
				stmt.setInt( index++, dto.getIdCliente() );
			}
		
			if (dto.isIdUsuarioVendedorModified()) {
				stmt.setInt( index++, dto.getIdUsuarioVendedor() );
			}
		
			if (dto.isIdUsuarioConductorAsignadoModified()) {
				if (dto.isIdUsuarioConductorAsignadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdUsuarioConductorAsignado() );
				}
		
			}
		
			if (dto.isIdUsuarioVendedorReasignadoModified()) {
				if (dto.isIdUsuarioVendedorReasignadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdUsuarioVendedorReasignado() );
				}
		
			}
		
			if (dto.isFechaLimiteReasigancionModified()) {
				stmt.setTimestamp(index++, dto.getFechaLimiteReasigancion()==null ? null : new java.sql.Timestamp( dto.getFechaLimiteReasigancion().getTime() ) );
			}
		
			stmt.setInt( index++, pk.getIdCliente() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensClienteVendedorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the sgfens_cliente_vendedor table.
	 */
	public void delete(SgfensClienteVendedorPk pk) throws SgfensClienteVendedorDaoException
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
			stmt.setInt( 1, pk.getIdCliente() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensClienteVendedorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the sgfens_cliente_vendedor table that matches the specified primary-key value.
	 */
	public SgfensClienteVendedor findByPrimaryKey(SgfensClienteVendedorPk pk) throws SgfensClienteVendedorDaoException
	{
		return findByPrimaryKey( pk.getIdCliente() );
	}

	/** 
	 * Returns all rows from the sgfens_cliente_vendedor table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public SgfensClienteVendedor findByPrimaryKey(int idCliente) throws SgfensClienteVendedorDaoException
	{
		SgfensClienteVendedor ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_CLIENTE = ?", new Object[] {  new Integer(idCliente) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the sgfens_cliente_vendedor table that match the criteria ''.
	 */
	public SgfensClienteVendedor[] findAll() throws SgfensClienteVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_CLIENTE", null );
	}

	/** 
	 * Returns all rows from the sgfens_cliente_vendedor table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public SgfensClienteVendedor[] findWhereIdClienteEquals(int idCliente) throws SgfensClienteVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CLIENTE = ? ORDER BY ID_CLIENTE", new Object[] {  new Integer(idCliente) } );
	}

	/** 
	 * Returns all rows from the sgfens_cliente_vendedor table that match the criteria 'ID_USUARIO_VENDEDOR = :idUsuarioVendedor'.
	 */
	public SgfensClienteVendedor[] findWhereIdUsuarioVendedorEquals(int idUsuarioVendedor) throws SgfensClienteVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO_VENDEDOR = ? ORDER BY ID_USUARIO_VENDEDOR", new Object[] {  new Integer(idUsuarioVendedor) } );
	}

	/** 
	 * Returns all rows from the sgfens_cliente_vendedor table that match the criteria 'ID_USUARIO_CONDUCTOR_ASIGNADO = :idUsuarioConductorAsignado'.
	 */
	public SgfensClienteVendedor[] findWhereIdUsuarioConductorAsignadoEquals(int idUsuarioConductorAsignado) throws SgfensClienteVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO_CONDUCTOR_ASIGNADO = ? ORDER BY ID_USUARIO_CONDUCTOR_ASIGNADO", new Object[] {  new Integer(idUsuarioConductorAsignado) } );
	}

	/** 
	 * Returns all rows from the sgfens_cliente_vendedor table that match the criteria 'ID_USUARIO_VENDEDOR_REASIGNADO = :idUsuarioVendedorReasignado'.
	 */
	public SgfensClienteVendedor[] findWhereIdUsuarioVendedorReasignadoEquals(int idUsuarioVendedorReasignado) throws SgfensClienteVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO_VENDEDOR_REASIGNADO = ? ORDER BY ID_USUARIO_VENDEDOR_REASIGNADO", new Object[] {  new Integer(idUsuarioVendedorReasignado) } );
	}

	/** 
	 * Returns all rows from the sgfens_cliente_vendedor table that match the criteria 'FECHA_LIMITE_REASIGANCION = :fechaLimiteReasigancion'.
	 */
	public SgfensClienteVendedor[] findWhereFechaLimiteReasigancionEquals(Date fechaLimiteReasigancion) throws SgfensClienteVendedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_LIMITE_REASIGANCION = ? ORDER BY FECHA_LIMITE_REASIGANCION", new Object[] { fechaLimiteReasigancion==null ? null : new java.sql.Timestamp( fechaLimiteReasigancion.getTime() ) } );
	}

	/**
	 * Method 'SgfensClienteVendedorDaoImpl'
	 * 
	 */
	public SgfensClienteVendedorDaoImpl()
	{
	}

	/**
	 * Method 'SgfensClienteVendedorDaoImpl'
	 * 
	 * @param userConn
	 */
	public SgfensClienteVendedorDaoImpl(final java.sql.Connection userConn)
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
		return "sgfens_cliente_vendedor";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected SgfensClienteVendedor fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			SgfensClienteVendedor dto = new SgfensClienteVendedor();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected SgfensClienteVendedor[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			SgfensClienteVendedor dto = new SgfensClienteVendedor();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		SgfensClienteVendedor ret[] = new SgfensClienteVendedor[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(SgfensClienteVendedor dto, ResultSet rs) throws SQLException
	{
		dto.setIdCliente( rs.getInt( COLUMN_ID_CLIENTE ) );
		dto.setIdUsuarioVendedor( rs.getInt( COLUMN_ID_USUARIO_VENDEDOR ) );
		dto.setIdUsuarioConductorAsignado( rs.getInt( COLUMN_ID_USUARIO_CONDUCTOR_ASIGNADO ) );
		if (rs.wasNull()) {
			dto.setIdUsuarioConductorAsignadoNull( true );
		}
		
		dto.setIdUsuarioVendedorReasignado( rs.getInt( COLUMN_ID_USUARIO_VENDEDOR_REASIGNADO ) );
		if (rs.wasNull()) {
			dto.setIdUsuarioVendedorReasignadoNull( true );
		}
		
		dto.setFechaLimiteReasigancion( rs.getTimestamp(COLUMN_FECHA_LIMITE_REASIGANCION ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(SgfensClienteVendedor dto)
	{
		dto.setIdClienteModified( false );
		dto.setIdUsuarioVendedorModified( false );
		dto.setIdUsuarioConductorAsignadoModified( false );
		dto.setIdUsuarioVendedorReasignadoModified( false );
		dto.setFechaLimiteReasigancionModified( false );
	}

	/** 
	 * Returns all rows from the sgfens_cliente_vendedor table that match the specified arbitrary SQL statement
	 */
	public SgfensClienteVendedor[] findByDynamicSelect(String sql, Object[] sqlParams) throws SgfensClienteVendedorDaoException
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
		
		
			//System.out.println( "Executing " + SQL );
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
			throw new SgfensClienteVendedorDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the sgfens_cliente_vendedor table that match the specified arbitrary SQL statement
	 */
	public SgfensClienteVendedor[] findByDynamicWhere(String sql, Object[] sqlParams) throws SgfensClienteVendedorDaoException
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
		
		
			//System.out.println( "Executing " + SQL );
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
			throw new SgfensClienteVendedorDaoException( "Exception: " + _e.getMessage(), _e );
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
