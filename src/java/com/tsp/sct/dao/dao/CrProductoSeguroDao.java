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

public interface CrProductoSeguroDao
{
	/** 
	 * Inserts a new row in the cr_producto_seguro table.
	 */
	public CrProductoSeguroPk insert(CrProductoSeguro dto) throws CrProductoSeguroDaoException;

	/** 
	 * Updates a single row in the cr_producto_seguro table.
	 */
	public void update(CrProductoSeguroPk pk, CrProductoSeguro dto) throws CrProductoSeguroDaoException;

	/** 
	 * Deletes a single row in the cr_producto_seguro table.
	 */
	public void delete(CrProductoSeguroPk pk) throws CrProductoSeguroDaoException;

	/** 
	 * Returns the rows from the cr_producto_seguro table that matches the specified primary-key value.
	 */
	public CrProductoSeguro findByPrimaryKey(CrProductoSeguroPk pk) throws CrProductoSeguroDaoException;

	/** 
	 * Returns all rows from the cr_producto_seguro table that match the criteria 'id_producto_seguro = :idProductoSeguro'.
	 */
	public CrProductoSeguro findByPrimaryKey(int idProductoSeguro) throws CrProductoSeguroDaoException;

	/** 
	 * Returns all rows from the cr_producto_seguro table that match the criteria ''.
	 */
	public CrProductoSeguro[] findAll() throws CrProductoSeguroDaoException;

	/** 
	 * Returns all rows from the cr_producto_seguro table that match the criteria 'id_producto_seguro = :idProductoSeguro'.
	 */
	public CrProductoSeguro[] findWhereIdProductoSeguroEquals(int idProductoSeguro) throws CrProductoSeguroDaoException;

	/** 
	 * Returns all rows from the cr_producto_seguro table that match the criteria 'id_producto_credito = :idProductoCredito'.
	 */
	public CrProductoSeguro[] findWhereIdProductoCreditoEquals(int idProductoCredito) throws CrProductoSeguroDaoException;

	/** 
	 * Returns all rows from the cr_producto_seguro table that match the criteria 'is_obligatorio = :isObligatorio'.
	 */
	public CrProductoSeguro[] findWhereIsObligatorioEquals(int isObligatorio) throws CrProductoSeguroDaoException;

	/** 
	 * Returns all rows from the cr_producto_seguro table that match the criteria 'tipo_seguro = :tipoSeguro'.
	 */
	public CrProductoSeguro[] findWhereTipoSeguroEquals(String tipoSeguro) throws CrProductoSeguroDaoException;

	/** 
	 * Returns all rows from the cr_producto_seguro table that match the criteria 'aseguradora_nombre = :aseguradoraNombre'.
	 */
	public CrProductoSeguro[] findWhereAseguradoraNombreEquals(String aseguradoraNombre) throws CrProductoSeguroDaoException;

	/** 
	 * Returns all rows from the cr_producto_seguro table that match the criteria 'id_estatus = :idEstatus'.
	 */
	public CrProductoSeguro[] findWhereIdEstatusEquals(int idEstatus) throws CrProductoSeguroDaoException;

	/** 
	 * Returns all rows from the cr_producto_seguro table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public CrProductoSeguro[] findWhereIdEmpresaEquals(int idEmpresa) throws CrProductoSeguroDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the cr_producto_seguro table that match the specified arbitrary SQL statement
	 */
	public CrProductoSeguro[] findByDynamicSelect(String sql, Object[] sqlParams) throws CrProductoSeguroDaoException;

	/** 
	 * Returns all rows from the cr_producto_seguro table that match the specified arbitrary SQL statement
	 */
	public CrProductoSeguro[] findByDynamicWhere(String sql, Object[] sqlParams) throws CrProductoSeguroDaoException;

}