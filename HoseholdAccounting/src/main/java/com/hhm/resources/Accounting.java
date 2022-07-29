package com.hhm.resources;

import java.io.Serializable;
import java.time.LocalDate;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/*
    Named lets JSF to bind the class inside the .xhtml files,
    and SessionScoped will keep the instance of the class valid as long as
    the Browser sessions holds.
*/
@Named @SessionScoped
public class Accounting implements Serializable{
    
    // The serial version allows the isntance to be serialized
    private static final long serialVersionUID = -1829391828371382L;
    
    private LocalDate localDate;
    private String name;

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public String getName() {
        return name;
    }
    
    public String register(){
        return null;
    }
}
