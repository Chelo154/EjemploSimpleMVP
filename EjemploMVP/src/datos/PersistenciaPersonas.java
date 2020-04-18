/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author Chelo
 */
public  class PersistenciaPersonas {
     
    private ArrayList<Persona> personas;    
   
    public PersistenciaPersonas(){
        personas = new ArrayList<>();
    }
    public void agregarPersona(Persona nuevo){
        this.personas.add(nuevo);
    }
    public ArrayList<Persona> getPersonas(){
        return this.personas;
    }
    
    
}
