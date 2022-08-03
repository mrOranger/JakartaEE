package com.jsf.cdi;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/*
    L'oggetto con annotazione RequestScoped sarà mentenuto in vita finché è
    la chiamata HTTP che l'ha generato è in vita. Quindi se si interessa ad un oggetto
    senza stato è questo il caso.
*/
@Named("requestUsers") @RequestScoped
public class RequestBean implements Serializable{
    
    private static final long serialVersionUID = 4L;
    private final EmployeeManagment EMPLOYEE_MANAGMENT = new EmployeeManagment();
    private final Employee EMPLOYEE = EMPLOYEE_MANAGMENT.getRandomEmployee();
    
    public String getEmployee(){
        return EMPLOYEE.toString();
    }
}
