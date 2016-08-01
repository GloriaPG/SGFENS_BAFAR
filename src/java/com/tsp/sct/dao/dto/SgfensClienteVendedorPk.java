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
 * This class represents the primary key of the sgfens_cliente_vendedor table.
 */
public class SgfensClienteVendedorPk implements Serializable
{
	protected int idCliente;

	/** 
	 * This attribute represents whether the primitive attribute idCliente is null.
	 */
	protected boolean idClienteNull;

	/** 
	 * Sets the value of idCliente
	 */
	public void setIdCliente(int idCliente)
	{
		this.idCliente = idCliente;
	}

	/** 
	 * Gets the value of idCliente
	 */
	public int getIdCliente()
	{
		return idCliente;
	}

	/**
	 * Method 'SgfensClienteVendedorPk'
	 * 
	 */
	public SgfensClienteVendedorPk()
	{
	}

	/**
	 * Method 'SgfensClienteVendedorPk'
	 * 
	 * @param idCliente
	 */
	public SgfensClienteVendedorPk(final int idCliente)
	{
		this.idCliente = idCliente;
	}

	/** 
	 * Sets the value of idClienteNull
	 */
	public void setIdClienteNull(boolean idClienteNull)
	{
		this.idClienteNull = idClienteNull;
	}

	/** 
	 * Gets the value of idClienteNull
	 */
	public boolean isIdClienteNull()
	{
		return idClienteNull;
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
		
		if (!(_other instanceof SgfensClienteVendedorPk)) {
			return false;
		}
		
		final SgfensClienteVendedorPk _cast = (SgfensClienteVendedorPk) _other;
		if (idCliente != _cast.idCliente) {
			return false;
		}
		
		if (idClienteNull != _cast.idClienteNull) {
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
		_hashCode = 29 * _hashCode + idCliente;
		_hashCode = 29 * _hashCode + (idClienteNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.SgfensClienteVendedorPk: " );
		ret.append( "idCliente=" + idCliente );
		return ret.toString();
	}

}