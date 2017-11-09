/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_personal;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombres;
    private String apellidos;
    private int edad;
    private int cedula;
    
    public void establecer_nombres(String n){
        nombres = n;
    }
    public String obtener_nombres(){
        return nombres;
    }
    
    public void establecer_apellidos(String apell){
        apellidos = apell;
    }
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public void establecer_edad(int eda){
        edad = eda;
    }
    public int obtener_edad(){
        return edad;
    }
    
    public void establecer_cedula(int ced){
        cedula = ced;
    }
    public int obtener_cedula(){
        return cedula;
    }

    public Persona(String n, String apell, int eda, int ced) {
        nombres = n;
        apellidos = apell;
        edad = eda;
        cedula = ced;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return String.format("%s %s\n"
                + "%d años de edad\n"
                + "CI: %s", 
                obtener_nombres(), obtener_apellidos(), obtener_edad(), obtener_cedula());
    }
    
    
       
}
