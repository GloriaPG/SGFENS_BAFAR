/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bafar.buro.ws;

/**
 *
 * @author uamicrocreditos
 */
public class DatosBuro {
    private  String prospectoID;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected String primerNombre;
    protected String segundoNombre;
    protected String RFC;
    private String direccion;
    protected String coloniaPoblacion;
    protected String delegacionMunicipio;
    protected String ciudad;
    protected String estado;
    private String cp;
    
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    
    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
        
    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
        
    public String getColoniaPoblacion() {
        return coloniaPoblacion;
    }

    public void setColoniaPoblacion(String coloniaPoblacion) {
        this.coloniaPoblacion = coloniaPoblacion;
    }
        
    public String getDelegacionMunicipio() {
        return delegacionMunicipio;
    }

    public void setDelegacionMunicipio(String delegacionMunicipio) {
        this.delegacionMunicipio = delegacionMunicipio;
    }
        
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
            
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the prospectoID
     */
    public String getProspectoID() {
        return prospectoID;
    }

    /**
     * @param prospectoID the prospectoID to set
     */
    public void setProspectoID(String prospectoID) {
        this.prospectoID = prospectoID;
    }

    /**
     * @return the cp
     */
    public String getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(String cp) {
        this.cp = cp;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
