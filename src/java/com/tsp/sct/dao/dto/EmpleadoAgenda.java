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

public class EmpleadoAgenda implements Serializable
{
	/** 
	 * This attribute maps to the column ID_AGENDA in the empleado_agenda table.
	 */
	protected int idAgenda;

	/** 
	 * This attribute represents whether the attribute idAgenda has been modified since being read from the database.
	 */
	protected boolean idAgendaModified = false;

	/** 
	 * This attribute maps to the column ID_EMPLEADO in the empleado_agenda table.
	 */
	protected int idEmpleado;

	/** 
	 * This attribute represents whether the primitive attribute idEmpleado is null.
	 */
	protected boolean idEmpleadoNull = true;

	/** 
	 * This attribute represents whether the attribute idEmpleado has been modified since being read from the database.
	 */
	protected boolean idEmpleadoModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the empleado_agenda table.
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
	 * This attribute maps to the column FECHA_CREACION in the empleado_agenda table.
	 */
	protected Date fechaCreacion;

	/** 
	 * This attribute represents whether the attribute fechaCreacion has been modified since being read from the database.
	 */
	protected boolean fechaCreacionModified = false;

	/** 
	 * This attribute maps to the column FECHA_PROGRAMADA in the empleado_agenda table.
	 */
	protected Date fechaProgramada;

	/** 
	 * This attribute represents whether the attribute fechaProgramada has been modified since being read from the database.
	 */
	protected boolean fechaProgramadaModified = false;

	/** 
	 * This attribute maps to the column FECHA_EJECUCION in the empleado_agenda table.
	 */
	protected Date fechaEjecucion;

	/** 
	 * This attribute represents whether the attribute fechaEjecucion has been modified since being read from the database.
	 */
	protected boolean fechaEjecucionModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_TAREA in the empleado_agenda table.
	 */
	protected String nombreTarea;

	/** 
	 * This attribute represents whether the attribute nombreTarea has been modified since being read from the database.
	 */
	protected boolean nombreTareaModified = false;

	/** 
	 * This attribute maps to the column DESCRIPCION_TAREA in the empleado_agenda table.
	 */
	protected String descripcionTarea;

	/** 
	 * This attribute represents whether the attribute descripcionTarea has been modified since being read from the database.
	 */
	protected boolean descripcionTareaModified = false;

	/** 
	 * This attribute maps to the column ID_CLIENTE in the empleado_agenda table.
	 */
	protected int idCliente;

	/** 
	 * This attribute represents whether the primitive attribute idCliente is null.
	 */
	protected boolean idClienteNull = true;

	/** 
	 * This attribute represents whether the attribute idCliente has been modified since being read from the database.
	 */
	protected boolean idClienteModified = false;

	/**
	 * Method 'EmpleadoAgenda'
	 * 
	 */
	public EmpleadoAgenda()
	{
	}

	/**
	 * Method 'getIdAgenda'
	 * 
	 * @return int
	 */
	public int getIdAgenda()
	{
		return idAgenda;
	}

	/**
	 * Method 'setIdAgenda'
	 * 
	 * @param idAgenda
	 */
	public void setIdAgenda(int idAgenda)
	{
		this.idAgenda = idAgenda;
		this.idAgendaModified = true;
	}

	/** 
	 * Sets the value of idAgendaModified
	 */
	public void setIdAgendaModified(boolean idAgendaModified)
	{
		this.idAgendaModified = idAgendaModified;
	}

	/** 
	 * Gets the value of idAgendaModified
	 */
	public boolean isIdAgendaModified()
	{
		return idAgendaModified;
	}

	/**
	 * Method 'getIdEmpleado'
	 * 
	 * @return int
	 */
	public int getIdEmpleado()
	{
		return idEmpleado;
	}

	/**
	 * Method 'setIdEmpleado'
	 * 
	 * @param idEmpleado
	 */
	public void setIdEmpleado(int idEmpleado)
	{
		this.idEmpleado = idEmpleado;
		this.idEmpleadoNull = false;
		this.idEmpleadoModified = true;
	}

	/**
	 * Method 'setIdEmpleadoNull'
	 * 
	 * @param value
	 */
	public void setIdEmpleadoNull(boolean value)
	{
		this.idEmpleadoNull = value;
		this.idEmpleadoModified = true;
	}

	/**
	 * Method 'isIdEmpleadoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEmpleadoNull()
	{
		return idEmpleadoNull;
	}

	/** 
	 * Sets the value of idEmpleadoModified
	 */
	public void setIdEmpleadoModified(boolean idEmpleadoModified)
	{
		this.idEmpleadoModified = idEmpleadoModified;
	}

	/** 
	 * Gets the value of idEmpleadoModified
	 */
	public boolean isIdEmpleadoModified()
	{
		return idEmpleadoModified;
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
	 * Method 'getFechaCreacion'
	 * 
	 * @return Date
	 */
	public Date getFechaCreacion()
	{
		return fechaCreacion;
	}

	/**
	 * Method 'setFechaCreacion'
	 * 
	 * @param fechaCreacion
	 */
	public void setFechaCreacion(Date fechaCreacion)
	{
		this.fechaCreacion = fechaCreacion;
		this.fechaCreacionModified = true;
	}

	/** 
	 * Sets the value of fechaCreacionModified
	 */
	public void setFechaCreacionModified(boolean fechaCreacionModified)
	{
		this.fechaCreacionModified = fechaCreacionModified;
	}

	/** 
	 * Gets the value of fechaCreacionModified
	 */
	public boolean isFechaCreacionModified()
	{
		return fechaCreacionModified;
	}

	/**
	 * Method 'getFechaProgramada'
	 * 
	 * @return Date
	 */
	public Date getFechaProgramada()
	{
		return fechaProgramada;
	}

	/**
	 * Method 'setFechaProgramada'
	 * 
	 * @param fechaProgramada
	 */
	public void setFechaProgramada(Date fechaProgramada)
	{
		this.fechaProgramada = fechaProgramada;
		this.fechaProgramadaModified = true;
	}

	/** 
	 * Sets the value of fechaProgramadaModified
	 */
	public void setFechaProgramadaModified(boolean fechaProgramadaModified)
	{
		this.fechaProgramadaModified = fechaProgramadaModified;
	}

	/** 
	 * Gets the value of fechaProgramadaModified
	 */
	public boolean isFechaProgramadaModified()
	{
		return fechaProgramadaModified;
	}

	/**
	 * Method 'getFechaEjecucion'
	 * 
	 * @return Date
	 */
	public Date getFechaEjecucion()
	{
		return fechaEjecucion;
	}

	/**
	 * Method 'setFechaEjecucion'
	 * 
	 * @param fechaEjecucion
	 */
	public void setFechaEjecucion(Date fechaEjecucion)
	{
		this.fechaEjecucion = fechaEjecucion;
		this.fechaEjecucionModified = true;
	}

	/** 
	 * Sets the value of fechaEjecucionModified
	 */
	public void setFechaEjecucionModified(boolean fechaEjecucionModified)
	{
		this.fechaEjecucionModified = fechaEjecucionModified;
	}

	/** 
	 * Gets the value of fechaEjecucionModified
	 */
	public boolean isFechaEjecucionModified()
	{
		return fechaEjecucionModified;
	}

	/**
	 * Method 'getNombreTarea'
	 * 
	 * @return String
	 */
	public String getNombreTarea()
	{
		return nombreTarea;
	}

	/**
	 * Method 'setNombreTarea'
	 * 
	 * @param nombreTarea
	 */
	public void setNombreTarea(String nombreTarea)
	{
		this.nombreTarea = nombreTarea;
		this.nombreTareaModified = true;
	}

	/** 
	 * Sets the value of nombreTareaModified
	 */
	public void setNombreTareaModified(boolean nombreTareaModified)
	{
		this.nombreTareaModified = nombreTareaModified;
	}

	/** 
	 * Gets the value of nombreTareaModified
	 */
	public boolean isNombreTareaModified()
	{
		return nombreTareaModified;
	}

	/**
	 * Method 'getDescripcionTarea'
	 * 
	 * @return String
	 */
	public String getDescripcionTarea()
	{
		return descripcionTarea;
	}

	/**
	 * Method 'setDescripcionTarea'
	 * 
	 * @param descripcionTarea
	 */
	public void setDescripcionTarea(String descripcionTarea)
	{
		this.descripcionTarea = descripcionTarea;
		this.descripcionTareaModified = true;
	}

	/** 
	 * Sets the value of descripcionTareaModified
	 */
	public void setDescripcionTareaModified(boolean descripcionTareaModified)
	{
		this.descripcionTareaModified = descripcionTareaModified;
	}

	/** 
	 * Gets the value of descripcionTareaModified
	 */
	public boolean isDescripcionTareaModified()
	{
		return descripcionTareaModified;
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
		this.idClienteNull = false;
		this.idClienteModified = true;
	}

	/**
	 * Method 'setIdClienteNull'
	 * 
	 * @param value
	 */
	public void setIdClienteNull(boolean value)
	{
		this.idClienteNull = value;
		this.idClienteModified = true;
	}

	/**
	 * Method 'isIdClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdClienteNull()
	{
		return idClienteNull;
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
		
		if (!(_other instanceof EmpleadoAgenda)) {
			return false;
		}
		
		final EmpleadoAgenda _cast = (EmpleadoAgenda) _other;
		if (idAgenda != _cast.idAgenda) {
			return false;
		}
		
		if (idAgendaModified != _cast.idAgendaModified) {
			return false;
		}
		
		if (idEmpleado != _cast.idEmpleado) {
			return false;
		}
		
		if (idEmpleadoNull != _cast.idEmpleadoNull) {
			return false;
		}
		
		if (idEmpleadoModified != _cast.idEmpleadoModified) {
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
		
		if (fechaCreacion == null ? _cast.fechaCreacion != fechaCreacion : !fechaCreacion.equals( _cast.fechaCreacion )) {
			return false;
		}
		
		if (fechaCreacionModified != _cast.fechaCreacionModified) {
			return false;
		}
		
		if (fechaProgramada == null ? _cast.fechaProgramada != fechaProgramada : !fechaProgramada.equals( _cast.fechaProgramada )) {
			return false;
		}
		
		if (fechaProgramadaModified != _cast.fechaProgramadaModified) {
			return false;
		}
		
		if (fechaEjecucion == null ? _cast.fechaEjecucion != fechaEjecucion : !fechaEjecucion.equals( _cast.fechaEjecucion )) {
			return false;
		}
		
		if (fechaEjecucionModified != _cast.fechaEjecucionModified) {
			return false;
		}
		
		if (nombreTarea == null ? _cast.nombreTarea != nombreTarea : !nombreTarea.equals( _cast.nombreTarea )) {
			return false;
		}
		
		if (nombreTareaModified != _cast.nombreTareaModified) {
			return false;
		}
		
		if (descripcionTarea == null ? _cast.descripcionTarea != descripcionTarea : !descripcionTarea.equals( _cast.descripcionTarea )) {
			return false;
		}
		
		if (descripcionTareaModified != _cast.descripcionTareaModified) {
			return false;
		}
		
		if (idCliente != _cast.idCliente) {
			return false;
		}
		
		if (idClienteNull != _cast.idClienteNull) {
			return false;
		}
		
		if (idClienteModified != _cast.idClienteModified) {
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
		_hashCode = 29 * _hashCode + idAgenda;
		_hashCode = 29 * _hashCode + (idAgendaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpleado;
		_hashCode = 29 * _hashCode + (idEmpleadoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEmpleadoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		if (fechaCreacion != null) {
			_hashCode = 29 * _hashCode + fechaCreacion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaCreacionModified ? 1 : 0);
		if (fechaProgramada != null) {
			_hashCode = 29 * _hashCode + fechaProgramada.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaProgramadaModified ? 1 : 0);
		if (fechaEjecucion != null) {
			_hashCode = 29 * _hashCode + fechaEjecucion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaEjecucionModified ? 1 : 0);
		if (nombreTarea != null) {
			_hashCode = 29 * _hashCode + nombreTarea.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreTareaModified ? 1 : 0);
		if (descripcionTarea != null) {
			_hashCode = 29 * _hashCode + descripcionTarea.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionTareaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCliente;
		_hashCode = 29 * _hashCode + (idClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idClienteModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmpleadoAgendaPk
	 */
	public EmpleadoAgendaPk createPk()
	{
		return new EmpleadoAgendaPk(idAgenda);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.EmpleadoAgenda: " );
		ret.append( "idAgenda=" + idAgenda );
		ret.append( ", idEmpleado=" + idEmpleado );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", fechaCreacion=" + fechaCreacion );
		ret.append( ", fechaProgramada=" + fechaProgramada );
		ret.append( ", fechaEjecucion=" + fechaEjecucion );
		ret.append( ", nombreTarea=" + nombreTarea );
		ret.append( ", descripcionTarea=" + descripcionTarea );
		ret.append( ", idCliente=" + idCliente );
		return ret.toString();
	}

}