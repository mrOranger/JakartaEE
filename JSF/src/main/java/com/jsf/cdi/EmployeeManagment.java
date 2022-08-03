package com.jsf.cdi;

import java.util.Arrays;
import java.util.List;

public class EmployeeManagment {
    
    private final List<String> names;
    private final List<String> surnames;
    private final List<String> ids;
    
    public EmployeeManagment() {
        this.names = Arrays.asList("Mario", "Maria", "Francesco", "Francesca");
        this.surnames = Arrays.asList("Rossi", "Neri", "Verdi", "Bruni");
        this.ids = Arrays.asList("AB123", "AC231", "DA910", "KJ718");
    }
    
    public Employee getRandomEmployee(){
        int randomIndex = (int)(Math.random()*this.names.size());
        return new Employee(this.names.get(randomIndex), this.surnames.get(randomIndex), this.ids.get(randomIndex));
    }
    
}
