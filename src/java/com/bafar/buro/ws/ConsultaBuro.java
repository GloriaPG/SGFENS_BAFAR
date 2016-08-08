/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bafar.buro.ws;

/**
 *
 * @author Gloria Palma
 */
public class ConsultaBuro {
     public RespuestaBC consultaXML(NombreBC nombre, Direccion direccion){
        PersonaBC persona = new PersonaBC();
        ConsultaBC consultaBC = new ConsultaBC();
                
        PersonasBC personas = new PersonasBC();
        persona.setEncabezado(getConfig());
        persona.setNombre(nombre);
        DomiciliosBC domicilio = new DomiciliosBC();
        domicilio.getDomicilio().add(direccion);
        persona.setDomicilios(domicilio);
        personas.setPersona(persona);
        consultaBC.setPersonas(personas);
        WSConsultaService service = new WSConsultaService();
        WSConsultaDelegate ws= service.getWSConsultaPort();
        RespuestaBC response = ws.consultaXML(consultaBC);
   
        return response;
    }
    
    private EncabezadoBC getConfig(){
        EncabezadoBC encabezado=new EncabezadoBC();
        encabezado.setVersion("11");
	encabezado.setNumeroReferenciaOperador("                         ");
	encabezado.setProductoRequerido("501");
        encabezado.setClavePais("MX");
        encabezado.setIdentificadorBuro("0000");   
        encabezado.setClaveUsuario("ZM57381001");
        encabezado.setPassword("rr3L6u43");
        encabezado.setTipoConsulta("I");
        encabezado.setTipoContrato("CC");
        encabezado.setClaveUnidadMonetaria("MX");
        encabezado.setIdioma("SP");
        encabezado.setTipoSalida("01"); 
        return encabezado;
    }
}
