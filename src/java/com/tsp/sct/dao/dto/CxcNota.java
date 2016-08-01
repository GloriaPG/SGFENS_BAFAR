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

public class CxcNota implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CXC_NOTA in the cxc_nota table.
	 */
	protected int idCxcNota;

	/** 
	 * This attribute represents whether the attribute idCxcNota has been modified since being read from the database.
	 */
	protected boolean idCxcNotaModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the cxc_nota table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column ID_USUARIO in the cxc_nota table.
	 */
	protected int idUsuario;

	/** 
	 * This attribute represents whether the attribute idUsuario has been modified since being read from the database.
	 */
	protected boolean idUsuarioModified = false;

	/** 
	 * This attribute maps to the column ID_COMPROBANTE_FISCAL in the cxc_nota table.
	 */
	protected int idComprobanteFiscal;

	/** 
	 * This attribute represents whether the primitive attribute idComprobanteFiscal is null.
	 */
	protected boolean idComprobanteFiscalNull = true;

	/** 
	 * This attribute represents whether the attribute idComprobanteFiscal has been modified since being read from the database.
	 */
	protected boolean idComprobanteFiscalModified = false;

	/** 
	 * This attribute maps to the column ID_PEDIDO in the cxc_nota table.
	 */
	protected int idPedido;

	/** 
	 * This attribute represents whether the primitive attribute idPedido is null.
	 */
	protected boolean idPedidoNull = true;

	/** 
	 * This attribute represents whether the attribute idPedido has been modified since being read from the database.
	 */
	protected boolean idPedidoModified = false;

	/** 
	 * This attribute maps to the column ID_CXP_VALE_AZUL in the cxc_nota table.
	 */
	protected int idCxpValeAzul;

	/** 
	 * This attribute represents whether the primitive attribute idCxpValeAzul is null.
	 */
	protected boolean idCxpValeAzulNull = true;

	/** 
	 * This attribute represents whether the attribute idCxpValeAzul has been modified since being read from the database.
	 */
	protected boolean idCxpValeAzulModified = false;

	/** 
	 * This attribute maps to the column NOTA in the cxc_nota table.
	 */
	protected String nota;

	/** 
	 * This attribute represents whether the attribute nota has been modified since being read from the database.
	 */
	protected boolean notaModified = false;

	/** 
	 * This attribute maps to the column FECHA_HORA_CAPTURA in the cxc_nota table.
	 */
	protected Date fechaHoraCaptura;

	/** 
	 * This attribute represents whether the attribute fechaHoraCaptura has been modified since being read from the database.
	 */
	protected boolean fechaHoraCapturaModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the cxc_nota table.
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
	 * This attribute maps to the column ID_CXP_COMPROBANTE_FISCAL in the cxc_nota table.
	 */
	protected int idCxpComprobanteFiscal;

	/** 
	 * This attribute represents whether the primitive attribute idCxpComprobanteFiscal is null.
	 */
	protected boolean idCxpComprobanteFiscalNull = true;

	/** 
	 * This attribute represents whether the attribute idCxpComprobanteFiscal has been modified since being read from the database.
	 */
	protected boolean idCxpComprobanteFiscalModified = false;

	/** 
	 * This attribute maps to the column ID_CR_CRED_CLIENTE in the cxc_nota table.
	 */
	protected int idCrCredCliente;

	/** 
	 * This attribute represents whether the primitive attribute idCrCredCliente is null.
	 */
	protected boolean idCrCredClienteNull = true;

	/** 
	 * This attribute represents whether the attribute idCrCredCliente has been modified since being read from the database.
	 */
	protected boolean idCrCredClienteModified = false;

	/**
	 * Method 'CxcNota'
	 * 
	 */
	public CxcNota()
	{
	}

	/**
	 * Method 'getIdCxcNota'
	 * 
	 * @return int
	 */
	public int getIdCxcNota()
	{
		return idCxcNota;
	}

	/**
	 * Method 'setIdCxcNota'
	 * 
	 * @param idCxcNota
	 */
	public void setIdCxcNota(int idCxcNota)
	{
		this.idCxcNota = idCxcNota;
		this.idCxcNotaModified = true;
	}

	/** 
	 * Sets the value of idCxcNotaModified
	 */
	public void setIdCxcNotaModified(boolean idCxcNotaModified)
	{
		this.idCxcNotaModified = idCxcNotaModified;
	}

	/** 
	 * Gets the value of idCxcNotaModified
	 */
	public boolean isIdCxcNotaModified()
	{
		return idCxcNotaModified;
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
	 * Method 'getIdUsuario'
	 * 
	 * @return int
	 */
	public int getIdUsuario()
	{
		return idUsuario;
	}

	/**
	 * Method 'setIdUsuario'
	 * 
	 * @param idUsuario
	 */
	public void setIdUsuario(int idUsuario)
	{
		this.idUsuario = idUsuario;
		this.idUsuarioModified = true;
	}

	/** 
	 * Sets the value of idUsuarioModified
	 */
	public void setIdUsuarioModified(boolean idUsuarioModified)
	{
		this.idUsuarioModified = idUsuarioModified;
	}

	/** 
	 * Gets the value of idUsuarioModified
	 */
	public boolean isIdUsuarioModified()
	{
		return idUsuarioModified;
	}

	/**
	 * Method 'getIdComprobanteFiscal'
	 * 
	 * @return int
	 */
	public int getIdComprobanteFiscal()
	{
		return idComprobanteFiscal;
	}

	/**
	 * Method 'setIdComprobanteFiscal'
	 * 
	 * @param idComprobanteFiscal
	 */
	public void setIdComprobanteFiscal(int idComprobanteFiscal)
	{
		this.idComprobanteFiscal = idComprobanteFiscal;
		this.idComprobanteFiscalNull = false;
		this.idComprobanteFiscalModified = true;
	}

	/**
	 * Method 'setIdComprobanteFiscalNull'
	 * 
	 * @param value
	 */
	public void setIdComprobanteFiscalNull(boolean value)
	{
		this.idComprobanteFiscalNull = value;
		this.idComprobanteFiscalModified = true;
	}

	/**
	 * Method 'isIdComprobanteFiscalNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdComprobanteFiscalNull()
	{
		return idComprobanteFiscalNull;
	}

	/** 
	 * Sets the value of idComprobanteFiscalModified
	 */
	public void setIdComprobanteFiscalModified(boolean idComprobanteFiscalModified)
	{
		this.idComprobanteFiscalModified = idComprobanteFiscalModified;
	}

	/** 
	 * Gets the value of idComprobanteFiscalModified
	 */
	public boolean isIdComprobanteFiscalModified()
	{
		return idComprobanteFiscalModified;
	}

	/**
	 * Method 'getIdPedido'
	 * 
	 * @return int
	 */
	public int getIdPedido()
	{
		return idPedido;
	}

	/**
	 * Method 'setIdPedido'
	 * 
	 * @param idPedido
	 */
	public void setIdPedido(int idPedido)
	{
		this.idPedido = idPedido;
		this.idPedidoNull = false;
		this.idPedidoModified = true;
	}

	/**
	 * Method 'setIdPedidoNull'
	 * 
	 * @param value
	 */
	public void setIdPedidoNull(boolean value)
	{
		this.idPedidoNull = value;
		this.idPedidoModified = true;
	}

	/**
	 * Method 'isIdPedidoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdPedidoNull()
	{
		return idPedidoNull;
	}

	/** 
	 * Sets the value of idPedidoModified
	 */
	public void setIdPedidoModified(boolean idPedidoModified)
	{
		this.idPedidoModified = idPedidoModified;
	}

	/** 
	 * Gets the value of idPedidoModified
	 */
	public boolean isIdPedidoModified()
	{
		return idPedidoModified;
	}

	/**
	 * Method 'getIdCxpValeAzul'
	 * 
	 * @return int
	 */
	public int getIdCxpValeAzul()
	{
		return idCxpValeAzul;
	}

	/**
	 * Method 'setIdCxpValeAzul'
	 * 
	 * @param idCxpValeAzul
	 */
	public void setIdCxpValeAzul(int idCxpValeAzul)
	{
		this.idCxpValeAzul = idCxpValeAzul;
		this.idCxpValeAzulNull = false;
		this.idCxpValeAzulModified = true;
	}

	/**
	 * Method 'setIdCxpValeAzulNull'
	 * 
	 * @param value
	 */
	public void setIdCxpValeAzulNull(boolean value)
	{
		this.idCxpValeAzulNull = value;
		this.idCxpValeAzulModified = true;
	}

	/**
	 * Method 'isIdCxpValeAzulNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdCxpValeAzulNull()
	{
		return idCxpValeAzulNull;
	}

	/** 
	 * Sets the value of idCxpValeAzulModified
	 */
	public void setIdCxpValeAzulModified(boolean idCxpValeAzulModified)
	{
		this.idCxpValeAzulModified = idCxpValeAzulModified;
	}

	/** 
	 * Gets the value of idCxpValeAzulModified
	 */
	public boolean isIdCxpValeAzulModified()
	{
		return idCxpValeAzulModified;
	}

	/**
	 * Method 'getNota'
	 * 
	 * @return String
	 */
	public String getNota()
	{
		return nota;
	}

	/**
	 * Method 'setNota'
	 * 
	 * @param nota
	 */
	public void setNota(String nota)
	{
		this.nota = nota;
		this.notaModified = true;
	}

	/** 
	 * Sets the value of notaModified
	 */
	public void setNotaModified(boolean notaModified)
	{
		this.notaModified = notaModified;
	}

	/** 
	 * Gets the value of notaModified
	 */
	public boolean isNotaModified()
	{
		return notaModified;
	}

	/**
	 * Method 'getFechaHoraCaptura'
	 * 
	 * @return Date
	 */
	public Date getFechaHoraCaptura()
	{
		return fechaHoraCaptura;
	}

	/**
	 * Method 'setFechaHoraCaptura'
	 * 
	 * @param fechaHoraCaptura
	 */
	public void setFechaHoraCaptura(Date fechaHoraCaptura)
	{
		this.fechaHoraCaptura = fechaHoraCaptura;
		this.fechaHoraCapturaModified = true;
	}

	/** 
	 * Sets the value of fechaHoraCapturaModified
	 */
	public void setFechaHoraCapturaModified(boolean fechaHoraCapturaModified)
	{
		this.fechaHoraCapturaModified = fechaHoraCapturaModified;
	}

	/** 
	 * Gets the value of fechaHoraCapturaModified
	 */
	public boolean isFechaHoraCapturaModified()
	{
		return fechaHoraCapturaModified;
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
	 * Method 'getIdCxpComprobanteFiscal'
	 * 
	 * @return int
	 */
	public int getIdCxpComprobanteFiscal()
	{
		return idCxpComprobanteFiscal;
	}

	/**
	 * Method 'setIdCxpComprobanteFiscal'
	 * 
	 * @param idCxpComprobanteFiscal
	 */
	public void setIdCxpComprobanteFiscal(int idCxpComprobanteFiscal)
	{
		this.idCxpComprobanteFiscal = idCxpComprobanteFiscal;
		this.idCxpComprobanteFiscalNull = false;
		this.idCxpComprobanteFiscalModified = true;
	}

	/**
	 * Method 'setIdCxpComprobanteFiscalNull'
	 * 
	 * @param value
	 */
	public void setIdCxpComprobanteFiscalNull(boolean value)
	{
		this.idCxpComprobanteFiscalNull = value;
		this.idCxpComprobanteFiscalModified = true;
	}

	/**
	 * Method 'isIdCxpComprobanteFiscalNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdCxpComprobanteFiscalNull()
	{
		return idCxpComprobanteFiscalNull;
	}

	/** 
	 * Sets the value of idCxpComprobanteFiscalModified
	 */
	public void setIdCxpComprobanteFiscalModified(boolean idCxpComprobanteFiscalModified)
	{
		this.idCxpComprobanteFiscalModified = idCxpComprobanteFiscalModified;
	}

	/** 
	 * Gets the value of idCxpComprobanteFiscalModified
	 */
	public boolean isIdCxpComprobanteFiscalModified()
	{
		return idCxpComprobanteFiscalModified;
	}

	/**
	 * Method 'getIdCrCredCliente'
	 * 
	 * @return int
	 */
	public int getIdCrCredCliente()
	{
		return idCrCredCliente;
	}

	/**
	 * Method 'setIdCrCredCliente'
	 * 
	 * @param idCrCredCliente
	 */
	public void setIdCrCredCliente(int idCrCredCliente)
	{
		this.idCrCredCliente = idCrCredCliente;
		this.idCrCredClienteNull = false;
		this.idCrCredClienteModified = true;
	}

	/**
	 * Method 'setIdCrCredClienteNull'
	 * 
	 * @param value
	 */
	public void setIdCrCredClienteNull(boolean value)
	{
		this.idCrCredClienteNull = value;
		this.idCrCredClienteModified = true;
	}

	/**
	 * Method 'isIdCrCredClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdCrCredClienteNull()
	{
		return idCrCredClienteNull;
	}

	/** 
	 * Sets the value of idCrCredClienteModified
	 */
	public void setIdCrCredClienteModified(boolean idCrCredClienteModified)
	{
		this.idCrCredClienteModified = idCrCredClienteModified;
	}

	/** 
	 * Gets the value of idCrCredClienteModified
	 */
	public boolean isIdCrCredClienteModified()
	{
		return idCrCredClienteModified;
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
		
		if (!(_other instanceof CxcNota)) {
			return false;
		}
		
		final CxcNota _cast = (CxcNota) _other;
		if (idCxcNota != _cast.idCxcNota) {
			return false;
		}
		
		if (idCxcNotaModified != _cast.idCxcNotaModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (idUsuario != _cast.idUsuario) {
			return false;
		}
		
		if (idUsuarioModified != _cast.idUsuarioModified) {
			return false;
		}
		
		if (idComprobanteFiscal != _cast.idComprobanteFiscal) {
			return false;
		}
		
		if (idComprobanteFiscalNull != _cast.idComprobanteFiscalNull) {
			return false;
		}
		
		if (idComprobanteFiscalModified != _cast.idComprobanteFiscalModified) {
			return false;
		}
		
		if (idPedido != _cast.idPedido) {
			return false;
		}
		
		if (idPedidoNull != _cast.idPedidoNull) {
			return false;
		}
		
		if (idPedidoModified != _cast.idPedidoModified) {
			return false;
		}
		
		if (idCxpValeAzul != _cast.idCxpValeAzul) {
			return false;
		}
		
		if (idCxpValeAzulNull != _cast.idCxpValeAzulNull) {
			return false;
		}
		
		if (idCxpValeAzulModified != _cast.idCxpValeAzulModified) {
			return false;
		}
		
		if (nota == null ? _cast.nota != nota : !nota.equals( _cast.nota )) {
			return false;
		}
		
		if (notaModified != _cast.notaModified) {
			return false;
		}
		
		if (fechaHoraCaptura == null ? _cast.fechaHoraCaptura != fechaHoraCaptura : !fechaHoraCaptura.equals( _cast.fechaHoraCaptura )) {
			return false;
		}
		
		if (fechaHoraCapturaModified != _cast.fechaHoraCapturaModified) {
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
		
		if (idCxpComprobanteFiscal != _cast.idCxpComprobanteFiscal) {
			return false;
		}
		
		if (idCxpComprobanteFiscalNull != _cast.idCxpComprobanteFiscalNull) {
			return false;
		}
		
		if (idCxpComprobanteFiscalModified != _cast.idCxpComprobanteFiscalModified) {
			return false;
		}
		
		if (idCrCredCliente != _cast.idCrCredCliente) {
			return false;
		}
		
		if (idCrCredClienteNull != _cast.idCrCredClienteNull) {
			return false;
		}
		
		if (idCrCredClienteModified != _cast.idCrCredClienteModified) {
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
		_hashCode = 29 * _hashCode + idCxcNota;
		_hashCode = 29 * _hashCode + (idCxcNotaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idUsuario;
		_hashCode = 29 * _hashCode + (idUsuarioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idComprobanteFiscal;
		_hashCode = 29 * _hashCode + (idComprobanteFiscalNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idComprobanteFiscalModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idPedido;
		_hashCode = 29 * _hashCode + (idPedidoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idPedidoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCxpValeAzul;
		_hashCode = 29 * _hashCode + (idCxpValeAzulNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idCxpValeAzulModified ? 1 : 0);
		if (nota != null) {
			_hashCode = 29 * _hashCode + nota.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (notaModified ? 1 : 0);
		if (fechaHoraCaptura != null) {
			_hashCode = 29 * _hashCode + fechaHoraCaptura.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaHoraCapturaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCxpComprobanteFiscal;
		_hashCode = 29 * _hashCode + (idCxpComprobanteFiscalNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idCxpComprobanteFiscalModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCrCredCliente;
		_hashCode = 29 * _hashCode + (idCrCredClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idCrCredClienteModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CxcNotaPk
	 */
	public CxcNotaPk createPk()
	{
		return new CxcNotaPk(idCxcNota);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.CxcNota: " );
		ret.append( "idCxcNota=" + idCxcNota );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idUsuario=" + idUsuario );
		ret.append( ", idComprobanteFiscal=" + idComprobanteFiscal );
		ret.append( ", idPedido=" + idPedido );
		ret.append( ", idCxpValeAzul=" + idCxpValeAzul );
		ret.append( ", nota=" + nota );
		ret.append( ", fechaHoraCaptura=" + fechaHoraCaptura );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", idCxpComprobanteFiscal=" + idCxpComprobanteFiscal );
		ret.append( ", idCrCredCliente=" + idCrCredCliente );
		return ret.toString();
	}

}