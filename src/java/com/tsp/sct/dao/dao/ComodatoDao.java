/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dao;

import java.util.Date;
import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;

public interface ComodatoDao
{
	/** 
	 * Inserts a new row in the comodato table.
	 */
	public ComodatoPk insert(Comodato dto) throws ComodatoDaoException;

	/** 
	 * Updates a single row in the comodato table.
	 */
	public void update(ComodatoPk pk, Comodato dto) throws ComodatoDaoException;

	/** 
	 * Deletes a single row in the comodato table.
	 */
	public void delete(ComodatoPk pk) throws ComodatoDaoException;

	/** 
	 * Returns the rows from the comodato table that matches the specified primary-key value.
	 */
	public Comodato findByPrimaryKey(ComodatoPk pk) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ID_COMODATO = :idComodato'.
	 */
	public Comodato findByPrimaryKey(int idComodato) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria ''.
	 */
	public Comodato[] findAll() throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ID_COMODATO = :idComodato'.
	 */
	public Comodato[] findWhereIdComodatoEquals(int idComodato) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Comodato[] findWhereIdEmpresaEquals(int idEmpresa) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'FECHA_CREACION = :fechaCreacion'.
	 */
	public Comodato[] findWhereFechaCreacionEquals(Date fechaCreacion) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'NOMBRE = :nombre'.
	 */
	public Comodato[] findWhereNombreEquals(String nombre) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public Comodato[] findWhereDescripcionEquals(String descripcion) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'NUMERO_SERIE = :numeroSerie'.
	 */
	public Comodato[] findWhereNumeroSerieEquals(String numeroSerie) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'MARCA = :marca'.
	 */
	public Comodato[] findWhereMarcaEquals(String marca) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'MODELO = :modelo'.
	 */
	public Comodato[] findWhereModeloEquals(String modelo) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'TIPO = :tipo'.
	 */
	public Comodato[] findWhereTipoEquals(String tipo) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'CAPACIDAD = :capacidad'.
	 */
	public Comodato[] findWhereCapacidadEquals(String capacidad) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ESTADO = :estado'.
	 */
	public Comodato[] findWhereEstadoEquals(int estado) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ESTATUS = :estatus'.
	 */
	public Comodato[] findWhereEstatusEquals(int estatus) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ID_ALMACEN = :idAlmacen'.
	 */
	public Comodato[] findWhereIdAlmacenEquals(int idAlmacen) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public Comodato[] findWhereIdClienteEquals(int idCliente) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'FECHA_ASIGNACION_CLIENTE = :fechaAsignacionCliente'.
	 */
	public Comodato[] findWhereFechaAsignacionClienteEquals(Date fechaAsignacionCliente) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'NOMBRE_RECIBE = :nombreRecibe'.
	 */
	public Comodato[] findWhereNombreRecibeEquals(String nombreRecibe) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'DIRECCION_RESGUARDO = :direccionResguardo'.
	 */
	public Comodato[] findWhereDireccionResguardoEquals(String direccionResguardo) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ID_USUARIO_VENDEDOR = :idUsuarioVendedor'.
	 */
	public Comodato[] findWhereIdUsuarioVendedorEquals(int idUsuarioVendedor) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'CONTRATO_NOMBRE_ARCHIVO = :contratoNombreArchivo'.
	 */
	public Comodato[] findWhereContratoNombreArchivoEquals(String contratoNombreArchivo) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the criteria 'FECHA_SUBIDA_CONTRATO = :fechaSubidaContrato'.
	 */
	public Comodato[] findWhereFechaSubidaContratoEquals(Date fechaSubidaContrato) throws ComodatoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the comodato table that match the specified arbitrary SQL statement
	 */
	public Comodato[] findByDynamicSelect(String sql, Object[] sqlParams) throws ComodatoDaoException;

	/** 
	 * Returns all rows from the comodato table that match the specified arbitrary SQL statement
	 */
	public Comodato[] findByDynamicWhere(String sql, Object[] sqlParams) throws ComodatoDaoException;

}