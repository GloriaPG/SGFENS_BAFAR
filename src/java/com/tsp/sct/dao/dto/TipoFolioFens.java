/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dto;

import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.factory.*;
import com.tsp.sct.dao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class TipoFolioFens implements Serializable
{
	/** 
	 * This attribute maps to the column ID_TIPO_FOLIO_FENS in the tipo_folio_fens table.
	 */
	protected int idTipoFolioFens;

	/** 
	 * This attribute maps to the column NOMBRE in the tipo_folio_fens table.
	 */
	protected String nombre;

	/** 
	 * This attribute maps to the column DESCRIPCION in the tipo_folio_fens table.
	 */
	protected String descripcion;

	/**
	 * Method 'TipoFolioFens'
	 * 
	 */
	public TipoFolioFens()
	{
	}

	/**
	 * Method 'getIdTipoFolioFens'
	 * 
	 * @return int
	 */
	public int getIdTipoFolioFens()
	{
		return idTipoFolioFens;
	}

	/**
	 * Method 'setIdTipoFolioFens'
	 * 
	 * @param idTipoFolioFens
	 */
	public void setIdTipoFolioFens(int idTipoFolioFens)
	{
		this.idTipoFolioFens = idTipoFolioFens;
	}

	/**
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof TipoFolioFens)) {
			return false;
		}
		
		final TipoFolioFens _cast = (TipoFolioFens) _other;
		if (idTipoFolioFens != _cast.idTipoFolioFens) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idTipoFolioFens;
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return TipoFolioFensPk
	 */
	public TipoFolioFensPk createPk()
	{
		return new TipoFolioFensPk(idTipoFolioFens);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.TipoFolioFens: " );
		ret.append( "idTipoFolioFens=" + idTipoFolioFens );
		ret.append( ", nombre=" + nombre );
		ret.append( ", descripcion=" + descripcion );
		return ret.toString();
	}

}
