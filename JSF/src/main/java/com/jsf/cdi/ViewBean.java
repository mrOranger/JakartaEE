package com.jsf.cdi;

import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/*
    L'oggetto con annotazione RequestScoped sarà mentenuto in vita finché è
    la pagina in cui esso è contenuto è in vita. Quindi come in RequestScoped,
    non vi è uno stato in cui questo è mantenuto.
*/
@Named("viewUsers") @ViewScoped
public class ViewBean implements Serializable{
    
    private static final long serialVersionUID = 5L;
    private final EmployeeManagment EMPLOYEE_MANAGMENT = new EmployeeManagment();
    private final Employee EMPLOYEE = EMPLOYEE_MANAGMENT.getRandomEmployee();
    
    public String getEmployee(){
        return EMPLOYEE.toString();
    }
}
