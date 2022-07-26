package com.rest.helloworldrest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configures Jakarta RESTful Web Services for the application.
 * @author Juneau
 */
@ApplicationPath("rest")
public class JakartaRestConfiguration extends Application {
    
    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resources = new HashSet<>();
        this.addRestResourceClasse(resources);
        return resources;
    }
    
    public void addRestResourceClasse(Set<Class<?>> resources){
        resources.add(com.rest.helloworldrest.resources.JakartaEE8Resource.class);
    }
}
