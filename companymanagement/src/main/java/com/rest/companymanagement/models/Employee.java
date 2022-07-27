package com.rest.companymanagement.models;

public class Employee extends Person implements Comparable<Employee>{
    
    private String id;
    private double salary;
    
    public Employee(String name, String surname, String id, double salary){
        super(name, surname);
        this.id = id;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return this.id + " - " + super.toString() + " - " + this.salary;
    }

    @Override
    public int compareTo(Employee o) {
        return o.getId().compareTo(this.getId());
    }
    
}
