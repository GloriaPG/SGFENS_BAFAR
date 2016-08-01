/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the mtz_seguridad table.
 */
public class MtzSeguridadPk implements Serializable
{
	protected int idMtzSeguridad;

	/** 
	 * This attribute represents whether the primitive attribute idMtzSeguridad is null.
	 */
	protected boolean idMtzSeguridadNull;

	/** 
	 * Sets the value of idMtzSeguridad
	 */
	public void setIdMtzSeguridad(int idMtzSeguridad)
	{
		this.idMtzSeguridad = idMtzSeguridad;
	}

	/** 
	 * Gets the value of idMtzSeguridad
	 */
	public int getIdMtzSeguridad()
	{
		return idMtzSeguridad;
	}

	/**
	 * Method 'MtzSeguridadPk'
	 * 
	 */
	public MtzSeguridadPk()
	{
	}

	/**
	 * Method 'MtzSeguridadPk'
	 * 
	 * @param idMtzSeguridad
	 */
	public MtzSeguridadPk(final int idMtzSeguridad)
	{
		this.idMtzSeguridad = idMtzSeguridad;
	}

	/** 
	 * Sets the value of idMtzSeguridadNull
	 */
	public void setIdMtzSeguridadNull(boolean idMtzSeguridadNull)
	{
		this.idMtzSeguridadNull = idMtzSeguridadNull;
	}

	/** 
	 * Gets the value of idMtzSeguridadNull
	 */
	public boolean isIdMtzSeguridadNull()
	{
		return idMtzSeguridadNull;
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
		
		if (!(_other instanceof MtzSeguridadPk)) {
			return false;
		}
		
		final MtzSeguridadPk _cast = (MtzSeguridadPk) _other;
		if (idMtzSeguridad != _cast.idMtzSeguridad) {
			return false;
		}
		
		if (idMtzSeguridadNull != _cast.idMtzSeguridadNull) {
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
		_hashCode = 29 * _hashCode + idMtzSeguridad;
		_hashCode = 29 * _hashCode + (idMtzSeguridadNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.MtzSeguridadPk: " );
		ret.append( "idMtzSeguridad=" + idMtzSeguridad );
		return ret.toString();
	}

}