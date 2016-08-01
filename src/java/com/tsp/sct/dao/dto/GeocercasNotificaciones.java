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

public class GeocercasNotificaciones implements Serializable
{
	/** 
	 * This attribute maps to the column ID_GEO_NOTIFICACION in the geocercas_notificaciones table.
	 */
	protected int idGeoNotificacion;

	/** 
	 * This attribute represents whether the attribute idGeoNotificacion has been modified since being read from the database.
	 */
	protected boolean idGeoNotificacionModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the geocercas_notificaciones table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the primitive attribute idEmpresa is null.
	 */
	protected boolean idEmpresaNull = true;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column CORREOS in the geocercas_notificaciones table.
	 */
	protected String correos;

	/** 
	 * This attribute represents whether the attribute correos has been modified since being read from the database.
	 */
	protected boolean correosModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the geocercas_notificaciones table.
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
	 * Method 'GeocercasNotificaciones'
	 * 
	 */
	public GeocercasNotificaciones()
	{
	}

	/**
	 * Method 'getIdGeoNotificacion'
	 * 
	 * @return int
	 */
	public int getIdGeoNotificacion()
	{
		return idGeoNotificacion;
	}

	/**
	 * Method 'setIdGeoNotificacion'
	 * 
	 * @param idGeoNotificacion
	 */
	public void setIdGeoNotificacion(int idGeoNotificacion)
	{
		this.idGeoNotificacion = idGeoNotificacion;
		this.idGeoNotificacionModified = true;
	}

	/** 
	 * Sets the value of idGeoNotificacionModified
	 */
	public void setIdGeoNotificacionModified(boolean idGeoNotificacionModified)
	{
		this.idGeoNotificacionModified = idGeoNotificacionModified;
	}

	/** 
	 * Gets the value of idGeoNotificacionModified
	 */
	public boolean isIdGeoNotificacionModified()
	{
		return idGeoNotificacionModified;
	}

	/**
	 * Method 'getIdEmpresa'
	 * 
	 * @return int
	 */
	public int getIdEmpresa()
	{
		return idEmpresa;
	}

	/**
	 * Method 'setIdEmpresa'
	 * 
	 * @param idEmpresa
	 */
	public void setIdEmpresa(int idEmpresa)
	{
		this.idEmpresa = idEmpresa;
		this.idEmpresaNull = false;
		this.idEmpresaModified = true;
	}

	/**
	 * Method 'setIdEmpresaNull'
	 * 
	 * @param value
	 */
	public void setIdEmpresaNull(boolean value)
	{
		this.idEmpresaNull = value;
		this.idEmpresaModified = true;
	}

	/**
	 * Method 'isIdEmpresaNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEmpresaNull()
	{
		return idEmpresaNull;
	}

	/** 
	 * Sets the value of idEmpresaModified
	 */
	public void setIdEmpresaModified(boolean idEmpresaModified)
	{
		this.idEmpresaModified = idEmpresaModified;
	}

	/** 
	 * Gets the value of idEmpresaModified
	 */
	public boolean isIdEmpresaModified()
	{
		return idEmpresaModified;
	}

	/**
	 * Method 'getCorreos'
	 * 
	 * @return String
	 */
	public String getCorreos()
	{
		return correos;
	}

	/**
	 * Method 'setCorreos'
	 * 
	 * @param correos
	 */
	public void setCorreos(String correos)
	{
		this.correos = correos;
		this.correosModified = true;
	}

	/** 
	 * Sets the value of correosModified
	 */
	public void setCorreosModified(boolean correosModified)
	{
		this.correosModified = correosModified;
	}

	/** 
	 * Gets the value of correosModified
	 */
	public boolean isCorreosModified()
	{
		return correosModified;
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
		
		if (!(_other instanceof GeocercasNotificaciones)) {
			return false;
		}
		
		final GeocercasNotificaciones _cast = (GeocercasNotificaciones) _other;
		if (idGeoNotificacion != _cast.idGeoNotificacion) {
			return false;
		}
		
		if (idGeoNotificacionModified != _cast.idGeoNotificacionModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaNull != _cast.idEmpresaNull) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (correos == null ? _cast.correos != correos : !correos.equals( _cast.correos )) {
			return false;
		}
		
		if (correosModified != _cast.correosModified) {
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
		_hashCode = 29 * _hashCode + idGeoNotificacion;
		_hashCode = 29 * _hashCode + (idGeoNotificacionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		if (correos != null) {
			_hashCode = 29 * _hashCode + correos.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (correosModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return GeocercasNotificacionesPk
	 */
	public GeocercasNotificacionesPk createPk()
	{
		return new GeocercasNotificacionesPk(idGeoNotificacion);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.GeocercasNotificaciones: " );
		ret.append( "idGeoNotificacion=" + idGeoNotificacion );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", correos=" + correos );
		ret.append( ", idEstatus=" + idEstatus );
		return ret.toString();
	}

}