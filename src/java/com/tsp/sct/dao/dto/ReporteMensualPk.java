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
 * This class represents the primary key of the reporte_mensual table.
 */
public class ReporteMensualPk implements Serializable
{
	protected int idReporteMensual;

	/** 
	 * This attribute represents whether the primitive attribute idReporteMensual is null.
	 */
	protected boolean idReporteMensualNull;

	/** 
	 * Sets the value of idReporteMensual
	 */
	public void setIdReporteMensual(int idReporteMensual)
	{
		this.idReporteMensual = idReporteMensual;
	}

	/** 
	 * Gets the value of idReporteMensual
	 */
	public int getIdReporteMensual()
	{
		return idReporteMensual;
	}

	/**
	 * Method 'ReporteMensualPk'
	 * 
	 */
	public ReporteMensualPk()
	{
	}

	/**
	 * Method 'ReporteMensualPk'
	 * 
	 * @param idReporteMensual
	 */
	public ReporteMensualPk(final int idReporteMensual)
	{
		this.idReporteMensual = idReporteMensual;
	}

	/** 
	 * Sets the value of idReporteMensualNull
	 */
	public void setIdReporteMensualNull(boolean idReporteMensualNull)
	{
		this.idReporteMensualNull = idReporteMensualNull;
	}

	/** 
	 * Gets the value of idReporteMensualNull
	 */
	public boolean isIdReporteMensualNull()
	{
		return idReporteMensualNull;
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
		
		if (!(_other instanceof ReporteMensualPk)) {
			return false;
		}
		
		final ReporteMensualPk _cast = (ReporteMensualPk) _other;
		if (idReporteMensual != _cast.idReporteMensual) {
			return false;
		}
		
		if (idReporteMensualNull != _cast.idReporteMensualNull) {
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
		_hashCode = 29 * _hashCode + idReporteMensual;
		_hashCode = 29 * _hashCode + (idReporteMensualNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.ReporteMensualPk: " );
		ret.append( "idReporteMensual=" + idReporteMensual );
		return ret.toString();
	}

}