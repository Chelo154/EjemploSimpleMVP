/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;
import datos.PersistenciaPersonaNuevo;
import datos. IManejoPersonas;
import java.util.ArrayList;
import modelo.Persona;
/**
 *
 * @author Chelo
 */
public class PresentadorABMPersonas {
    /*Polimorfismo*/
    private IABMPersonas vista;
    private IManejoPersonas persistencia ;
    
    
    public PresentadorABMPersonas(IABMPersonas vista){
        this.vista = vista;
        this.persistencia = PersistenciaPersonaNuevo.obtenerPersistencia();        
    }
    
    public void obtenerDatosPersona(){
        vista.mostrarDatosPersonas(persistencia.obtenerPersonas());
    }
    public void agregarPersona(int dni, String apellido, String nombre){
        try{
            Persona nuevo = new Persona(dni,apellido,nombre);
            this.persistencia.agregarPersona(nuevo);
            vista.notificarPersonaAgregada();
        }catch(Exception e){
            vista.notificarError(e);
        }finally{
            vista.mostrarDatosPersonas(persistencia.obtenerPersonas());
        }
        
    }
    public void eliminarPersona(int dni){
       try{
           this.persistencia.eliminarPersona(dni);
           vista.notificarPersonaEliminada();
       }catch(Exception e){
           vista.notificarError(e);
       }finally{
           vista.mostrarDatosPersonas(persistencia.obtenerPersonas());
       }
    }
    public void modificarPersona(int dni, String nombre, String apellido){
        try{
           this.persistencia.modificarPersona(dni, apellido, nombre);
           vista.notificarPersonaActualizada(persistencia.buscarPersona(dni).obtenerDatosResumidos());
       }catch(Exception e){
           vista.notificarError(e);
       }finally{
           vista.mostrarDatosPersonas(persistencia.obtenerPersonas());
       }
    }
    public void buscarPersona(int dni){
         try{
           ArrayList<Persona> aux = new ArrayList<>();
           aux.add(persistencia.buscarPersona(dni));
           vista.mostrarDatosPersonas(aux);
       }catch(Exception e){
           vista.notificarError(e);
       }
    }
    
    
}
