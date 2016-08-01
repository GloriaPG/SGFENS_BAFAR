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
import java.util.Date;

public class BitacoraFoliosFens implements Serializable
{
	/** 
	 * This attribute maps to the column ID_BITACORA_FOLIOS_FENS in the bitacora_folios_fens table.
	 */
	protected int idBitacoraFoliosFens;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the bitacora_folios_fens table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute maps to the column FOLIOS_AGREGADOS in the bitacora_folios_fens table.
	 */
	protected int foliosAgregados;

	/** 
	 * This attribute represents whether the primitive attribute foliosAgregados is null.
	 */
	protected boolean foliosAgregadosNull = true;

	/** 
	 * This attribute maps to the column FOLIOS_ELIMINADOS in the bitacora_folios_fens table.
	 */
	protected int foliosEliminados;

	/** 
	 * This attribute represents whether the primitive attribute foliosEliminados is null.
	 */
	protected boolean foliosEliminadosNull = true;

	/** 
	 * This attribute maps to the column FOLIOS_UTILIZADOS in the bitacora_folios_fens table.
	 */
	protected int foliosUtilizados;

	/** 
	 * This attribute represents whether the primitive attribute foliosUtilizados is null.
	 */
	protected boolean foliosUtilizadosNull = true;

	/** 
	 * This attribute maps to the column FOLIOS_TOTALES in the bitacora_folios_fens table.
	 */
	protected int foliosTotales;

	/** 
	 * This attribute represents whether the primitive attribute foliosTotales is null.
	 */
	protected boolean foliosTotalesNull = true;

	/** 
	 * This attribute maps to the column FECHA in the bitacora_folios_fens table.
	 */
	protected Date fecha;

	/**
	 * Method 'BitacoraFoliosFens'
	 * 
	 */
	public BitacoraFoliosFens()
	{
	}

	/**
	 * Method 'getIdBitacoraFoliosFens'
	 * 
	 * @return int
	 */
	public int getIdBitacoraFoliosFens()
	{
		return idBitacoraFoliosFens;
	}

	/**
	 * Method 'setIdBitacoraFoliosFens'
	 * 
	 * @param idBitacoraFoliosFens
	 */
	public void setIdBitacoraFoliosFens(int idBitacoraFoliosFens)
	{
		this.idBitacoraFoliosFens = idBitacoraFoliosFens;
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
	}

	/**
	 * Method 'getFoliosAgregados'
	 * 
	 * @return int
	 */
	public int getFoliosAgregados()
	{
		return foliosAgregados;
	}

	/**
	 * Method 'setFoliosAgregados'
	 * 
	 * @param foliosAgregados
	 */
	public void setFoliosAgregados(int foliosAgregados)
	{
		this.foliosAgregados = foliosAgregados;
		this.foliosAgregadosNull = false;
	}

	/**
	 * Method 'setFoliosAgregadosNull'
	 * 
	 * @param value
	 */
	public void setFoliosAgregadosNull(boolean value)
	{
		this.foliosAgregadosNull = value;
	}

	/**
	 * Method 'isFoliosAgregadosNull'
	 * 
	 * @return boolean
	 */
	public boolean isFoliosAgregadosNull()
	{
		return foliosAgregadosNull;
	}

	/**
	 * Method 'getFoliosEliminados'
	 * 
	 * @return int
	 */
	public int getFoliosEliminados()
	{
		return foliosEliminados;
	}

	/**
	 * Method 'setFoliosEliminados'
	 * 
	 * @param foliosEliminados
	 */
	public void setFoliosEliminados(int foliosEliminados)
	{
		this.foliosEliminados = foliosEliminados;
		this.foliosEliminadosNull = false;
	}

	/**
	 * Method 'setFoliosEliminadosNull'
	 * 
	 * @param value
	 */
	public void setFoliosEliminadosNull(boolean value)
	{
		this.foliosEliminadosNull = value;
	}

	/**
	 * Method 'isFoliosEliminadosNull'
	 * 
	 * @return boolean
	 */
	public boolean isFoliosEliminadosNull()
	{
		return foliosEliminadosNull;
	}

	/**
	 * Method 'getFoliosUtilizados'
	 * 
	 * @return int
	 */
	public int getFoliosUtilizados()
	{
		return foliosUtilizados;
	}

	/**
	 * Method 'setFoliosUtilizados'
	 * 
	 * @param foliosUtilizados
	 */
	public void setFoliosUtilizados(int foliosUtilizados)
	{
		this.foliosUtilizados = foliosUtilizados;
		this.foliosUtilizadosNull = false;
	}

	/**
	 * Method 'setFoliosUtilizadosNull'
	 * 
	 * @param value
	 */
	public void setFoliosUtilizadosNull(boolean value)
	{
		this.foliosUtilizadosNull = value;
	}

	/**
	 * Method 'isFoliosUtilizadosNull'
	 * 
	 * @return boolean
	 */
	public boolean isFoliosUtilizadosNull()
	{
		return foliosUtilizadosNull;
	}

	/**
	 * Method 'getFoliosTotales'
	 * 
	 * @return int
	 */
	public int getFoliosTotales()
	{
		return foliosTotales;
	}

	/**
	 * Method 'setFoliosTotales'
	 * 
	 * @param foliosTotales
	 */
	public void setFoliosTotales(int foliosTotales)
	{
		this.foliosTotales = foliosTotales;
		this.foliosTotalesNull = false;
	}

	/**
	 * Method 'setFoliosTotalesNull'
	 * 
	 * @param value
	 */
	public void setFoliosTotalesNull(boolean value)
	{
		this.foliosTotalesNull = value;
	}

	/**
	 * Method 'isFoliosTotalesNull'
	 * 
	 * @return boolean
	 */
	public boolean isFoliosTotalesNull()
	{
		return foliosTotalesNull;
	}

	/**
	 * Method 'getFecha'
	 * 
	 * @return Date
	 */
	public Date getFecha()
	{
		return fecha;
	}

	/**
	 * Method 'setFecha'
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
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
		
		if (!(_other instanceof BitacoraFoliosFens)) {
			return false;
		}
		
		final BitacoraFoliosFens _cast = (BitacoraFoliosFens) _other;
		if (idBitacoraFoliosFens != _cast.idBitacoraFoliosFens) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (foliosAgregados != _cast.foliosAgregados) {
			return false;
		}
		
		if (foliosAgregadosNull != _cast.foliosAgregadosNull) {
			return false;
		}
		
		if (foliosEliminados != _cast.foliosEliminados) {
			return false;
		}
		
		if (foliosEliminadosNull != _cast.foliosEliminadosNull) {
			return false;
		}
		
		if (foliosUtilizados != _cast.foliosUtilizados) {
			return false;
		}
		
		if (foliosUtilizadosNull != _cast.foliosUtilizadosNull) {
			return false;
		}
		
		if (foliosTotales != _cast.foliosTotales) {
			return false;
		}
		
		if (foliosTotalesNull != _cast.foliosTotalesNull) {
			return false;
		}
		
		if (fecha == null ? _cast.fecha != fecha : !fecha.equals( _cast.fecha )) {
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
		_hashCode = 29 * _hashCode + idBitacoraFoliosFens;
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + foliosAgregados;
		_hashCode = 29 * _hashCode + (foliosAgregadosNull ? 1 : 0);
		_hashCode = 29 * _hashCode + foliosEliminados;
		_hashCode = 29 * _hashCode + (foliosEliminadosNull ? 1 : 0);
		_hashCode = 29 * _hashCode + foliosUtilizados;
		_hashCode = 29 * _hashCode + (foliosUtilizadosNull ? 1 : 0);
		_hashCode = 29 * _hashCode + foliosTotales;
		_hashCode = 29 * _hashCode + (foliosTotalesNull ? 1 : 0);
		if (fecha != null) {
			_hashCode = 29 * _hashCode + fecha.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return BitacoraFoliosFensPk
	 */
	public BitacoraFoliosFensPk createPk()
	{
		return new BitacoraFoliosFensPk(idBitacoraFoliosFens);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.BitacoraFoliosFens: " );
		ret.append( "idBitacoraFoliosFens=" + idBitacoraFoliosFens );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", foliosAgregados=" + foliosAgregados );
		ret.append( ", foliosEliminados=" + foliosEliminados );
		ret.append( ", foliosUtilizados=" + foliosUtilizados );
		ret.append( ", foliosTotales=" + foliosTotales );
		ret.append( ", fecha=" + fecha );
		return ret.toString();
	}

}