/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dao;

import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;

public interface QuartzMovimientoDao
{
	/** 
	 * Inserts a new row in the quartz_movimiento table.
	 */
	public QuartzMovimientoPk insert(QuartzMovimiento dto) throws QuartzMovimientoDaoException;

	/** 
	 * Updates a single row in the quartz_movimiento table.
	 */
	public void update(QuartzMovimientoPk pk, QuartzMovimiento dto) throws QuartzMovimientoDaoException;

	/** 
	 * Deletes a single row in the quartz_movimiento table.
	 */
	public void delete(QuartzMovimientoPk pk) throws QuartzMovimientoDaoException;

	/** 
	 * Returns the rows from the quartz_movimiento table that matches the specified primary-key value.
	 */
	public QuartzMovimiento findByPrimaryKey(QuartzMovimientoPk pk) throws QuartzMovimientoDaoException;

	/** 
	 * Returns all rows from the quartz_movimiento table that match the criteria 'ID_QUARTZ = :idQuartz'.
	 */
	public QuartzMovimiento findByPrimaryKey(int idQuartz) throws QuartzMovimientoDaoException;

	/** 
	 * Returns all rows from the quartz_movimiento table that match the criteria ''.
	 */
	public QuartzMovimiento[] findAll() throws QuartzMovimientoDaoException;

	/** 
	 * Returns all rows from the quartz_movimiento table that match the criteria 'ID_QUARTZ = :idQuartz'.
	 */
	public QuartzMovimiento[] findWhereIdQuartzEquals(int idQuartz) throws QuartzMovimientoDaoException;

	/** 
	 * Returns all rows from the quartz_movimiento table that match the criteria 'ID_MOVIMIENTO_EVC = :idMovimientoEvc'.
	 */
	public QuartzMovimiento[] findWhereIdMovimientoEvcEquals(int idMovimientoEvc) throws QuartzMovimientoDaoException;

	/** 
	 * Returns all rows from the quartz_movimiento table that match the criteria 'ID_MOVIMIENTO_SISTEM_TERCERO = :idMovimientoSistemTercero'.
	 */
	public QuartzMovimiento[] findWhereIdMovimientoSistemTerceroEquals(int idMovimientoSistemTercero) throws QuartzMovimientoDaoException;

	/** 
	 * Returns all rows from the quartz_movimiento table that match the criteria 'CLAVE = :clave'.
	 */
	public QuartzMovimiento[] findWhereClaveEquals(String clave) throws QuartzMovimientoDaoException;

	/** 
	 * Returns all rows from the quartz_movimiento table that match the criteria 'ID_SISTEMA_TERCERO = :idSistemaTercero'.
	 */
	public QuartzMovimiento[] findWhereIdSistemaTerceroEquals(int idSistemaTercero) throws QuartzMovimientoDaoException;

	/** 
	 * Returns all rows from the quartz_movimiento table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public QuartzMovimiento[] findWhereIdEmpresaEquals(int idEmpresa) throws QuartzMovimientoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the quartz_movimiento table that match the specified arbitrary SQL statement
	 */
	public QuartzMovimiento[] findByDynamicSelect(String sql, Object[] sqlParams) throws QuartzMovimientoDaoException;

	/** 
	 * Returns all rows from the quartz_movimiento table that match the specified arbitrary SQL statement
	 */
	public QuartzMovimiento[] findByDynamicWhere(String sql, Object[] sqlParams) throws QuartzMovimientoDaoException;

}
