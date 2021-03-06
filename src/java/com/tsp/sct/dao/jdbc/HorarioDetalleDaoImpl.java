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

public class HorarioDetalleDaoImpl extends AbstractDAO implements HorarioDetalleDao
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
	protected final String SQL_SELECT = "SELECT ID_DETALLE_HORARIO, ID_HORARIO, DIA, HORA_ENTRADA, HORA_SALIDA, DIA_DESCANSO, COMIDA_SALIDA, COMIDA_ENTRADA, PERIODO_COMIDA, TOLERANCIA FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_DETALLE_HORARIO, ID_HORARIO, DIA, HORA_ENTRADA, HORA_SALIDA, DIA_DESCANSO, COMIDA_SALIDA, COMIDA_ENTRADA, PERIODO_COMIDA, TOLERANCIA ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_DETALLE_HORARIO = ?, ID_HORARIO = ?, DIA = ?, HORA_ENTRADA = ?, HORA_SALIDA = ?, DIA_DESCANSO = ?, COMIDA_SALIDA = ?, COMIDA_ENTRADA = ?, PERIODO_COMIDA = ?, TOLERANCIA = ? WHERE ID_DETALLE_HORARIO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_DETALLE_HORARIO = ?";

	/** 
	 * Index of column ID_DETALLE_HORARIO
	 */
	protected static final int COLUMN_ID_DETALLE_HORARIO = 1;

	/** 
	 * Index of column ID_HORARIO
	 */
	protected static final int COLUMN_ID_HORARIO = 2;

	/** 
	 * Index of column DIA
	 */
	protected static final int COLUMN_DIA = 3;

	/** 
	 * Index of column HORA_ENTRADA
	 */
	protected static final int COLUMN_HORA_ENTRADA = 4;

	/** 
	 * Index of column HORA_SALIDA
	 */
	protected static final int COLUMN_HORA_SALIDA = 5;

	/** 
	 * Index of column DIA_DESCANSO
	 */
	protected static final int COLUMN_DIA_DESCANSO = 6;

	/** 
	 * Index of column COMIDA_SALIDA
	 */
	protected static final int COLUMN_COMIDA_SALIDA = 7;

	/** 
	 * Index of column COMIDA_ENTRADA
	 */
	protected static final int COLUMN_COMIDA_ENTRADA = 8;

	/** 
	 * Index of column PERIODO_COMIDA
	 */
	protected static final int COLUMN_PERIODO_COMIDA = 9;

	/** 
	 * Index of column TOLERANCIA
	 */
	protected static final int COLUMN_TOLERANCIA = 10;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 10;

	/** 
	 * Index of primary-key column ID_DETALLE_HORARIO
	 */
	protected static final int PK_COLUMN_ID_DETALLE_HORARIO = 1;

	/** 
	 * Inserts a new row in the horario_detalle table.
	 */
	public HorarioDetallePk insert(HorarioDetalle dto) throws HorarioDetalleDaoException
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
			if (dto.isIdDetalleHorarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_DETALLE_HORARIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdHorarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_HORARIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDiaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DIA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isHoraEntradaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "HORA_ENTRADA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isHoraSalidaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "HORA_SALIDA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDiaDescansoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DIA_DESCANSO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isComidaSalidaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "COMIDA_SALIDA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isComidaEntradaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "COMIDA_ENTRADA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isPeriodoComidaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "PERIODO_COMIDA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isToleranciaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "TOLERANCIA" );
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
			if (dto.isIdDetalleHorarioModified()) {
				stmt.setInt( index++, dto.getIdDetalleHorario() );
			}
		
			if (dto.isIdHorarioModified()) {
				stmt.setInt( index++, dto.getIdHorario() );
			}
		
			if (dto.isDiaModified()) {
				stmt.setString( index++, dto.getDia() );
			}
		
			if (dto.isHoraEntradaModified()) {
				stmt.setTime(index++, dto.getHoraEntrada()==null ? null : new java.sql.Time( dto.getHoraEntrada().getTime() ) );
			}
		
			if (dto.isHoraSalidaModified()) {
				stmt.setTime(index++, dto.getHoraSalida()==null ? null : new java.sql.Time( dto.getHoraSalida().getTime() ) );
			}
		
			if (dto.isDiaDescansoModified()) {
				if (dto.isDiaDescansoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getDiaDescanso() );
				}
		
			}
		
			if (dto.isComidaSalidaModified()) {
				stmt.setTime(index++, dto.getComidaSalida()==null ? null : new java.sql.Time( dto.getComidaSalida().getTime() ) );
			}
		
			if (dto.isComidaEntradaModified()) {
				stmt.setTime(index++, dto.getComidaEntrada()==null ? null : new java.sql.Time( dto.getComidaEntrada().getTime() ) );
			}
		
			if (dto.isPeriodoComidaModified()) {
				if (dto.isPeriodoComidaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getPeriodoComida() );
				}
		
			}
		
			if (dto.isToleranciaModified()) {
				if (dto.isToleranciaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getTolerancia() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdDetalleHorario( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new HorarioDetalleDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the horario_detalle table.
	 */
	public void update(HorarioDetallePk pk, HorarioDetalle dto) throws HorarioDetalleDaoException
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
			if (dto.isIdDetalleHorarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_DETALLE_HORARIO=?" );
				modified=true;
			}
		
			if (dto.isIdHorarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_HORARIO=?" );
				modified=true;
			}
		
			if (dto.isDiaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DIA=?" );
				modified=true;
			}
		
			if (dto.isHoraEntradaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "HORA_ENTRADA=?" );
				modified=true;
			}
		
			if (dto.isHoraSalidaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "HORA_SALIDA=?" );
				modified=true;
			}
		
			if (dto.isDiaDescansoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DIA_DESCANSO=?" );
				modified=true;
			}
		
			if (dto.isComidaSalidaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "COMIDA_SALIDA=?" );
				modified=true;
			}
		
			if (dto.isComidaEntradaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "COMIDA_ENTRADA=?" );
				modified=true;
			}
		
			if (dto.isPeriodoComidaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PERIODO_COMIDA=?" );
				modified=true;
			}
		
			if (dto.isToleranciaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TOLERANCIA=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_DETALLE_HORARIO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdDetalleHorarioModified()) {
				stmt.setInt( index++, dto.getIdDetalleHorario() );
			}
		
			if (dto.isIdHorarioModified()) {
				stmt.setInt( index++, dto.getIdHorario() );
			}
		
			if (dto.isDiaModified()) {
				stmt.setString( index++, dto.getDia() );
			}
		
			if (dto.isHoraEntradaModified()) {
				stmt.setTime(index++, dto.getHoraEntrada()==null ? null : new java.sql.Time( dto.getHoraEntrada().getTime() ) );
			}
		
			if (dto.isHoraSalidaModified()) {
				stmt.setTime(index++, dto.getHoraSalida()==null ? null : new java.sql.Time( dto.getHoraSalida().getTime() ) );
			}
		
			if (dto.isDiaDescansoModified()) {
				if (dto.isDiaDescansoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getDiaDescanso() );
				}
		
			}
		
			if (dto.isComidaSalidaModified()) {
				stmt.setTime(index++, dto.getComidaSalida()==null ? null : new java.sql.Time( dto.getComidaSalida().getTime() ) );
			}
		
			if (dto.isComidaEntradaModified()) {
				stmt.setTime(index++, dto.getComidaEntrada()==null ? null : new java.sql.Time( dto.getComidaEntrada().getTime() ) );
			}
		
			if (dto.isPeriodoComidaModified()) {
				if (dto.isPeriodoComidaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getPeriodoComida() );
				}
		
			}
		
			if (dto.isToleranciaModified()) {
				if (dto.isToleranciaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getTolerancia() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdDetalleHorario() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new HorarioDetalleDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the horario_detalle table.
	 */
	public void delete(HorarioDetallePk pk) throws HorarioDetalleDaoException
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
			stmt.setInt( 1, pk.getIdDetalleHorario() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new HorarioDetalleDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the horario_detalle table that matches the specified primary-key value.
	 */
	public HorarioDetalle findByPrimaryKey(HorarioDetallePk pk) throws HorarioDetalleDaoException
	{
		return findByPrimaryKey( pk.getIdDetalleHorario() );
	}

	/** 
	 * Returns all rows from the horario_detalle table that match the criteria 'ID_DETALLE_HORARIO = :idDetalleHorario'.
	 */
	public HorarioDetalle findByPrimaryKey(int idDetalleHorario) throws HorarioDetalleDaoException
	{
		HorarioDetalle ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_DETALLE_HORARIO = ?", new Object[] {  new Integer(idDetalleHorario) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the horario_detalle table that match the criteria ''.
	 */
	public HorarioDetalle[] findAll() throws HorarioDetalleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_DETALLE_HORARIO", null );
	}

	/** 
	 * Returns all rows from the horario_detalle table that match the criteria 'ID_DETALLE_HORARIO = :idDetalleHorario'.
	 */
	public HorarioDetalle[] findWhereIdDetalleHorarioEquals(int idDetalleHorario) throws HorarioDetalleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_DETALLE_HORARIO = ? ORDER BY ID_DETALLE_HORARIO", new Object[] {  new Integer(idDetalleHorario) } );
	}

	/** 
	 * Returns all rows from the horario_detalle table that match the criteria 'ID_HORARIO = :idHorario'.
	 */
	public HorarioDetalle[] findWhereIdHorarioEquals(int idHorario) throws HorarioDetalleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_HORARIO = ? ORDER BY ID_HORARIO", new Object[] {  new Integer(idHorario) } );
	}

	/** 
	 * Returns all rows from the horario_detalle table that match the criteria 'DIA = :dia'.
	 */
	public HorarioDetalle[] findWhereDiaEquals(String dia) throws HorarioDetalleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DIA = ? ORDER BY DIA", new Object[] { dia } );
	}

	/** 
	 * Returns all rows from the horario_detalle table that match the criteria 'HORA_ENTRADA = :horaEntrada'.
	 */
	public HorarioDetalle[] findWhereHoraEntradaEquals(Date horaEntrada) throws HorarioDetalleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE HORA_ENTRADA = ? ORDER BY HORA_ENTRADA", new Object[] { horaEntrada==null ? null : new java.sql.Time( horaEntrada.getTime() ) } );
	}

	/** 
	 * Returns all rows from the horario_detalle table that match the criteria 'HORA_SALIDA = :horaSalida'.
	 */
	public HorarioDetalle[] findWhereHoraSalidaEquals(Date horaSalida) throws HorarioDetalleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE HORA_SALIDA = ? ORDER BY HORA_SALIDA", new Object[] { horaSalida==null ? null : new java.sql.Time( horaSalida.getTime() ) } );
	}

	/** 
	 * Returns all rows from the horario_detalle table that match the criteria 'DIA_DESCANSO = :diaDescanso'.
	 */
	public HorarioDetalle[] findWhereDiaDescansoEquals(int diaDescanso) throws HorarioDetalleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DIA_DESCANSO = ? ORDER BY DIA_DESCANSO", new Object[] {  new Integer(diaDescanso) } );
	}

	/** 
	 * Returns all rows from the horario_detalle table that match the criteria 'COMIDA_SALIDA = :comidaSalida'.
	 */
	public HorarioDetalle[] findWhereComidaSalidaEquals(Date comidaSalida) throws HorarioDetalleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COMIDA_SALIDA = ? ORDER BY COMIDA_SALIDA", new Object[] { comidaSalida==null ? null : new java.sql.Time( comidaSalida.getTime() ) } );
	}

	/** 
	 * Returns all rows from the horario_detalle table that match the criteria 'COMIDA_ENTRADA = :comidaEntrada'.
	 */
	public HorarioDetalle[] findWhereComidaEntradaEquals(Date comidaEntrada) throws HorarioDetalleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COMIDA_ENTRADA = ? ORDER BY COMIDA_ENTRADA", new Object[] { comidaEntrada==null ? null : new java.sql.Time( comidaEntrada.getTime() ) } );
	}

	/** 
	 * Returns all rows from the horario_detalle table that match the criteria 'PERIODO_COMIDA = :periodoComida'.
	 */
	public HorarioDetalle[] findWherePeriodoComidaEquals(int periodoComida) throws HorarioDetalleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PERIODO_COMIDA = ? ORDER BY PERIODO_COMIDA", new Object[] {  new Integer(periodoComida) } );
	}

	/** 
	 * Returns all rows from the horario_detalle table that match the criteria 'TOLERANCIA = :tolerancia'.
	 */
	public HorarioDetalle[] findWhereToleranciaEquals(int tolerancia) throws HorarioDetalleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TOLERANCIA = ? ORDER BY TOLERANCIA", new Object[] {  new Integer(tolerancia) } );
	}

	/**
	 * Method 'HorarioDetalleDaoImpl'
	 * 
	 */
	public HorarioDetalleDaoImpl()
	{
	}

	/**
	 * Method 'HorarioDetalleDaoImpl'
	 * 
	 * @param userConn
	 */
	public HorarioDetalleDaoImpl(final java.sql.Connection userConn)
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
		return "horario_detalle";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected HorarioDetalle fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			HorarioDetalle dto = new HorarioDetalle();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected HorarioDetalle[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			HorarioDetalle dto = new HorarioDetalle();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		HorarioDetalle ret[] = new HorarioDetalle[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(HorarioDetalle dto, ResultSet rs) throws SQLException
	{
		dto.setIdDetalleHorario( rs.getInt( COLUMN_ID_DETALLE_HORARIO ) );
		dto.setIdHorario( rs.getInt( COLUMN_ID_HORARIO ) );
		dto.setDia( rs.getString( COLUMN_DIA ) );
		dto.setHoraEntrada( rs.getTime(COLUMN_HORA_ENTRADA ) );
		dto.setHoraSalida( rs.getTime(COLUMN_HORA_SALIDA ) );
		dto.setDiaDescanso( rs.getInt( COLUMN_DIA_DESCANSO ) );
		if (rs.wasNull()) {
			dto.setDiaDescansoNull( true );
		}
		
		dto.setComidaSalida( rs.getTime(COLUMN_COMIDA_SALIDA ) );
		dto.setComidaEntrada( rs.getTime(COLUMN_COMIDA_ENTRADA ) );
		dto.setPeriodoComida( rs.getInt( COLUMN_PERIODO_COMIDA ) );
		if (rs.wasNull()) {
			dto.setPeriodoComidaNull( true );
		}
		
		dto.setTolerancia( rs.getInt( COLUMN_TOLERANCIA ) );
		if (rs.wasNull()) {
			dto.setToleranciaNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(HorarioDetalle dto)
	{
		dto.setIdDetalleHorarioModified( false );
		dto.setIdHorarioModified( false );
		dto.setDiaModified( false );
		dto.setHoraEntradaModified( false );
		dto.setHoraSalidaModified( false );
		dto.setDiaDescansoModified( false );
		dto.setComidaSalidaModified( false );
		dto.setComidaEntradaModified( false );
		dto.setPeriodoComidaModified( false );
		dto.setToleranciaModified( false );
	}

	/** 
	 * Returns all rows from the horario_detalle table that match the specified arbitrary SQL statement
	 */
	public HorarioDetalle[] findByDynamicSelect(String sql, Object[] sqlParams) throws HorarioDetalleDaoException
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
			throw new HorarioDetalleDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the horario_detalle table that match the specified arbitrary SQL statement
	 */
	public HorarioDetalle[] findByDynamicWhere(String sql, Object[] sqlParams) throws HorarioDetalleDaoException
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
			throw new HorarioDetalleDaoException( "Exception: " + _e.getMessage(), _e );
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
