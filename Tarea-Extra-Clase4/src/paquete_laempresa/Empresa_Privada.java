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
public class Empresa_Privada extends Empresa{//Heredamos los atributos y métodos de la clase Empresa
    //Atributos de la clase
    private double ventas_mensual_fijo;
    private int numero_sucursales;
    
    //Médotos establecer y obtener del atributo ventas_mensual_fijo
    public void establecer_ventas_mensual_fijo(double v_m_f){
        ventas_mensual_fijo = v_m_f;
    }
    public double obtener_ventas_mensual_fijo(){
        return ventas_mensual_fijo;
    }
   
    //Médotos establecer y obtener del atributo numero_sucursales
    public void establecer_numero_sucursales(int n_s){
        numero_sucursales = n_s;
    }
    public int obtener_numero_sucursales(){
        return numero_sucursales;
    }

    //Constructor con parámetros
    public Empresa_Privada(String n, String sg, String c, Trabajador[] t, double v_m_f, int n_s ) {
        super(n, sg, c, t);
        ventas_mensual_fijo = v_m_f;
        numero_sucursales = n_s;
    }
    
    //Sobrescribimos el método toString 
    @Override
    public String toString() {
        return String.format("%s"
                + "Ventas: $%s\n"
                + "Sucursales: %s\n"
                + "Lista Trabajadores:\n"
                + "\n%s", super.toString(),obtener_ventas_mensual_fijo(), obtener_numero_sucursales(),lista_trabajadores());
    }
}
