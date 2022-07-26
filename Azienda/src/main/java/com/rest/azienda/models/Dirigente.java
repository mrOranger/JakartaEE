package com.rest.azienda.models;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author edoar
 */
public class Dirigente extends Persona{
    
    private String matricola;
    private Collection<Impiegato> responsabilità;
    
    public Dirigente(String matricola, String nome, String cognome){
        super(nome, cognome);
        this.matricola = matricola;
        this.responsabilità = new ArrayList<Impiegato>();
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public Collection<Impiegato> getResponsabilità() {
        return responsabilità;
    }

    public void setResponsabilità(Collection<Impiegato> responsabilità) {
        this.responsabilità = responsabilità;
    }
    
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.matricola);
        stringBuilder.append(" - ");
        stringBuilder.append(super.toString());
        stringBuilder.append("\n");
        stringBuilder.append("Responsabile di: \n");
        for(Impiegato imp : this.responsabilità){
            stringBuilder.append('\t');
            stringBuilder.append(imp.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    
}
