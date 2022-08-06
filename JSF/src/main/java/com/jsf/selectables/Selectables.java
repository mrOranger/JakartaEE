package com.jsf.selectables;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("selectable") @SessionScoped
public class Selectables implements Serializable{
    
    private static final long serialVersionUID = 10L;
    private boolean simpleCheckbox;
    private List<String> manyCheckboxes;
    private Map<String, String> employeesMap;
    
    public Selectables(){
        this.simpleCheckbox = Math.random()*10 < 0.5;
        this.manyCheckboxes = Arrays.asList("Value1", "Value2", "Value3");
        this.employeesMap = new HashMap<>();
    }

    public Map<String, String> getEmployeesMap() {
        for(String value : this.manyCheckboxes) {
            this.employeesMap.put(value, new Employee().getEmployee());
        }
        return this.employeesMap;
    }

    public void setEmployeesMap(Map<String, String> employeesMap) {
        this.employeesMap = employeesMap;
    }

    public List<String> getManyCheckboxes() {
        return manyCheckboxes;
    }

    public void setManyCheckboxes(List<String> manyCheckboxes) {
        this.manyCheckboxes = manyCheckboxes;
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
