package com.jsf.listeners;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("classicListener") @SessionScoped
public class ClassicListener implements Serializable{
    
    private static final long serialVersionUID = 11L;
    
    public String listen() {
        System.out.println("Classico Listener!");
        return null;
    }
}
