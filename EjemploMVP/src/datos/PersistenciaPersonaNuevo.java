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
public class PersistenciaPersonaNuevo implements IManejoPersonas {

    private  ArrayList<Persona> personas;

    private static PersistenciaPersonaNuevo persistencia = new PersistenciaPersonaNuevo();
    
    
    public PersistenciaPersonaNuevo (){
        personas = new ArrayList<>();
    }
    public static PersistenciaPersonaNuevo obtenerPersistencia(){
        return persistencia;
    }

    @Override
    public void agregarPersona(Persona nuevo) {
        this.personas.add(nuevo);
    }

    @Override
    public ArrayList<Persona> obtenerPersonas() {
        return this.personas;
    }

    @Override
    public Persona buscarPersona(int dni) {
        for(Persona p : this.personas){
            if(p.getDni() == dni) return p;
        }
        return null;
    }

    @Override
    public void modificarPersona(int dni, String apellido, String nombre) {
        for(Persona p: this.personas){
            if(p.getDni() == dni){
                p.setApellido(apellido);
                p.setNombre(nombre);
            }
        }
    }

    @Override
    public void eliminarPersona(int dni) {
        Persona aux = null;
        for(Persona p: this.personas){
            if(p.getDni() == dni) aux = p;
        }
        this.personas.remove(aux);
    }
    
    
    
    
}
