package com.rest.companymanagement.models;

import java.util.Collection;
import java.util.TreeSet;


public class Manager extends Employee{
    
    private Collection<Employee> responsibility;
    
    public Manager(String name, String surname, String id, double salary){
        super(name, surname, id, salary);
        this.responsibility = new TreeSet<>();
    }

    public Collection<Employee> getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(Collection<Employee> responsibility) {
        this.responsibility = responsibility;
    }
    
    public void addEmployee(Employee employee){
        this.responsibility.add(employee);
    }
    
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("\n Responsible of: \n");
        for(Employee e : this.responsibility){
            stringBuilder.append("\t");
            stringBuilder.append(e.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    
}
