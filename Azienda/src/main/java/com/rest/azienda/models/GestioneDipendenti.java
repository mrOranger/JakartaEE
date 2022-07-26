package com.rest.azienda.models;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author edoar
 */
public class GestioneDipendenti {
    
    private static Collection<Impiegato> impiegati;
    private static Collection<Dirigente> dirigenti;
    
    public static void init(){
        
        impiegati = new ArrayList<>();
        dirigenti = new ArrayList<>();
        
        impiegati.add(new Impiegato("AB123", "Mario", "Rossi"));
        impiegati.add(new Impiegato("AC456", "Enrica", "Verdi"));
        
        Dirigente dirigente = new Dirigente("DS123", "Federica", "Neri");
        dirigente.setResponsabilità(impiegati);
        dirigenti.add(dirigente);
    }

    public static Persona getImpiegato(int index) throws IndexOutOfBoundsException{
        return ((ArrayList<Impiegato>)impiegati).get(index);
    }
    
    public static Persona getDirigente(int index) throws IndexOutOfBoundsException{
        return ((ArrayList<Dirigente>)dirigenti).get(index);
    }
    
}
