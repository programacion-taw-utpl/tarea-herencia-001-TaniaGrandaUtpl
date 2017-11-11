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
public class Trabajador extends Persona{//Heredamos los atributos y métodos de la clase Persona
    //Atributos de la clase Trabajador
    private double costo_seguro;
    private int horas_trabajadas;
    private double costo_por_hora;
    
    //Médotos establecer y obtener del atributo costo_seguro
    public void establecer_costo_seguro(double c_s){
        costo_seguro = c_s;
    }
    public double obtener_costo_seguro(){
        return costo_seguro;
    }
    
    //Médotos establecer y obtener del atributo horas_trabajadas
    public void establecer_horas_trabajadas(int h_t){
        horas_trabajadas = h_t;
    }
    public int obtener_horas_trabajadas(){
        return horas_trabajadas;
    }
    
    //Médotos establecer y obtener del atributo costo_por_hora
    public void establecer_costo_por_hora(double c_h){
        costo_por_hora = c_h;
    }
    public double obtener_costo_por_hora(){
        return costo_por_hora;
    }

    //Método para obtener el sueldo de cada trabajador 
    public double obtener_sueldo(){
        double sueldo;
        sueldo = ((horas_trabajadas*costo_por_hora)+costo_seguro);
        return sueldo;
    }
    
    //Constructor con parámetros
    public Trabajador(int num, String n, String apell, int eda, int ced, double c_s, int h_t, double c_h, double s) {
        super(num, n, apell, eda, ced);
        costo_seguro = c_s;
        horas_trabajadas = h_t;
        costo_por_hora = c_h;
    }
    
    //Constructor vacio, no envia parametros
    public Trabajador() {
        
    }    
    
    //Sobreescribimos el método toString
    @Override
    public String toString() {
        String cadena = String.format("\n%s\n"
                + "\t\tSeguro: $%s\n"
                + "\t\tHoras trabajadas: %s\n"
                + "\t\tValor por Hora: %s\n"
                + "\t\tSueldo: $%s\n", super.toString(), obtener_costo_seguro(),obtener_horas_trabajadas(),
                obtener_costo_por_hora(),obtener_sueldo());
        return cadena;
    }
    
    
}
