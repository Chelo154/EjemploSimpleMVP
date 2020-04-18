/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Chelo
 */
public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    
    public Persona(int dni, String apellido, String nombre){
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    public int getDni(){
        return this.dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
