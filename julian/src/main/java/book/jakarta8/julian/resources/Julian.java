/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.jakarta8.julian.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Julian {
    
    @GET @Produces(MediaType.TEXT_PLAIN) @Path("convert/{inDate : .*}")
    public String convert(@PathParam("inDate") String inDate){
        return inDate;
    }
    
}
