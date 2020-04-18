/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;
import datos.PersistenciaPersonas;
import modelo.Persona;
/**
 *
 * @author Chelo
 */
public class PresentadorABMPersonas {
    /*Polimorfismo*/
    private IABMPersonas vista;
    private PersistenciaPersonas persistencia ;
    
    public PresentadorABMPersonas(IABMPersonas vista){
        this.vista = vista;
        this.persistencia = new PersistenciaPersonas();
    }
    
    public void obtenerDatosPersona(){
        vista.mostrarDatosPersonas(persistencia.getPersonas());
    }
    public void agregarPersona(int dni, String apellido, String nombre){
        try{
            Persona nuevo = new Persona(dni,apellido,nombre);
            this.persistencia.agregarPersona(nuevo);
            vista.notificarPersonaAgregada();
        }catch(Exception e){
            vista.notificarError(e);
        }finally{
            vista.mostrarDatosPersonas(persistencia.getPersonas());
        }
        
    }
    
    
}
