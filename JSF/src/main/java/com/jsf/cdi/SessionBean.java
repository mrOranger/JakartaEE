package com.jsf.cdi;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/*
    L'oggetto con annotazione SessionScoped sarà mentenuto in vita finché è
    attiva la sessione corrente del bowser.
*/
@Named("sessionUsers") @SessionScoped
public class SessionBean implements Serializable{
    
    private static final long serialVersionUID = 5L;
    private final EmployeeManagment EMPLOYEE_MANAGMENT = new EmployeeManagment();
    private final Employee EMPLOYEE = EMPLOYEE_MANAGMENT.getRandomEmployee();
    
    public String getEmployee(){
        return EMPLOYEE.toString();
    }
}
