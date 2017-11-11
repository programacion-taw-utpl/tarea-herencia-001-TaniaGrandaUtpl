/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_laempresa;
import paquete_personal.Trabajador;
/**
 *
 * @author Usuario
 */
public class Empresa {
    //Atributos de la clase Empresa
    private String nombres;
    private String siglas;
    private String ciudad;
    private Trabajador[] trabajadores;
    
    //Médotos establecer y obtener del atributo nombres
    public void establecer_nombres(String n){
        nombres = n;
    }
    public String obtener_nombres(){
        return nombres;
    }
    
    //Médotos establecer y obtener del atributo apellidos
    public void establecer_siglas(String sg){
        siglas = sg;
    }
    public String obtener_siglas(){
        return siglas;
    }
    
    //Médotos establecer y obtener del atributo ciudad
    public void establecer_ciudad(String c){
        ciudad = c;
    }
    public String obtener_ciudad(){
        return ciudad;
    }

    //Médotos establecer y obtener del atributo trabajadores
    public void establecer_trabajadores(Trabajador[] t) {
        trabajadores = t;
    }
    public Trabajador[] ontener_trabajadores() {
        return trabajadores;
    }

    //Constructor con parámetros
    public Empresa(String n, String sg, String c, Trabajador[] t) {
        nombres = n;
        siglas = sg;
        ciudad = c;
        trabajadores = t;
    }
    
    //Método para obtener todo el listado de trabajadores
    public String lista_trabajadores(){  
        String lista = " ";
        for (int i = 0; i < trabajadores.length; i++) {
            lista += trabajadores[i];
        }
        return lista;
    }
    
    //Sobreescribimos el método toString
    @Override
    public String toString() {
        return String.format("Empresa: %s\n"
                + "Siglas: %s\n"
                + "Ciudad: %s\n"
                ,obtener_nombres(),obtener_siglas(),obtener_ciudad());
    }
}
