package com.jsf.selectables;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named("selectable") @ViewScoped
public class Selectables implements Serializable{
    
    private static final long serialVersionUID = 10L;
    private boolean simpleCheckbox;
    
    public Selectables(){
        this.simpleCheckbox = Math.random()*10 < 0.5;
    }

    public boolean isSimpleCheckbox() {
        return simpleCheckbox;
    }

    public void setSimpleCheckbox(boolean simpleCheckbox) {
        this.simpleCheckbox = simpleCheckbox;
    }
    
    public String getRandomEmployee(){
        return new Employee().getEmployee();
    }
    
    private class Employee {
        
        private final String name;
        private final String surname;
        private final String id;
        
        private final List<String> names = Arrays.asList("Maria", "Mario", "Francesca", "Francesco");
        private final List<String> surnames = Arrays.asList("Rossi", "Verdi", "Bruni", "Gialli");
        private final List<String> ids = Arrays.asList("KA009", "FZ019", "AK918", "AB001");
        
        public Employee(){
            this.name = names.get((int)(Math.random()*names.size()));
            this.surname = surnames.get((int)(Math.random()*names.size()));
            this.id = ids.get((int)(Math.random()*names.size()));
        }
        
        public Employee(String name, String surname, String id) {
            this.name = name;
            this.surname = surname;
            this.id = id;
        }
        
        public String getEmployee() {
            final String randomName = names.get((int)(Math.random()*names.size()));
            final String randomSurname = surnames.get((int)(Math.random()*names.size()));
            final String randomId = ids.get((int)(Math.random()*names.size()));
            return randomName + " " + randomSurname + " " + randomId;
        }
        
        @Override
        public String toString(){
            return this.name + " " + this.surname + " " + this.id;
        }
    }
}
