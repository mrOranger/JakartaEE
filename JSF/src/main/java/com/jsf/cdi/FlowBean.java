package com.jsf.cdi;

import java.io.Serializable;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

/*
    L'oggetto con annotazione SessionScoped sarà mentenuto in vita finché è
    attiva l'applicazione corrente. Bisogna fare molta attenzione per evitare il memory leaks.
*/
@Named("flowUsers") @FlowScoped("flow")
public class FlowBean implements Serializable{
    
    private static final long serialVersionUID = 3L;
    private final EmployeeManagment EMPLOYEE_MANAGMENT = new EmployeeManagment();
    private final Employee EMPLOYEE = EMPLOYEE_MANAGMENT.getRandomEmployee();
    
    public String getEmployee(){
        return EMPLOYEE.toString();
    }
}