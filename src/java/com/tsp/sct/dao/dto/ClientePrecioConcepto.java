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

public class ClientePrecioConcepto implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CONCEPTO in the cliente_precio_concepto table.
	 */
	protected int idConcepto;

	/** 
	 * This attribute represents whether the attribute idConcepto has been modified since being read from the database.
	 */
	protected boolean idConceptoModified = false;

	/** 
	 * This attribute maps to the column ID_CLIENTE in the cliente_precio_concepto table.
	 */
	protected int idCliente;

	/** 
	 * This attribute represents whether the attribute idCliente has been modified since being read from the database.
	 */
	protected boolean idClienteModified = false;

	/** 
	 * This attribute maps to the column PRECIO_UNITARIO_CLIENTE in the cliente_precio_concepto table.
	 */
	protected double precioUnitarioCliente;

	/** 
	 * This attribute represents whether the primitive attribute precioUnitarioCliente is null.
	 */
	protected boolean precioUnitarioClienteNull = true;

	/** 
	 * This attribute represents whether the attribute precioUnitarioCliente has been modified since being read from the database.
	 */
	protected boolean precioUnitarioClienteModified = false;

	/** 
	 * This attribute maps to the column PRECIO_MEDIO_CLIENTE in the cliente_precio_concepto table.
	 */
	protected double precioMedioCliente;

	/** 
	 * This attribute represents whether the primitive attribute precioMedioCliente is null.
	 */
	protected boolean precioMedioClienteNull = true;

	/** 
	 * This attribute represents whether the attribute precioMedioCliente has been modified since being read from the database.
	 */
	protected boolean precioMedioClienteModified = false;

	/** 
	 * This attribute maps to the column PRECIO_MAYOREO_CLIENTE in the cliente_precio_concepto table.
	 */
	protected double precioMayoreoCliente;

	/** 
	 * This attribute represents whether the primitive attribute precioMayoreoCliente is null.
	 */
	protected boolean precioMayoreoClienteNull = true;

	/** 
	 * This attribute represents whether the attribute precioMayoreoCliente has been modified since being read from the database.
	 */
	protected boolean precioMayoreoClienteModified = false;

	/** 
	 * This attribute maps to the column PRECIO_ESPECIAL_CLIENTE in the cliente_precio_concepto table.
	 */
	protected double precioEspecialCliente;

	/** 
	 * This attribute represents whether the primitive attribute precioEspecialCliente is null.
	 */
	protected boolean precioEspecialClienteNull = true;

	/** 
	 * This attribute represents whether the attribute precioEspecialCliente has been modified since being read from the database.
	 */
	protected boolean precioEspecialClienteModified = false;

	/** 
	 * This attribute maps to the column PRECIO_DOCENA_CLIENTE in the cliente_precio_concepto table.
	 */
	protected double precioDocenaCliente;

	/** 
	 * This attribute represents whether the primitive attribute precioDocenaCliente is null.
	 */
	protected boolean precioDocenaClienteNull = true;

	/** 
	 * This attribute represents whether the attribute precioDocenaCliente has been modified since being read from the database.
	 */
	protected boolean precioDocenaClienteModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the cliente_precio_concepto table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the primitive attribute idEstatus is null.
	 */
	protected boolean idEstatusNull = true;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/** 
	 * This attribute maps to the column PRECIO_UNITARIO_GRANEL_CLIENTE in the cliente_precio_concepto table.
	 */
	protected double precioUnitarioGranelCliente;

	/** 
	 * This attribute represents whether the primitive attribute precioUnitarioGranelCliente is null.
	 */
	protected boolean precioUnitarioGranelClienteNull = true;

	/** 
	 * This attribute represents whether the attribute precioUnitarioGranelCliente has been modified since being read from the database.
	 */
	protected boolean precioUnitarioGranelClienteModified = false;

	/** 
	 * This attribute maps to the column PRECIO_MEDIO_GRANEL_CLIENTE in the cliente_precio_concepto table.
	 */
	protected double precioMedioGranelCliente;

	/** 
	 * This attribute represents whether the primitive attribute precioMedioGranelCliente is null.
	 */
	protected boolean precioMedioGranelClienteNull = true;

	/** 
	 * This attribute represents whether the attribute precioMedioGranelCliente has been modified since being read from the database.
	 */
	protected boolean precioMedioGranelClienteModified = false;

	/** 
	 * This attribute maps to the column PRECIO_MAYOREO_GRANEL_CLIENTE in the cliente_precio_concepto table.
	 */
	protected double precioMayoreoGranelCliente;

	/** 
	 * This attribute represents whether the primitive attribute precioMayoreoGranelCliente is null.
	 */
	protected boolean precioMayoreoGranelClienteNull = true;

	/** 
	 * This attribute represents whether the attribute precioMayoreoGranelCliente has been modified since being read from the database.
	 */
	protected boolean precioMayoreoGranelClienteModified = false;

	/** 
	 * This attribute maps to the column PRECIO_ESPECIAL_GRANEL_CLIENTE in the cliente_precio_concepto table.
	 */
	protected double precioEspecialGranelCliente;

	/** 
	 * This attribute represents whether the primitive attribute precioEspecialGranelCliente is null.
	 */
	protected boolean precioEspecialGranelClienteNull = true;

	/** 
	 * This attribute represents whether the attribute precioEspecialGranelCliente has been modified since being read from the database.
	 */
	protected boolean precioEspecialGranelClienteModified = false;

	/**
	 * Method 'ClientePrecioConcepto'
	 * 
	 */
	public ClientePrecioConcepto()
	{
	}

	/**
	 * Method 'getIdConcepto'
	 * 
	 * @return int
	 */
	public int getIdConcepto()
	{
		return idConcepto;
	}

	/**
	 * Method 'setIdConcepto'
	 * 
	 * @param idConcepto
	 */
	public void setIdConcepto(int idConcepto)
	{
		this.idConcepto = idConcepto;
		this.idConceptoModified = true;
	}

	/** 
	 * Sets the value of idConceptoModified
	 */
	public void setIdConceptoModified(boolean idConceptoModified)
	{
		this.idConceptoModified = idConceptoModified;
	}

	/** 
	 * Gets the value of idConceptoModified
	 */
	public boolean isIdConceptoModified()
	{
		return idConceptoModified;
	}

	/**
	 * Method 'getIdCliente'
	 * 
	 * @return int
	 */
	public int getIdCliente()
	{
		return idCliente;
	}

	/**
	 * Method 'setIdCliente'
	 * 
	 * @param idCliente
	 */
	public void setIdCliente(int idCliente)
	{
		this.idCliente = idCliente;
		this.idClienteModified = true;
	}

	/** 
	 * Sets the value of idClienteModified
	 */
	public void setIdClienteModified(boolean idClienteModified)
	{
		this.idClienteModified = idClienteModified;
	}

	/** 
	 * Gets the value of idClienteModified
	 */
	public boolean isIdClienteModified()
	{
		return idClienteModified;
	}

	/**
	 * Method 'getPrecioUnitarioCliente'
	 * 
	 * @return double
	 */
	public double getPrecioUnitarioCliente()
	{
		return precioUnitarioCliente;
	}

	/**
	 * Method 'setPrecioUnitarioCliente'
	 * 
	 * @param precioUnitarioCliente
	 */
	public void setPrecioUnitarioCliente(double precioUnitarioCliente)
	{
		this.precioUnitarioCliente = precioUnitarioCliente;
		this.precioUnitarioClienteNull = false;
		this.precioUnitarioClienteModified = true;
	}

	/**
	 * Method 'setPrecioUnitarioClienteNull'
	 * 
	 * @param value
	 */
	public void setPrecioUnitarioClienteNull(boolean value)
	{
		this.precioUnitarioClienteNull = value;
		this.precioUnitarioClienteModified = true;
	}

	/**
	 * Method 'isPrecioUnitarioClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioUnitarioClienteNull()
	{
		return precioUnitarioClienteNull;
	}

	/** 
	 * Sets the value of precioUnitarioClienteModified
	 */
	public void setPrecioUnitarioClienteModified(boolean precioUnitarioClienteModified)
	{
		this.precioUnitarioClienteModified = precioUnitarioClienteModified;
	}

	/** 
	 * Gets the value of precioUnitarioClienteModified
	 */
	public boolean isPrecioUnitarioClienteModified()
	{
		return precioUnitarioClienteModified;
	}

	/**
	 * Method 'getPrecioMedioCliente'
	 * 
	 * @return double
	 */
	public double getPrecioMedioCliente()
	{
		return precioMedioCliente;
	}

	/**
	 * Method 'setPrecioMedioCliente'
	 * 
	 * @param precioMedioCliente
	 */
	public void setPrecioMedioCliente(double precioMedioCliente)
	{
		this.precioMedioCliente = precioMedioCliente;
		this.precioMedioClienteNull = false;
		this.precioMedioClienteModified = true;
	}

	/**
	 * Method 'setPrecioMedioClienteNull'
	 * 
	 * @param value
	 */
	public void setPrecioMedioClienteNull(boolean value)
	{
		this.precioMedioClienteNull = value;
		this.precioMedioClienteModified = true;
	}

	/**
	 * Method 'isPrecioMedioClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioMedioClienteNull()
	{
		return precioMedioClienteNull;
	}

	/** 
	 * Sets the value of precioMedioClienteModified
	 */
	public void setPrecioMedioClienteModified(boolean precioMedioClienteModified)
	{
		this.precioMedioClienteModified = precioMedioClienteModified;
	}

	/** 
	 * Gets the value of precioMedioClienteModified
	 */
	public boolean isPrecioMedioClienteModified()
	{
		return precioMedioClienteModified;
	}

	/**
	 * Method 'getPrecioMayoreoCliente'
	 * 
	 * @return double
	 */
	public double getPrecioMayoreoCliente()
	{
		return precioMayoreoCliente;
	}

	/**
	 * Method 'setPrecioMayoreoCliente'
	 * 
	 * @param precioMayoreoCliente
	 */
	public void setPrecioMayoreoCliente(double precioMayoreoCliente)
	{
		this.precioMayoreoCliente = precioMayoreoCliente;
		this.precioMayoreoClienteNull = false;
		this.precioMayoreoClienteModified = true;
	}

	/**
	 * Method 'setPrecioMayoreoClienteNull'
	 * 
	 * @param value
	 */
	public void setPrecioMayoreoClienteNull(boolean value)
	{
		this.precioMayoreoClienteNull = value;
		this.precioMayoreoClienteModified = true;
	}

	/**
	 * Method 'isPrecioMayoreoClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioMayoreoClienteNull()
	{
		return precioMayoreoClienteNull;
	}

	/** 
	 * Sets the value of precioMayoreoClienteModified
	 */
	public void setPrecioMayoreoClienteModified(boolean precioMayoreoClienteModified)
	{
		this.precioMayoreoClienteModified = precioMayoreoClienteModified;
	}

	/** 
	 * Gets the value of precioMayoreoClienteModified
	 */
	public boolean isPrecioMayoreoClienteModified()
	{
		return precioMayoreoClienteModified;
	}

	/**
	 * Method 'getPrecioEspecialCliente'
	 * 
	 * @return double
	 */
	public double getPrecioEspecialCliente()
	{
		return precioEspecialCliente;
	}

	/**
	 * Method 'setPrecioEspecialCliente'
	 * 
	 * @param precioEspecialCliente
	 */
	public void setPrecioEspecialCliente(double precioEspecialCliente)
	{
		this.precioEspecialCliente = precioEspecialCliente;
		this.precioEspecialClienteNull = false;
		this.precioEspecialClienteModified = true;
	}

	/**
	 * Method 'setPrecioEspecialClienteNull'
	 * 
	 * @param value
	 */
	public void setPrecioEspecialClienteNull(boolean value)
	{
		this.precioEspecialClienteNull = value;
		this.precioEspecialClienteModified = true;
	}

	/**
	 * Method 'isPrecioEspecialClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioEspecialClienteNull()
	{
		return precioEspecialClienteNull;
	}

	/** 
	 * Sets the value of precioEspecialClienteModified
	 */
	public void setPrecioEspecialClienteModified(boolean precioEspecialClienteModified)
	{
		this.precioEspecialClienteModified = precioEspecialClienteModified;
	}

	/** 
	 * Gets the value of precioEspecialClienteModified
	 */
	public boolean isPrecioEspecialClienteModified()
	{
		return precioEspecialClienteModified;
	}

	/**
	 * Method 'getPrecioDocenaCliente'
	 * 
	 * @return double
	 */
	public double getPrecioDocenaCliente()
	{
		return precioDocenaCliente;
	}

	/**
	 * Method 'setPrecioDocenaCliente'
	 * 
	 * @param precioDocenaCliente
	 */
	public void setPrecioDocenaCliente(double precioDocenaCliente)
	{
		this.precioDocenaCliente = precioDocenaCliente;
		this.precioDocenaClienteNull = false;
		this.precioDocenaClienteModified = true;
	}

	/**
	 * Method 'setPrecioDocenaClienteNull'
	 * 
	 * @param value
	 */
	public void setPrecioDocenaClienteNull(boolean value)
	{
		this.precioDocenaClienteNull = value;
		this.precioDocenaClienteModified = true;
	}

	/**
	 * Method 'isPrecioDocenaClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioDocenaClienteNull()
	{
		return precioDocenaClienteNull;
	}

	/** 
	 * Sets the value of precioDocenaClienteModified
	 */
	public void setPrecioDocenaClienteModified(boolean precioDocenaClienteModified)
	{
		this.precioDocenaClienteModified = precioDocenaClienteModified;
	}

	/** 
	 * Gets the value of precioDocenaClienteModified
	 */
	public boolean isPrecioDocenaClienteModified()
	{
		return precioDocenaClienteModified;
	}

	/**
	 * Method 'getIdEstatus'
	 * 
	 * @return int
	 */
	public int getIdEstatus()
	{
		return idEstatus;
	}

	/**
	 * Method 'setIdEstatus'
	 * 
	 * @param idEstatus
	 */
	public void setIdEstatus(int idEstatus)
	{
		this.idEstatus = idEstatus;
		this.idEstatusNull = false;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'setIdEstatusNull'
	 * 
	 * @param value
	 */
	public void setIdEstatusNull(boolean value)
	{
		this.idEstatusNull = value;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'isIdEstatusNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEstatusNull()
	{
		return idEstatusNull;
	}

	/** 
	 * Sets the value of idEstatusModified
	 */
	public void setIdEstatusModified(boolean idEstatusModified)
	{
		this.idEstatusModified = idEstatusModified;
	}

	/** 
	 * Gets the value of idEstatusModified
	 */
	public boolean isIdEstatusModified()
	{
		return idEstatusModified;
	}

	/**
	 * Method 'getPrecioUnitarioGranelCliente'
	 * 
	 * @return double
	 */
	public double getPrecioUnitarioGranelCliente()
	{
		return precioUnitarioGranelCliente;
	}

	/**
	 * Method 'setPrecioUnitarioGranelCliente'
	 * 
	 * @param precioUnitarioGranelCliente
	 */
	public void setPrecioUnitarioGranelCliente(double precioUnitarioGranelCliente)
	{
		this.precioUnitarioGranelCliente = precioUnitarioGranelCliente;
		this.precioUnitarioGranelClienteNull = false;
		this.precioUnitarioGranelClienteModified = true;
	}

	/**
	 * Method 'setPrecioUnitarioGranelClienteNull'
	 * 
	 * @param value
	 */
	public void setPrecioUnitarioGranelClienteNull(boolean value)
	{
		this.precioUnitarioGranelClienteNull = value;
		this.precioUnitarioGranelClienteModified = true;
	}

	/**
	 * Method 'isPrecioUnitarioGranelClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioUnitarioGranelClienteNull()
	{
		return precioUnitarioGranelClienteNull;
	}

	/** 
	 * Sets the value of precioUnitarioGranelClienteModified
	 */
	public void setPrecioUnitarioGranelClienteModified(boolean precioUnitarioGranelClienteModified)
	{
		this.precioUnitarioGranelClienteModified = precioUnitarioGranelClienteModified;
	}

	/** 
	 * Gets the value of precioUnitarioGranelClienteModified
	 */
	public boolean isPrecioUnitarioGranelClienteModified()
	{
		return precioUnitarioGranelClienteModified;
	}

	/**
	 * Method 'getPrecioMedioGranelCliente'
	 * 
	 * @return double
	 */
	public double getPrecioMedioGranelCliente()
	{
		return precioMedioGranelCliente;
	}

	/**
	 * Method 'setPrecioMedioGranelCliente'
	 * 
	 * @param precioMedioGranelCliente
	 */
	public void setPrecioMedioGranelCliente(double precioMedioGranelCliente)
	{
		this.precioMedioGranelCliente = precioMedioGranelCliente;
		this.precioMedioGranelClienteNull = false;
		this.precioMedioGranelClienteModified = true;
	}

	/**
	 * Method 'setPrecioMedioGranelClienteNull'
	 * 
	 * @param value
	 */
	public void setPrecioMedioGranelClienteNull(boolean value)
	{
		this.precioMedioGranelClienteNull = value;
		this.precioMedioGranelClienteModified = true;
	}

	/**
	 * Method 'isPrecioMedioGranelClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioMedioGranelClienteNull()
	{
		return precioMedioGranelClienteNull;
	}

	/** 
	 * Sets the value of precioMedioGranelClienteModified
	 */
	public void setPrecioMedioGranelClienteModified(boolean precioMedioGranelClienteModified)
	{
		this.precioMedioGranelClienteModified = precioMedioGranelClienteModified;
	}

	/** 
	 * Gets the value of precioMedioGranelClienteModified
	 */
	public boolean isPrecioMedioGranelClienteModified()
	{
		return precioMedioGranelClienteModified;
	}

	/**
	 * Method 'getPrecioMayoreoGranelCliente'
	 * 
	 * @return double
	 */
	public double getPrecioMayoreoGranelCliente()
	{
		return precioMayoreoGranelCliente;
	}

	/**
	 * Method 'setPrecioMayoreoGranelCliente'
	 * 
	 * @param precioMayoreoGranelCliente
	 */
	public void setPrecioMayoreoGranelCliente(double precioMayoreoGranelCliente)
	{
		this.precioMayoreoGranelCliente = precioMayoreoGranelCliente;
		this.precioMayoreoGranelClienteNull = false;
		this.precioMayoreoGranelClienteModified = true;
	}

	/**
	 * Method 'setPrecioMayoreoGranelClienteNull'
	 * 
	 * @param value
	 */
	public void setPrecioMayoreoGranelClienteNull(boolean value)
	{
		this.precioMayoreoGranelClienteNull = value;
		this.precioMayoreoGranelClienteModified = true;
	}

	/**
	 * Method 'isPrecioMayoreoGranelClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioMayoreoGranelClienteNull()
	{
		return precioMayoreoGranelClienteNull;
	}

	/** 
	 * Sets the value of precioMayoreoGranelClienteModified
	 */
	public void setPrecioMayoreoGranelClienteModified(boolean precioMayoreoGranelClienteModified)
	{
		this.precioMayoreoGranelClienteModified = precioMayoreoGranelClienteModified;
	}

	/** 
	 * Gets the value of precioMayoreoGranelClienteModified
	 */
	public boolean isPrecioMayoreoGranelClienteModified()
	{
		return precioMayoreoGranelClienteModified;
	}

	/**
	 * Method 'getPrecioEspecialGranelCliente'
	 * 
	 * @return double
	 */
	public double getPrecioEspecialGranelCliente()
	{
		return precioEspecialGranelCliente;
	}

	/**
	 * Method 'setPrecioEspecialGranelCliente'
	 * 
	 * @param precioEspecialGranelCliente
	 */
	public void setPrecioEspecialGranelCliente(double precioEspecialGranelCliente)
	{
		this.precioEspecialGranelCliente = precioEspecialGranelCliente;
		this.precioEspecialGranelClienteNull = false;
		this.precioEspecialGranelClienteModified = true;
	}

	/**
	 * Method 'setPrecioEspecialGranelClienteNull'
	 * 
	 * @param value
	 */
	public void setPrecioEspecialGranelClienteNull(boolean value)
	{
		this.precioEspecialGranelClienteNull = value;
		this.precioEspecialGranelClienteModified = true;
	}

	/**
	 * Method 'isPrecioEspecialGranelClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioEspecialGranelClienteNull()
	{
		return precioEspecialGranelClienteNull;
	}

	/** 
	 * Sets the value of precioEspecialGranelClienteModified
	 */
	public void setPrecioEspecialGranelClienteModified(boolean precioEspecialGranelClienteModified)
	{
		this.precioEspecialGranelClienteModified = precioEspecialGranelClienteModified;
	}

	/** 
	 * Gets the value of precioEspecialGranelClienteModified
	 */
	public boolean isPrecioEspecialGranelClienteModified()
	{
		return precioEspecialGranelClienteModified;
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
		
		if (!(_other instanceof ClientePrecioConcepto)) {
			return false;
		}
		
		final ClientePrecioConcepto _cast = (ClientePrecioConcepto) _other;
		if (idConcepto != _cast.idConcepto) {
			return false;
		}
		
		if (idConceptoModified != _cast.idConceptoModified) {
			return false;
		}
		
		if (idCliente != _cast.idCliente) {
			return false;
		}
		
		if (idClienteModified != _cast.idClienteModified) {
			return false;
		}
		
		if (precioUnitarioCliente != _cast.precioUnitarioCliente) {
			return false;
		}
		
		if (precioUnitarioClienteNull != _cast.precioUnitarioClienteNull) {
			return false;
		}
		
		if (precioUnitarioClienteModified != _cast.precioUnitarioClienteModified) {
			return false;
		}
		
		if (precioMedioCliente != _cast.precioMedioCliente) {
			return false;
		}
		
		if (precioMedioClienteNull != _cast.precioMedioClienteNull) {
			return false;
		}
		
		if (precioMedioClienteModified != _cast.precioMedioClienteModified) {
			return false;
		}
		
		if (precioMayoreoCliente != _cast.precioMayoreoCliente) {
			return false;
		}
		
		if (precioMayoreoClienteNull != _cast.precioMayoreoClienteNull) {
			return false;
		}
		
		if (precioMayoreoClienteModified != _cast.precioMayoreoClienteModified) {
			return false;
		}
		
		if (precioEspecialCliente != _cast.precioEspecialCliente) {
			return false;
		}
		
		if (precioEspecialClienteNull != _cast.precioEspecialClienteNull) {
			return false;
		}
		
		if (precioEspecialClienteModified != _cast.precioEspecialClienteModified) {
			return false;
		}
		
		if (precioDocenaCliente != _cast.precioDocenaCliente) {
			return false;
		}
		
		if (precioDocenaClienteNull != _cast.precioDocenaClienteNull) {
			return false;
		}
		
		if (precioDocenaClienteModified != _cast.precioDocenaClienteModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (idEstatusNull != _cast.idEstatusNull) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
			return false;
		}
		
		if (precioUnitarioGranelCliente != _cast.precioUnitarioGranelCliente) {
			return false;
		}
		
		if (precioUnitarioGranelClienteNull != _cast.precioUnitarioGranelClienteNull) {
			return false;
		}
		
		if (precioUnitarioGranelClienteModified != _cast.precioUnitarioGranelClienteModified) {
			return false;
		}
		
		if (precioMedioGranelCliente != _cast.precioMedioGranelCliente) {
			return false;
		}
		
		if (precioMedioGranelClienteNull != _cast.precioMedioGranelClienteNull) {
			return false;
		}
		
		if (precioMedioGranelClienteModified != _cast.precioMedioGranelClienteModified) {
			return false;
		}
		
		if (precioMayoreoGranelCliente != _cast.precioMayoreoGranelCliente) {
			return false;
		}
		
		if (precioMayoreoGranelClienteNull != _cast.precioMayoreoGranelClienteNull) {
			return false;
		}
		
		if (precioMayoreoGranelClienteModified != _cast.precioMayoreoGranelClienteModified) {
			return false;
		}
		
		if (precioEspecialGranelCliente != _cast.precioEspecialGranelCliente) {
			return false;
		}
		
		if (precioEspecialGranelClienteNull != _cast.precioEspecialGranelClienteNull) {
			return false;
		}
		
		if (precioEspecialGranelClienteModified != _cast.precioEspecialGranelClienteModified) {
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
		_hashCode = 29 * _hashCode + idConcepto;
		_hashCode = 29 * _hashCode + (idConceptoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCliente;
		_hashCode = 29 * _hashCode + (idClienteModified ? 1 : 0);
		long temp_precioUnitarioCliente = Double.doubleToLongBits(precioUnitarioCliente);
		_hashCode = 29 * _hashCode + (int) (temp_precioUnitarioCliente ^ (temp_precioUnitarioCliente >>> 32));
		_hashCode = 29 * _hashCode + (precioUnitarioClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (precioUnitarioClienteModified ? 1 : 0);
		long temp_precioMedioCliente = Double.doubleToLongBits(precioMedioCliente);
		_hashCode = 29 * _hashCode + (int) (temp_precioMedioCliente ^ (temp_precioMedioCliente >>> 32));
		_hashCode = 29 * _hashCode + (precioMedioClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (precioMedioClienteModified ? 1 : 0);
		long temp_precioMayoreoCliente = Double.doubleToLongBits(precioMayoreoCliente);
		_hashCode = 29 * _hashCode + (int) (temp_precioMayoreoCliente ^ (temp_precioMayoreoCliente >>> 32));
		_hashCode = 29 * _hashCode + (precioMayoreoClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (precioMayoreoClienteModified ? 1 : 0);
		long temp_precioEspecialCliente = Double.doubleToLongBits(precioEspecialCliente);
		_hashCode = 29 * _hashCode + (int) (temp_precioEspecialCliente ^ (temp_precioEspecialCliente >>> 32));
		_hashCode = 29 * _hashCode + (precioEspecialClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (precioEspecialClienteModified ? 1 : 0);
		long temp_precioDocenaCliente = Double.doubleToLongBits(precioDocenaCliente);
		_hashCode = 29 * _hashCode + (int) (temp_precioDocenaCliente ^ (temp_precioDocenaCliente >>> 32));
		_hashCode = 29 * _hashCode + (precioDocenaClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (precioDocenaClienteModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		long temp_precioUnitarioGranelCliente = Double.doubleToLongBits(precioUnitarioGranelCliente);
		_hashCode = 29 * _hashCode + (int) (temp_precioUnitarioGranelCliente ^ (temp_precioUnitarioGranelCliente >>> 32));
		_hashCode = 29 * _hashCode + (precioUnitarioGranelClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (precioUnitarioGranelClienteModified ? 1 : 0);
		long temp_precioMedioGranelCliente = Double.doubleToLongBits(precioMedioGranelCliente);
		_hashCode = 29 * _hashCode + (int) (temp_precioMedioGranelCliente ^ (temp_precioMedioGranelCliente >>> 32));
		_hashCode = 29 * _hashCode + (precioMedioGranelClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (precioMedioGranelClienteModified ? 1 : 0);
		long temp_precioMayoreoGranelCliente = Double.doubleToLongBits(precioMayoreoGranelCliente);
		_hashCode = 29 * _hashCode + (int) (temp_precioMayoreoGranelCliente ^ (temp_precioMayoreoGranelCliente >>> 32));
		_hashCode = 29 * _hashCode + (precioMayoreoGranelClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (precioMayoreoGranelClienteModified ? 1 : 0);
		long temp_precioEspecialGranelCliente = Double.doubleToLongBits(precioEspecialGranelCliente);
		_hashCode = 29 * _hashCode + (int) (temp_precioEspecialGranelCliente ^ (temp_precioEspecialGranelCliente >>> 32));
		_hashCode = 29 * _hashCode + (precioEspecialGranelClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (precioEspecialGranelClienteModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ClientePrecioConceptoPk
	 */
	public ClientePrecioConceptoPk createPk()
	{
		return new ClientePrecioConceptoPk(idCliente, idConcepto);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.ClientePrecioConcepto: " );
		ret.append( "idConcepto=" + idConcepto );
		ret.append( ", idCliente=" + idCliente );
		ret.append( ", precioUnitarioCliente=" + precioUnitarioCliente );
		ret.append( ", precioMedioCliente=" + precioMedioCliente );
		ret.append( ", precioMayoreoCliente=" + precioMayoreoCliente );
		ret.append( ", precioEspecialCliente=" + precioEspecialCliente );
		ret.append( ", precioDocenaCliente=" + precioDocenaCliente );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", precioUnitarioGranelCliente=" + precioUnitarioGranelCliente );
		ret.append( ", precioMedioGranelCliente=" + precioMedioGranelCliente );
		ret.append( ", precioMayoreoGranelCliente=" + precioMayoreoGranelCliente );
		ret.append( ", precioEspecialGranelCliente=" + precioEspecialGranelCliente );
		return ret.toString();
	}

}