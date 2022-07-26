package com.rest.helloworldrest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author 
 */
@Path("hello")
public class JakartaEE8Resource {
    
    @GET @Produces(MediaType.TEXT_PLAIN)
    public String printHello(){
        return "Hello World from Jakarta EE and REST services";
    }
}
