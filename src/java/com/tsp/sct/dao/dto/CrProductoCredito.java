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

public class CrProductoCredito implements Serializable
{
	/** 
	 * This attribute maps to the column id_producto_credito in the cr_producto_credito table.
	 */
	protected int idProductoCredito;

	/** 
	 * This attribute represents whether the attribute idProductoCredito has been modified since being read from the database.
	 */
	protected boolean idProductoCreditoModified = false;

	/** 
	 * This attribute maps to the column id_producto_credito_padre in the cr_producto_credito table.
	 */
	protected int idProductoCreditoPadre;

	/** 
	 * This attribute represents whether the primitive attribute idProductoCreditoPadre is null.
	 */
	protected boolean idProductoCreditoPadreNull = true;

	/** 
	 * This attribute represents whether the attribute idProductoCreditoPadre has been modified since being read from the database.
	 */
	protected boolean idProductoCreditoPadreModified = false;

	/** 
	 * This attribute maps to the column nombre in the cr_producto_credito table.
	 */
	protected String nombre;

	/** 
	 * This attribute represents whether the attribute nombre has been modified since being read from the database.
	 */
	protected boolean nombreModified = false;

	/** 
	 * This attribute maps to the column descripcion in the cr_producto_credito table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/** 
	 * This attribute maps to the column fecha_hr_creacion in the cr_producto_credito table.
	 */
	protected Date fechaHrCreacion;

	/** 
	 * This attribute represents whether the attribute fechaHrCreacion has been modified since being read from the database.
	 */
	protected boolean fechaHrCreacionModified = false;

	/** 
	 * This attribute maps to the column fecha_hr_ultima_edicion in the cr_producto_credito table.
	 */
	protected Date fechaHrUltimaEdicion;

	/** 
	 * This attribute represents whether the attribute fechaHrUltimaEdicion has been modified since being read from the database.
	 */
	protected boolean fechaHrUltimaEdicionModified = false;

	/** 
	 * This attribute maps to the column id_usuario_edicion in the cr_producto_credito table.
	 */
	protected int idUsuarioEdicion;

	/** 
	 * This attribute represents whether the attribute idUsuarioEdicion has been modified since being read from the database.
	 */
	protected boolean idUsuarioEdicionModified = false;

	/** 
	 * This attribute maps to the column id_score in the cr_producto_credito table.
	 */
	protected int idScore;

	/** 
	 * This attribute represents whether the primitive attribute idScore is null.
	 */
	protected boolean idScoreNull = true;

	/** 
	 * This attribute represents whether the attribute idScore has been modified since being read from the database.
	 */
	protected boolean idScoreModified = false;

	/** 
	 * This attribute maps to the column id_grupo_formulario_solic in the cr_producto_credito table.
	 */
	protected int idGrupoFormularioSolic;

	/** 
	 * This attribute represents whether the primitive attribute idGrupoFormularioSolic is null.
	 */
	protected boolean idGrupoFormularioSolicNull = true;

	/** 
	 * This attribute represents whether the attribute idGrupoFormularioSolic has been modified since being read from the database.
	 */
	protected boolean idGrupoFormularioSolicModified = false;

	/** 
	 * This attribute maps to the column id_grupo_formulario_verif in the cr_producto_credito table.
	 */
	protected int idGrupoFormularioVerif;

	/** 
	 * This attribute represents whether the primitive attribute idGrupoFormularioVerif is null.
	 */
	protected boolean idGrupoFormularioVerifNull = true;

	/** 
	 * This attribute represents whether the attribute idGrupoFormularioVerif has been modified since being read from the database.
	 */
	protected boolean idGrupoFormularioVerifModified = false;

	/** 
	 * This attribute maps to the column tipo_amortizacion in the cr_producto_credito table.
	 */
	protected String tipoAmortizacion;

	/** 
	 * This attribute represents whether the attribute tipoAmortizacion has been modified since being read from the database.
	 */
	protected boolean tipoAmortizacionModified = false;

	/** 
	 * This attribute maps to the column monto in the cr_producto_credito table.
	 */
	protected double monto;

	/** 
	 * This attribute represents whether the primitive attribute monto is null.
	 */
	protected boolean montoNull = true;

	/** 
	 * This attribute represents whether the attribute monto has been modified since being read from the database.
	 */
	protected boolean montoModified = false;

	/** 
	 * This attribute maps to the column plazo in the cr_producto_credito table.
	 */
	protected double plazo;

	/** 
	 * This attribute represents whether the primitive attribute plazo is null.
	 */
	protected boolean plazoNull = true;

	/** 
	 * This attribute represents whether the attribute plazo has been modified since being read from the database.
	 */
	protected boolean plazoModified = false;

	/** 
	 * This attribute maps to the column tasa_interes_anual in the cr_producto_credito table.
	 */
	protected double tasaInteresAnual;

	/** 
	 * This attribute represents whether the primitive attribute tasaInteresAnual is null.
	 */
	protected boolean tasaInteresAnualNull = true;

	/** 
	 * This attribute represents whether the attribute tasaInteresAnual has been modified since being read from the database.
	 */
	protected boolean tasaInteresAnualModified = false;

	/** 
	 * This attribute maps to the column tasa_interes_mora in the cr_producto_credito table.
	 */
	protected double tasaInteresMora;

	/** 
	 * This attribute represents whether the primitive attribute tasaInteresMora is null.
	 */
	protected boolean tasaInteresMoraNull = true;

	/** 
	 * This attribute represents whether the attribute tasaInteresMora has been modified since being read from the database.
	 */
	protected boolean tasaInteresMoraModified = false;

	/** 
	 * This attribute maps to the column gastos_cobranza in the cr_producto_credito table.
	 */
	protected double gastosCobranza;

	/** 
	 * This attribute represents whether the primitive attribute gastosCobranza is null.
	 */
	protected boolean gastosCobranzaNull = true;

	/** 
	 * This attribute represents whether the attribute gastosCobranza has been modified since being read from the database.
	 */
	protected boolean gastosCobranzaModified = false;

	/** 
	 * This attribute maps to the column costo_anual_total in the cr_producto_credito table.
	 */
	protected double costoAnualTotal;

	/** 
	 * This attribute represents whether the primitive attribute costoAnualTotal is null.
	 */
	protected boolean costoAnualTotalNull = true;

	/** 
	 * This attribute represents whether the attribute costoAnualTotal has been modified since being read from the database.
	 */
	protected boolean costoAnualTotalModified = false;

	/** 
	 * This attribute maps to the column garantias_descripcion in the cr_producto_credito table.
	 */
	protected String garantiasDescripcion;

	/** 
	 * This attribute represents whether the attribute garantiasDescripcion has been modified since being read from the database.
	 */
	protected boolean garantiasDescripcionModified = false;

	/** 
	 * This attribute maps to the column id_empresa in the cr_producto_credito table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column id_estatus in the cr_producto_credito table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/** 
	 * This attribute maps to the column id_grupo_formulario_fotos in the cr_producto_credito table.
	 */
	protected int idGrupoFormularioFotos;

	/** 
	 * This attribute represents whether the primitive attribute idGrupoFormularioFotos is null.
	 */
	protected boolean idGrupoFormularioFotosNull = true;

	/** 
	 * This attribute represents whether the attribute idGrupoFormularioFotos has been modified since being read from the database.
	 */
	protected boolean idGrupoFormularioFotosModified = false;

	/**
	 * Method 'CrProductoCredito'
	 * 
	 */
	public CrProductoCredito()
	{
	}

	/**
	 * Method 'getIdProductoCredito'
	 * 
	 * @return int
	 */
	public int getIdProductoCredito()
	{
		return idProductoCredito;
	}

	/**
	 * Method 'setIdProductoCredito'
	 * 
	 * @param idProductoCredito
	 */
	public void setIdProductoCredito(int idProductoCredito)
	{
		this.idProductoCredito = idProductoCredito;
		this.idProductoCreditoModified = true;
	}

	/** 
	 * Sets the value of idProductoCreditoModified
	 */
	public void setIdProductoCreditoModified(boolean idProductoCreditoModified)
	{
		this.idProductoCreditoModified = idProductoCreditoModified;
	}

	/** 
	 * Gets the value of idProductoCreditoModified
	 */
	public boolean isIdProductoCreditoModified()
	{
		return idProductoCreditoModified;
	}

	/**
	 * Method 'getIdProductoCreditoPadre'
	 * 
	 * @return int
	 */
	public int getIdProductoCreditoPadre()
	{
		return idProductoCreditoPadre;
	}

	/**
	 * Method 'setIdProductoCreditoPadre'
	 * 
	 * @param idProductoCreditoPadre
	 */
	public void setIdProductoCreditoPadre(int idProductoCreditoPadre)
	{
		this.idProductoCreditoPadre = idProductoCreditoPadre;
		this.idProductoCreditoPadreNull = false;
		this.idProductoCreditoPadreModified = true;
	}

	/**
	 * Method 'setIdProductoCreditoPadreNull'
	 * 
	 * @param value
	 */
	public void setIdProductoCreditoPadreNull(boolean value)
	{
		this.idProductoCreditoPadreNull = value;
		this.idProductoCreditoPadreModified = true;
	}

	/**
	 * Method 'isIdProductoCreditoPadreNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdProductoCreditoPadreNull()
	{
		return idProductoCreditoPadreNull;
	}

	/** 
	 * Sets the value of idProductoCreditoPadreModified
	 */
	public void setIdProductoCreditoPadreModified(boolean idProductoCreditoPadreModified)
	{
		this.idProductoCreditoPadreModified = idProductoCreditoPadreModified;
	}

	/** 
	 * Gets the value of idProductoCreditoPadreModified
	 */
	public boolean isIdProductoCreditoPadreModified()
	{
		return idProductoCreditoPadreModified;
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
		this.nombreModified = true;
	}

	/** 
	 * Sets the value of nombreModified
	 */
	public void setNombreModified(boolean nombreModified)
	{
		this.nombreModified = nombreModified;
	}

	/** 
	 * Gets the value of nombreModified
	 */
	public boolean isNombreModified()
	{
		return nombreModified;
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
		this.descripcionModified = true;
	}

	/** 
	 * Sets the value of descripcionModified
	 */
	public void setDescripcionModified(boolean descripcionModified)
	{
		this.descripcionModified = descripcionModified;
	}

	/** 
	 * Gets the value of descripcionModified
	 */
	public boolean isDescripcionModified()
	{
		return descripcionModified;
	}

	/**
	 * Method 'getFechaHrCreacion'
	 * 
	 * @return Date
	 */
	public Date getFechaHrCreacion()
	{
		return fechaHrCreacion;
	}

	/**
	 * Method 'setFechaHrCreacion'
	 * 
	 * @param fechaHrCreacion
	 */
	public void setFechaHrCreacion(Date fechaHrCreacion)
	{
		this.fechaHrCreacion = fechaHrCreacion;
		this.fechaHrCreacionModified = true;
	}

	/** 
	 * Sets the value of fechaHrCreacionModified
	 */
	public void setFechaHrCreacionModified(boolean fechaHrCreacionModified)
	{
		this.fechaHrCreacionModified = fechaHrCreacionModified;
	}

	/** 
	 * Gets the value of fechaHrCreacionModified
	 */
	public boolean isFechaHrCreacionModified()
	{
		return fechaHrCreacionModified;
	}

	/**
	 * Method 'getFechaHrUltimaEdicion'
	 * 
	 * @return Date
	 */
	public Date getFechaHrUltimaEdicion()
	{
		return fechaHrUltimaEdicion;
	}

	/**
	 * Method 'setFechaHrUltimaEdicion'
	 * 
	 * @param fechaHrUltimaEdicion
	 */
	public void setFechaHrUltimaEdicion(Date fechaHrUltimaEdicion)
	{
		this.fechaHrUltimaEdicion = fechaHrUltimaEdicion;
		this.fechaHrUltimaEdicionModified = true;
	}

	/** 
	 * Sets the value of fechaHrUltimaEdicionModified
	 */
	public void setFechaHrUltimaEdicionModified(boolean fechaHrUltimaEdicionModified)
	{
		this.fechaHrUltimaEdicionModified = fechaHrUltimaEdicionModified;
	}

	/** 
	 * Gets the value of fechaHrUltimaEdicionModified
	 */
	public boolean isFechaHrUltimaEdicionModified()
	{
		return fechaHrUltimaEdicionModified;
	}

	/**
	 * Method 'getIdUsuarioEdicion'
	 * 
	 * @return int
	 */
	public int getIdUsuarioEdicion()
	{
		return idUsuarioEdicion;
	}

	/**
	 * Method 'setIdUsuarioEdicion'
	 * 
	 * @param idUsuarioEdicion
	 */
	public void setIdUsuarioEdicion(int idUsuarioEdicion)
	{
		this.idUsuarioEdicion = idUsuarioEdicion;
		this.idUsuarioEdicionModified = true;
	}

	/** 
	 * Sets the value of idUsuarioEdicionModified
	 */
	public void setIdUsuarioEdicionModified(boolean idUsuarioEdicionModified)
	{
		this.idUsuarioEdicionModified = idUsuarioEdicionModified;
	}

	/** 
	 * Gets the value of idUsuarioEdicionModified
	 */
	public boolean isIdUsuarioEdicionModified()
	{
		return idUsuarioEdicionModified;
	}

	/**
	 * Method 'getIdScore'
	 * 
	 * @return int
	 */
	public int getIdScore()
	{
		return idScore;
	}

	/**
	 * Method 'setIdScore'
	 * 
	 * @param idScore
	 */
	public void setIdScore(int idScore)
	{
		this.idScore = idScore;
		this.idScoreNull = false;
		this.idScoreModified = true;
	}

	/**
	 * Method 'setIdScoreNull'
	 * 
	 * @param value
	 */
	public void setIdScoreNull(boolean value)
	{
		this.idScoreNull = value;
		this.idScoreModified = true;
	}

	/**
	 * Method 'isIdScoreNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdScoreNull()
	{
		return idScoreNull;
	}

	/** 
	 * Sets the value of idScoreModified
	 */
	public void setIdScoreModified(boolean idScoreModified)
	{
		this.idScoreModified = idScoreModified;
	}

	/** 
	 * Gets the value of idScoreModified
	 */
	public boolean isIdScoreModified()
	{
		return idScoreModified;
	}

	/**
	 * Method 'getIdGrupoFormularioSolic'
	 * 
	 * @return int
	 */
	public int getIdGrupoFormularioSolic()
	{
		return idGrupoFormularioSolic;
	}

	/**
	 * Method 'setIdGrupoFormularioSolic'
	 * 
	 * @param idGrupoFormularioSolic
	 */
	public void setIdGrupoFormularioSolic(int idGrupoFormularioSolic)
	{
		this.idGrupoFormularioSolic = idGrupoFormularioSolic;
		this.idGrupoFormularioSolicNull = false;
		this.idGrupoFormularioSolicModified = true;
	}

	/**
	 * Method 'setIdGrupoFormularioSolicNull'
	 * 
	 * @param value
	 */
	public void setIdGrupoFormularioSolicNull(boolean value)
	{
		this.idGrupoFormularioSolicNull = value;
		this.idGrupoFormularioSolicModified = true;
	}

	/**
	 * Method 'isIdGrupoFormularioSolicNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdGrupoFormularioSolicNull()
	{
		return idGrupoFormularioSolicNull;
	}

	/** 
	 * Sets the value of idGrupoFormularioSolicModified
	 */
	public void setIdGrupoFormularioSolicModified(boolean idGrupoFormularioSolicModified)
	{
		this.idGrupoFormularioSolicModified = idGrupoFormularioSolicModified;
	}

	/** 
	 * Gets the value of idGrupoFormularioSolicModified
	 */
	public boolean isIdGrupoFormularioSolicModified()
	{
		return idGrupoFormularioSolicModified;
	}

	/**
	 * Method 'getIdGrupoFormularioVerif'
	 * 
	 * @return int
	 */
	public int getIdGrupoFormularioVerif()
	{
		return idGrupoFormularioVerif;
	}

	/**
	 * Method 'setIdGrupoFormularioVerif'
	 * 
	 * @param idGrupoFormularioVerif
	 */
	public void setIdGrupoFormularioVerif(int idGrupoFormularioVerif)
	{
		this.idGrupoFormularioVerif = idGrupoFormularioVerif;
		this.idGrupoFormularioVerifNull = false;
		this.idGrupoFormularioVerifModified = true;
	}

	/**
	 * Method 'setIdGrupoFormularioVerifNull'
	 * 
	 * @param value
	 */
	public void setIdGrupoFormularioVerifNull(boolean value)
	{
		this.idGrupoFormularioVerifNull = value;
		this.idGrupoFormularioVerifModified = true;
	}

	/**
	 * Method 'isIdGrupoFormularioVerifNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdGrupoFormularioVerifNull()
	{
		return idGrupoFormularioVerifNull;
	}

	/** 
	 * Sets the value of idGrupoFormularioVerifModified
	 */
	public void setIdGrupoFormularioVerifModified(boolean idGrupoFormularioVerifModified)
	{
		this.idGrupoFormularioVerifModified = idGrupoFormularioVerifModified;
	}

	/** 
	 * Gets the value of idGrupoFormularioVerifModified
	 */
	public boolean isIdGrupoFormularioVerifModified()
	{
		return idGrupoFormularioVerifModified;
	}

	/**
	 * Method 'getTipoAmortizacion'
	 * 
	 * @return String
	 */
	public String getTipoAmortizacion()
	{
		return tipoAmortizacion;
	}

	/**
	 * Method 'setTipoAmortizacion'
	 * 
	 * @param tipoAmortizacion
	 */
	public void setTipoAmortizacion(String tipoAmortizacion)
	{
		this.tipoAmortizacion = tipoAmortizacion;
		this.tipoAmortizacionModified = true;
	}

	/** 
	 * Sets the value of tipoAmortizacionModified
	 */
	public void setTipoAmortizacionModified(boolean tipoAmortizacionModified)
	{
		this.tipoAmortizacionModified = tipoAmortizacionModified;
	}

	/** 
	 * Gets the value of tipoAmortizacionModified
	 */
	public boolean isTipoAmortizacionModified()
	{
		return tipoAmortizacionModified;
	}

	/**
	 * Method 'getMonto'
	 * 
	 * @return double
	 */
	public double getMonto()
	{
		return monto;
	}

	/**
	 * Method 'setMonto'
	 * 
	 * @param monto
	 */
	public void setMonto(double monto)
	{
		this.monto = monto;
		this.montoNull = false;
		this.montoModified = true;
	}

	/**
	 * Method 'setMontoNull'
	 * 
	 * @param value
	 */
	public void setMontoNull(boolean value)
	{
		this.montoNull = value;
		this.montoModified = true;
	}

	/**
	 * Method 'isMontoNull'
	 * 
	 * @return boolean
	 */
	public boolean isMontoNull()
	{
		return montoNull;
	}

	/** 
	 * Sets the value of montoModified
	 */
	public void setMontoModified(boolean montoModified)
	{
		this.montoModified = montoModified;
	}

	/** 
	 * Gets the value of montoModified
	 */
	public boolean isMontoModified()
	{
		return montoModified;
	}

	/**
	 * Method 'getPlazo'
	 * 
	 * @return double
	 */
	public double getPlazo()
	{
		return plazo;
	}

	/**
	 * Method 'setPlazo'
	 * 
	 * @param plazo
	 */
	public void setPlazo(double plazo)
	{
		this.plazo = plazo;
		this.plazoNull = false;
		this.plazoModified = true;
	}

	/**
	 * Method 'setPlazoNull'
	 * 
	 * @param value
	 */
	public void setPlazoNull(boolean value)
	{
		this.plazoNull = value;
		this.plazoModified = true;
	}

	/**
	 * Method 'isPlazoNull'
	 * 
	 * @return boolean
	 */
	public boolean isPlazoNull()
	{
		return plazoNull;
	}

	/** 
	 * Sets the value of plazoModified
	 */
	public void setPlazoModified(boolean plazoModified)
	{
		this.plazoModified = plazoModified;
	}

	/** 
	 * Gets the value of plazoModified
	 */
	public boolean isPlazoModified()
	{
		return plazoModified;
	}

	/**
	 * Method 'getTasaInteresAnual'
	 * 
	 * @return double
	 */
	public double getTasaInteresAnual()
	{
		return tasaInteresAnual;
	}

	/**
	 * Method 'setTasaInteresAnual'
	 * 
	 * @param tasaInteresAnual
	 */
	public void setTasaInteresAnual(double tasaInteresAnual)
	{
		this.tasaInteresAnual = tasaInteresAnual;
		this.tasaInteresAnualNull = false;
		this.tasaInteresAnualModified = true;
	}

	/**
	 * Method 'setTasaInteresAnualNull'
	 * 
	 * @param value
	 */
	public void setTasaInteresAnualNull(boolean value)
	{
		this.tasaInteresAnualNull = value;
		this.tasaInteresAnualModified = true;
	}

	/**
	 * Method 'isTasaInteresAnualNull'
	 * 
	 * @return boolean
	 */
	public boolean isTasaInteresAnualNull()
	{
		return tasaInteresAnualNull;
	}

	/** 
	 * Sets the value of tasaInteresAnualModified
	 */
	public void setTasaInteresAnualModified(boolean tasaInteresAnualModified)
	{
		this.tasaInteresAnualModified = tasaInteresAnualModified;
	}

	/** 
	 * Gets the value of tasaInteresAnualModified
	 */
	public boolean isTasaInteresAnualModified()
	{
		return tasaInteresAnualModified;
	}

	/**
	 * Method 'getTasaInteresMora'
	 * 
	 * @return double
	 */
	public double getTasaInteresMora()
	{
		return tasaInteresMora;
	}

	/**
	 * Method 'setTasaInteresMora'
	 * 
	 * @param tasaInteresMora
	 */
	public void setTasaInteresMora(double tasaInteresMora)
	{
		this.tasaInteresMora = tasaInteresMora;
		this.tasaInteresMoraNull = false;
		this.tasaInteresMoraModified = true;
	}

	/**
	 * Method 'setTasaInteresMoraNull'
	 * 
	 * @param value
	 */
	public void setTasaInteresMoraNull(boolean value)
	{
		this.tasaInteresMoraNull = value;
		this.tasaInteresMoraModified = true;
	}

	/**
	 * Method 'isTasaInteresMoraNull'
	 * 
	 * @return boolean
	 */
	public boolean isTasaInteresMoraNull()
	{
		return tasaInteresMoraNull;
	}

	/** 
	 * Sets the value of tasaInteresMoraModified
	 */
	public void setTasaInteresMoraModified(boolean tasaInteresMoraModified)
	{
		this.tasaInteresMoraModified = tasaInteresMoraModified;
	}

	/** 
	 * Gets the value of tasaInteresMoraModified
	 */
	public boolean isTasaInteresMoraModified()
	{
		return tasaInteresMoraModified;
	}

	/**
	 * Method 'getGastosCobranza'
	 * 
	 * @return double
	 */
	public double getGastosCobranza()
	{
		return gastosCobranza;
	}

	/**
	 * Method 'setGastosCobranza'
	 * 
	 * @param gastosCobranza
	 */
	public void setGastosCobranza(double gastosCobranza)
	{
		this.gastosCobranza = gastosCobranza;
		this.gastosCobranzaNull = false;
		this.gastosCobranzaModified = true;
	}

	/**
	 * Method 'setGastosCobranzaNull'
	 * 
	 * @param value
	 */
	public void setGastosCobranzaNull(boolean value)
	{
		this.gastosCobranzaNull = value;
		this.gastosCobranzaModified = true;
	}

	/**
	 * Method 'isGastosCobranzaNull'
	 * 
	 * @return boolean
	 */
	public boolean isGastosCobranzaNull()
	{
		return gastosCobranzaNull;
	}

	/** 
	 * Sets the value of gastosCobranzaModified
	 */
	public void setGastosCobranzaModified(boolean gastosCobranzaModified)
	{
		this.gastosCobranzaModified = gastosCobranzaModified;
	}

	/** 
	 * Gets the value of gastosCobranzaModified
	 */
	public boolean isGastosCobranzaModified()
	{
		return gastosCobranzaModified;
	}

	/**
	 * Method 'getCostoAnualTotal'
	 * 
	 * @return double
	 */
	public double getCostoAnualTotal()
	{
		return costoAnualTotal;
	}

	/**
	 * Method 'setCostoAnualTotal'
	 * 
	 * @param costoAnualTotal
	 */
	public void setCostoAnualTotal(double costoAnualTotal)
	{
		this.costoAnualTotal = costoAnualTotal;
		this.costoAnualTotalNull = false;
		this.costoAnualTotalModified = true;
	}

	/**
	 * Method 'setCostoAnualTotalNull'
	 * 
	 * @param value
	 */
	public void setCostoAnualTotalNull(boolean value)
	{
		this.costoAnualTotalNull = value;
		this.costoAnualTotalModified = true;
	}

	/**
	 * Method 'isCostoAnualTotalNull'
	 * 
	 * @return boolean
	 */
	public boolean isCostoAnualTotalNull()
	{
		return costoAnualTotalNull;
	}

	/** 
	 * Sets the value of costoAnualTotalModified
	 */
	public void setCostoAnualTotalModified(boolean costoAnualTotalModified)
	{
		this.costoAnualTotalModified = costoAnualTotalModified;
	}

	/** 
	 * Gets the value of costoAnualTotalModified
	 */
	public boolean isCostoAnualTotalModified()
	{
		return costoAnualTotalModified;
	}

	/**
	 * Method 'getGarantiasDescripcion'
	 * 
	 * @return String
	 */
	public String getGarantiasDescripcion()
	{
		return garantiasDescripcion;
	}

	/**
	 * Method 'setGarantiasDescripcion'
	 * 
	 * @param garantiasDescripcion
	 */
	public void setGarantiasDescripcion(String garantiasDescripcion)
	{
		this.garantiasDescripcion = garantiasDescripcion;
		this.garantiasDescripcionModified = true;
	}

	/** 
	 * Sets the value of garantiasDescripcionModified
	 */
	public void setGarantiasDescripcionModified(boolean garantiasDescripcionModified)
	{
		this.garantiasDescripcionModified = garantiasDescripcionModified;
	}

	/** 
	 * Gets the value of garantiasDescripcionModified
	 */
	public boolean isGarantiasDescripcionModified()
	{
		return garantiasDescripcionModified;
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
		this.idEmpresaModified = true;
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
		this.idEstatusModified = true;
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
	 * Method 'getIdGrupoFormularioFotos'
	 * 
	 * @return int
	 */
	public int getIdGrupoFormularioFotos()
	{
		return idGrupoFormularioFotos;
	}

	/**
	 * Method 'setIdGrupoFormularioFotos'
	 * 
	 * @param idGrupoFormularioFotos
	 */
	public void setIdGrupoFormularioFotos(int idGrupoFormularioFotos)
	{
		this.idGrupoFormularioFotos = idGrupoFormularioFotos;
		this.idGrupoFormularioFotosNull = false;
		this.idGrupoFormularioFotosModified = true;
	}

	/**
	 * Method 'setIdGrupoFormularioFotosNull'
	 * 
	 * @param value
	 */
	public void setIdGrupoFormularioFotosNull(boolean value)
	{
		this.idGrupoFormularioFotosNull = value;
		this.idGrupoFormularioFotosModified = true;
	}

	/**
	 * Method 'isIdGrupoFormularioFotosNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdGrupoFormularioFotosNull()
	{
		return idGrupoFormularioFotosNull;
	}

	/** 
	 * Sets the value of idGrupoFormularioFotosModified
	 */
	public void setIdGrupoFormularioFotosModified(boolean idGrupoFormularioFotosModified)
	{
		this.idGrupoFormularioFotosModified = idGrupoFormularioFotosModified;
	}

	/** 
	 * Gets the value of idGrupoFormularioFotosModified
	 */
	public boolean isIdGrupoFormularioFotosModified()
	{
		return idGrupoFormularioFotosModified;
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
		
		if (!(_other instanceof CrProductoCredito)) {
			return false;
		}
		
		final CrProductoCredito _cast = (CrProductoCredito) _other;
		if (idProductoCredito != _cast.idProductoCredito) {
			return false;
		}
		
		if (idProductoCreditoModified != _cast.idProductoCreditoModified) {
			return false;
		}
		
		if (idProductoCreditoPadre != _cast.idProductoCreditoPadre) {
			return false;
		}
		
		if (idProductoCreditoPadreNull != _cast.idProductoCreditoPadreNull) {
			return false;
		}
		
		if (idProductoCreditoPadreModified != _cast.idProductoCreditoPadreModified) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (nombreModified != _cast.nombreModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		if (fechaHrCreacion == null ? _cast.fechaHrCreacion != fechaHrCreacion : !fechaHrCreacion.equals( _cast.fechaHrCreacion )) {
			return false;
		}
		
		if (fechaHrCreacionModified != _cast.fechaHrCreacionModified) {
			return false;
		}
		
		if (fechaHrUltimaEdicion == null ? _cast.fechaHrUltimaEdicion != fechaHrUltimaEdicion : !fechaHrUltimaEdicion.equals( _cast.fechaHrUltimaEdicion )) {
			return false;
		}
		
		if (fechaHrUltimaEdicionModified != _cast.fechaHrUltimaEdicionModified) {
			return false;
		}
		
		if (idUsuarioEdicion != _cast.idUsuarioEdicion) {
			return false;
		}
		
		if (idUsuarioEdicionModified != _cast.idUsuarioEdicionModified) {
			return false;
		}
		
		if (idScore != _cast.idScore) {
			return false;
		}
		
		if (idScoreNull != _cast.idScoreNull) {
			return false;
		}
		
		if (idScoreModified != _cast.idScoreModified) {
			return false;
		}
		
		if (idGrupoFormularioSolic != _cast.idGrupoFormularioSolic) {
			return false;
		}
		
		if (idGrupoFormularioSolicNull != _cast.idGrupoFormularioSolicNull) {
			return false;
		}
		
		if (idGrupoFormularioSolicModified != _cast.idGrupoFormularioSolicModified) {
			return false;
		}
		
		if (idGrupoFormularioVerif != _cast.idGrupoFormularioVerif) {
			return false;
		}
		
		if (idGrupoFormularioVerifNull != _cast.idGrupoFormularioVerifNull) {
			return false;
		}
		
		if (idGrupoFormularioVerifModified != _cast.idGrupoFormularioVerifModified) {
			return false;
		}
		
		if (tipoAmortizacion == null ? _cast.tipoAmortizacion != tipoAmortizacion : !tipoAmortizacion.equals( _cast.tipoAmortizacion )) {
			return false;
		}
		
		if (tipoAmortizacionModified != _cast.tipoAmortizacionModified) {
			return false;
		}
		
		if (monto != _cast.monto) {
			return false;
		}
		
		if (montoNull != _cast.montoNull) {
			return false;
		}
		
		if (montoModified != _cast.montoModified) {
			return false;
		}
		
		if (plazo != _cast.plazo) {
			return false;
		}
		
		if (plazoNull != _cast.plazoNull) {
			return false;
		}
		
		if (plazoModified != _cast.plazoModified) {
			return false;
		}
		
		if (tasaInteresAnual != _cast.tasaInteresAnual) {
			return false;
		}
		
		if (tasaInteresAnualNull != _cast.tasaInteresAnualNull) {
			return false;
		}
		
		if (tasaInteresAnualModified != _cast.tasaInteresAnualModified) {
			return false;
		}
		
		if (tasaInteresMora != _cast.tasaInteresMora) {
			return false;
		}
		
		if (tasaInteresMoraNull != _cast.tasaInteresMoraNull) {
			return false;
		}
		
		if (tasaInteresMoraModified != _cast.tasaInteresMoraModified) {
			return false;
		}
		
		if (gastosCobranza != _cast.gastosCobranza) {
			return false;
		}
		
		if (gastosCobranzaNull != _cast.gastosCobranzaNull) {
			return false;
		}
		
		if (gastosCobranzaModified != _cast.gastosCobranzaModified) {
			return false;
		}
		
		if (costoAnualTotal != _cast.costoAnualTotal) {
			return false;
		}
		
		if (costoAnualTotalNull != _cast.costoAnualTotalNull) {
			return false;
		}
		
		if (costoAnualTotalModified != _cast.costoAnualTotalModified) {
			return false;
		}
		
		if (garantiasDescripcion == null ? _cast.garantiasDescripcion != garantiasDescripcion : !garantiasDescripcion.equals( _cast.garantiasDescripcion )) {
			return false;
		}
		
		if (garantiasDescripcionModified != _cast.garantiasDescripcionModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
			return false;
		}
		
		if (idGrupoFormularioFotos != _cast.idGrupoFormularioFotos) {
			return false;
		}
		
		if (idGrupoFormularioFotosNull != _cast.idGrupoFormularioFotosNull) {
			return false;
		}
		
		if (idGrupoFormularioFotosModified != _cast.idGrupoFormularioFotosModified) {
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
		_hashCode = 29 * _hashCode + idProductoCredito;
		_hashCode = 29 * _hashCode + (idProductoCreditoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idProductoCreditoPadre;
		_hashCode = 29 * _hashCode + (idProductoCreditoPadreNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idProductoCreditoPadreModified ? 1 : 0);
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		if (fechaHrCreacion != null) {
			_hashCode = 29 * _hashCode + fechaHrCreacion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaHrCreacionModified ? 1 : 0);
		if (fechaHrUltimaEdicion != null) {
			_hashCode = 29 * _hashCode + fechaHrUltimaEdicion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaHrUltimaEdicionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idUsuarioEdicion;
		_hashCode = 29 * _hashCode + (idUsuarioEdicionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idScore;
		_hashCode = 29 * _hashCode + (idScoreNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idScoreModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idGrupoFormularioSolic;
		_hashCode = 29 * _hashCode + (idGrupoFormularioSolicNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idGrupoFormularioSolicModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idGrupoFormularioVerif;
		_hashCode = 29 * _hashCode + (idGrupoFormularioVerifNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idGrupoFormularioVerifModified ? 1 : 0);
		if (tipoAmortizacion != null) {
			_hashCode = 29 * _hashCode + tipoAmortizacion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (tipoAmortizacionModified ? 1 : 0);
		long temp_monto = Double.doubleToLongBits(monto);
		_hashCode = 29 * _hashCode + (int) (temp_monto ^ (temp_monto >>> 32));
		_hashCode = 29 * _hashCode + (montoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (montoModified ? 1 : 0);
		long temp_plazo = Double.doubleToLongBits(plazo);
		_hashCode = 29 * _hashCode + (int) (temp_plazo ^ (temp_plazo >>> 32));
		_hashCode = 29 * _hashCode + (plazoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (plazoModified ? 1 : 0);
		long temp_tasaInteresAnual = Double.doubleToLongBits(tasaInteresAnual);
		_hashCode = 29 * _hashCode + (int) (temp_tasaInteresAnual ^ (temp_tasaInteresAnual >>> 32));
		_hashCode = 29 * _hashCode + (tasaInteresAnualNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (tasaInteresAnualModified ? 1 : 0);
		long temp_tasaInteresMora = Double.doubleToLongBits(tasaInteresMora);
		_hashCode = 29 * _hashCode + (int) (temp_tasaInteresMora ^ (temp_tasaInteresMora >>> 32));
		_hashCode = 29 * _hashCode + (tasaInteresMoraNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (tasaInteresMoraModified ? 1 : 0);
		long temp_gastosCobranza = Double.doubleToLongBits(gastosCobranza);
		_hashCode = 29 * _hashCode + (int) (temp_gastosCobranza ^ (temp_gastosCobranza >>> 32));
		_hashCode = 29 * _hashCode + (gastosCobranzaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (gastosCobranzaModified ? 1 : 0);
		long temp_costoAnualTotal = Double.doubleToLongBits(costoAnualTotal);
		_hashCode = 29 * _hashCode + (int) (temp_costoAnualTotal ^ (temp_costoAnualTotal >>> 32));
		_hashCode = 29 * _hashCode + (costoAnualTotalNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (costoAnualTotalModified ? 1 : 0);
		if (garantiasDescripcion != null) {
			_hashCode = 29 * _hashCode + garantiasDescripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (garantiasDescripcionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idGrupoFormularioFotos;
		_hashCode = 29 * _hashCode + (idGrupoFormularioFotosNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idGrupoFormularioFotosModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CrProductoCreditoPk
	 */
	public CrProductoCreditoPk createPk()
	{
		return new CrProductoCreditoPk(idProductoCredito);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.CrProductoCredito: " );
		ret.append( "idProductoCredito=" + idProductoCredito );
		ret.append( ", idProductoCreditoPadre=" + idProductoCreditoPadre );
		ret.append( ", nombre=" + nombre );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", fechaHrCreacion=" + fechaHrCreacion );
		ret.append( ", fechaHrUltimaEdicion=" + fechaHrUltimaEdicion );
		ret.append( ", idUsuarioEdicion=" + idUsuarioEdicion );
		ret.append( ", idScore=" + idScore );
		ret.append( ", idGrupoFormularioSolic=" + idGrupoFormularioSolic );
		ret.append( ", idGrupoFormularioVerif=" + idGrupoFormularioVerif );
		ret.append( ", tipoAmortizacion=" + tipoAmortizacion );
		ret.append( ", monto=" + monto );
		ret.append( ", plazo=" + plazo );
		ret.append( ", tasaInteresAnual=" + tasaInteresAnual );
		ret.append( ", tasaInteresMora=" + tasaInteresMora );
		ret.append( ", gastosCobranza=" + gastosCobranza );
		ret.append( ", costoAnualTotal=" + costoAnualTotal );
		ret.append( ", garantiasDescripcion=" + garantiasDescripcion );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", idGrupoFormularioFotos=" + idGrupoFormularioFotos );
		return ret.toString();
	}

}