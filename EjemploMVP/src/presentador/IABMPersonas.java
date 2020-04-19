/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author Chelo
 */
public interface IABMPersonas {    
    public void notificarPersonaAgregada();
    public void notificarError(Exception e);
    public void mostrarDatosPersonas(ArrayList<Persona> personas);
    public void notificarPersonaEliminada();
    public void notificarPersonaActualizada(String datosPersona);
}
