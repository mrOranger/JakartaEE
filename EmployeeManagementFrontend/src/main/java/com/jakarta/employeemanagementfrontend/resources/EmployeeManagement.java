package com.jakarta.employeemanagementfrontend.resources;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

@Named @SessionScoped
public class EmployeeManagement implements Serializable{
    
    private static final long serialVersionUID = -1110733631543658209L;
    
    private String employee;
    
    public String queryServer(){
        
        try {
            Client client = ClientBuilder.newClient();
            String query = "http://localhost:8080/EmployeeManagement/resources/employees/employee";
            WebTarget webTarget = client.target(query);
            this.employee = webTarget.request().get(String.class);
        } catch(Exception e){
            return null;
        }
        return "/response.xhtml";
    }
    
    public String getEmployee() {
        return this.employee;
    }
}
