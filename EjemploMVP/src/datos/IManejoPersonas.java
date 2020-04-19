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
public interface IManejoPersonas {
    public void agregarPersona(Persona nuevo);
    public ArrayList<Persona> obtenerPersonas();
    public Persona buscarPersona( int dni);
    public void modificarPersona(int dni, String apellido, String nombre);
    public void eliminarPersona(int dni);
}
