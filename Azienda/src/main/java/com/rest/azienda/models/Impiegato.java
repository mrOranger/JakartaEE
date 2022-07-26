package com.rest.azienda.models;

/**
 *
 * @author edoar
 */
public class Impiegato extends Persona{
    
    private String matricola;
    private Livello livello;
    
    public Impiegato(String matricola, String nome, String cognome){
        super(nome, cognome);
        this.matricola = matricola;
        this.livello = Livello.JUNIOR;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public Livello getLivello() {
        return livello;
    }

    public void setLivello(Livello livello) {
        this.livello = livello;
    }
    
    @Override
    public String toString(){
        return this.matricola + " - " + super.toString() + " " + this.livello;
    }
}
