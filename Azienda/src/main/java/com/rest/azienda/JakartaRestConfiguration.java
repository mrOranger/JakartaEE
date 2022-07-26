package com.rest.azienda;

import com.rest.azienda.models.GestioneDipendenti;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configures Jakarta RESTful Web Services for the application.
 * @author Juneau
 */
@ApplicationPath("azienda")
public class JakartaRestConfiguration extends Application {
    
    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resources = new HashSet<>();
        this.addRestResourceClasse(resources);
        this.initModels();
        return resources;
    }
    
    public void addRestResourceClasse(Set<Class<?>> resources){
        resources.add(com.rest.azienda.resources.DirigenteResource.class);
        resources.add(com.rest.azienda.resources.ImpiegatiResource.class);
    }
    
    public void initModels() {
        GestioneDipendenti.init();
    }
    
}
