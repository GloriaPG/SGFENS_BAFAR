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

public interface FoliosCatalogoDao
{
	/** 
	 * Inserts a new row in the folios_catalogo table.
	 */
	public FoliosCatalogoPk insert(FoliosCatalogo dto) throws FoliosCatalogoDaoException;

	/** 
	 * Updates a single row in the folios_catalogo table.
	 */
	public void update(FoliosCatalogoPk pk, FoliosCatalogo dto) throws FoliosCatalogoDaoException;

	/** 
	 * Deletes a single row in the folios_catalogo table.
	 */
	public void delete(FoliosCatalogoPk pk) throws FoliosCatalogoDaoException;

	/** 
	 * Returns the rows from the folios_catalogo table that matches the specified primary-key value.
	 */
	public FoliosCatalogo findByPrimaryKey(FoliosCatalogoPk pk) throws FoliosCatalogoDaoException;

	/** 
	 * Returns all rows from the folios_catalogo table that match the criteria 'ID_PAQUETE = :idPaquete'.
	 */
	public FoliosCatalogo findByPrimaryKey(int idPaquete) throws FoliosCatalogoDaoException;

	/** 
	 * Returns all rows from the folios_catalogo table that match the criteria ''.
	 */
	public FoliosCatalogo[] findAll() throws FoliosCatalogoDaoException;

	/** 
	 * Returns all rows from the folios_catalogo table that match the criteria 'ID_PAQUETE = :idPaquete'.
	 */
	public FoliosCatalogo[] findWhereIdPaqueteEquals(int idPaquete) throws FoliosCatalogoDaoException;

	/** 
	 * Returns all rows from the folios_catalogo table that match the criteria 'FOLIOS_CATALOGO = :foliosCatalogo'.
	 */
	public FoliosCatalogo[] findWhereFoliosCatalogoEquals(int foliosCatalogo) throws FoliosCatalogoDaoException;

	/** 
	 * Returns all rows from the folios_catalogo table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public FoliosCatalogo[] findWhereDescripcionEquals(String descripcion) throws FoliosCatalogoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the folios_catalogo table that match the specified arbitrary SQL statement
	 */
	public FoliosCatalogo[] findByDynamicSelect(String sql, Object[] sqlParams) throws FoliosCatalogoDaoException;

	/** 
	 * Returns all rows from the folios_catalogo table that match the specified arbitrary SQL statement
	 */
	public FoliosCatalogo[] findByDynamicWhere(String sql, Object[] sqlParams) throws FoliosCatalogoDaoException;

}