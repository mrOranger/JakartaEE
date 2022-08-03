package com.jsf.start;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("credential") @SessionScoped
public class Credential implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String submit(){
        System.out.println(this.name + " " + this.surname + " " + this.age);
        return null; //Returning null, the page will just reloaded
    }   
}
