package com.jsf.ajax;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named @SessionScoped
public class AjaxBean implements Serializable{
    
    private static final long serialVersionUID = 13L;
    
    private String name;
    private String surname;
    private Date dateOfBirth;
    
    public AjaxBean() {
        this.name = "";
        this.surname = "";
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String submit() {
        System.err.println("Submit: " + this.getName() + " " + this.getSurname());
        return null;
    }
    
    public String getCombinedName() {
        return this.name + " " + this.surname;
    }
}
