/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bafar.buro.ws;

import com.sun.xml.internal.ws.wsdl.parser.InaccessibleWSDLException;

/**
 *
 * @author Gloria Palma
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Pasa por aquí");
        NombreBC nombre = new NombreBC();
        nombre.setApellidoPaterno("QUALITYSIX");
        nombre.setApellidoMaterno("BELLO");
        nombre.setPrimerNombre("TESTSIX");
        nombre.setSegundoNombre("ALONSO");
        nombre.setRFC("MEBC681205");

        //3ro Direcciones	

        Direccion  direc = new Direccion();
        direc.setDireccion1("16 DE SEPTIEMBRE 504 1");
        direc.setColoniaPoblacion("VENTA PRIETA");
        direc.setDelegacionMunicipio("PACHUCA DE SOTO");
        direc.setCiudad("HIDALGO");
        direc.setEstado("HO");
        direc.setCP("42080");
        
        ConsultaBuro consultaBuro = new ConsultaBuro();
        RespuestaBC response = null;
        try{
            response = consultaBuro.consultaXML(nombre, direc);
        }catch(InaccessibleWSDLException ex){
            System.out.print("Errro : "+ ex.getMessage());
        }
        
        System.out.println("Dev buro de credito");
        
        // Hola Nell :) te dejo ayuda de como acceder a los objetos que hay que meter 
        // a la base de datos.
        
        // response.personas.persona.get(0).cuentas así obtendrías la lista de las cuentas
        // pero en realidad, si puedes pasar a xml y luego string para meterlo en la base de datos
        // es suficiente
        
        // response.personas.persona.get(0).domicilios.domicilio.get(0)
        // Así obtienes el primer domicilio y ya de ahí vas sacando los valores.
        
        // response.personas.persona.get(0).scoreBuroCredito.scoreBC.get(0)
        // Así obtienes el primer score
        for (int x=0;x<response.personas.persona.get(0).cuentas.cuenta.size();x++){
            CuentasRespBC obj=response.personas.persona.get(0).cuentas.cuenta.get(x);
            System.out.println(obj.toString());
        }

        System.out.println(response.personas.persona.get(0).cuentas.cuenta.get(0));
        System.out.println(response.personas.persona.get(0).scoreBuroCredito.scoreBC.get(0));
    }
    
}
