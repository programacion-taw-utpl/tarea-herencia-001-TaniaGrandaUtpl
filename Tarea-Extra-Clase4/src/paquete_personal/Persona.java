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
    //Atributos de la clase Trabajador
    private String nombres;
    private String apellidos;
    private int edad;
    private int cedula;
    
    //Médotos establecer y obtener del atributo nombres
    public void establecer_nombres(String n){
        nombres = n;
    }
    public String obtener_nombres(){
        return nombres;
    }
    
    //Médotos establecer y obtener del atributo apellidos
    public void establecer_apellidos(String apell){
        apellidos = apell;
    }
    public String obtener_apellidos(){
        return apellidos;
    }
    
    //Médotos establecer y obtener del atributo edad
    public void establecer_edad(int eda){
        edad = eda;
    }
    public int obtener_edad(){
        return edad;
    }
    
    //Médotos establecer y obtener del atributo cedula
    public void establecer_cedula(int ced){
        cedula = ced;
    }
    public int obtener_cedula(){
        return cedula;
    }
    
    //Constructor con parámetros
    public Persona(String n, String apell, int eda, int ced) {
        nombres = n;
        apellidos = apell;
        edad = eda;
        cedula = ced;
    }

    //Constructot vacío, sin parametros.
    public Persona() {
        
    }
    
    //Sobreescribimos el método toString
    @Override
    public String toString() {
        return String.format("\t%s %s\n"
                + "\t\t%d años de edad\n"
                + "\t\tCI: %s", 
                obtener_nombres(), obtener_apellidos(), obtener_edad(), obtener_cedula());
    }  
}
