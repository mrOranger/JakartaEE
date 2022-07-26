package com.rest.azienda.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.azienda.models.GestioneDipendenti;
import com.rest.azienda.models.Impiegato;

/**
 *
 * @author edoar
 */
@Path("impiegati")
public class ImpiegatiResource {
    
    @GET @Path("impiegato/{indexImpiegato: .*}") @Produces(MediaType.TEXT_PLAIN)
    public String getDirigente(@PathParam("indexImpiegato") String indexImpiegato){
        
        try {
            Impiegato impiegato = (Impiegato)GestioneDipendenti.getImpiegato(Integer.parseInt(indexImpiegato));   
            return impiegato.toString();
        } catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        
        return "Attenzione! Nessun impiegato nella collezione.";
    }
    
}
