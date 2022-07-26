package com.rest.azienda.resources;

import com.rest.azienda.models.GestioneDipendenti;
import com.rest.azienda.models.Dirigente;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author 
 */
@Path("dirigenti")
public class DirigenteResource {
    
    @GET @Path("dirigente/{indexDirigente: .*}") @Produces(MediaType.TEXT_PLAIN)
    public String getDirigente(@PathParam("indexDirigente") String indexDirigente){
        try {
            Dirigente dirigente = (Dirigente)GestioneDipendenti.getDirigente(Integer.parseInt(indexDirigente));   
            return dirigente.toString();
        } catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        
        return "Attenzione! Nessun dirigente nella collezione.";
    }
    
}
