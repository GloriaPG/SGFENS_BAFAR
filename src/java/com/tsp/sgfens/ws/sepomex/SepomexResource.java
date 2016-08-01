/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsp.sgfens.ws.sepomex;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import com.google.gson.Gson;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Nelly
 */
@Path("sepomex")
public class SepomexResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SepomexResource
     */
    public SepomexResource() {
    }

    /**
     * Retrieves representation of an instance of com.tsp.sgfens.sepomex.SepomexResource
     * @param zipCode
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/query")
    @Produces("application/json")
    public String getJson(@QueryParam("zipCode") String zipCode) {
        //TODO return proper representation object
        ConsultaDatosSepomex consultaDatos = new ConsultaDatosSepomex();
        
        //Efectuamos búsqueda
        String response = consultaDatos.informationByCP(zipCode);

        //return jsonResponse;
        return response;
    }

    /**
     * PUT method for updating or creating an instance of SepomexResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
