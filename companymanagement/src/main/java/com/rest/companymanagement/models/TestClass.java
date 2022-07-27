package com.rest.companymanagement.models;

public class TestClass {
    
        public static void main(String[] args){
        
        Employee e1 = new Employee("Mario", "Rossi", "AB123", 27000d);
        Employee e2 = new Employee("Maria", "Bruni", "AC456", 23000d);
        Employee e3 = new Employee("Emanuele", "Neri", "AD789", 25000d);
        Employee e4 = new Employee("Emanuela", "Rossi", "AE012", 26000d);
        
        System.err.println(e1);
        System.err.println(e2);
        System.err.println(e3);
        System.err.println(e4);
        
        Manager m = new Manager("Federica", "Verdi", "MA123", 30000d);
        m.addEmployee(e1);
        m.addEmployee(e2);
        m.addEmployee(e3);
        m.addEmployee(e4);
        
        System.err.println(m);
        
    }
}
