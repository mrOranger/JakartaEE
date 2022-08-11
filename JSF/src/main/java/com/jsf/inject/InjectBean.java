package com.jsf.inject;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Inject;
import javax.inject.Named;

@Named @SessionScoped @FacesConfig(version = FacesConfig.Version.JSF_2_3)
public class InjectBean implements Serializable{
    
    private static final long serialVersionUID = 18L;
    
    private String name;
    private String surname;
    
    @PostConstruct public void constructor() {
        System.out.println("Constructor!");
        this.name = "Mario";
        this.surname = "Rossi";
    }
    
    @PreDestroy public void destroy() {
        System.out.println("Destroyer!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
