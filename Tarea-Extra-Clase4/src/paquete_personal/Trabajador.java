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
public class Trabajador extends Persona{
    private double costo_seguro;
    private int horas_trabajadas;
    private double costo_por_hora;
    
    public void establecer_costo_seguro(double c_s){
        costo_seguro = c_s;
    }
    public double obtener_costo_seguro(){
        return costo_seguro;
    }
    
    public void establecer_horas_trabajadas(int h_t){
        horas_trabajadas = h_t;
    }
    public int obtener_horas_trabajadas(){
        return horas_trabajadas;
    }
    
    public void establecer_costo_por_hora(double c_h){
        costo_por_hora = c_h;
    }
    public double obtener_costo_por_hora(){
        return costo_por_hora;
    }

    public double obtener_sueldo(){
        double sueldo;
        sueldo = ((horas_trabajadas*costo_por_hora)+costo_seguro);
        return sueldo;
    }
    
    public Trabajador(String n, String apell, int eda, int ced, double c_s, int h_t, double c_h, double s) {
        super(n, apell, eda, ced);
        costo_seguro = c_s;
        horas_trabajadas = h_t;
        costo_por_hora = c_h;
    }

    public Trabajador() {
    }    
    
    
    @Override
    public String toString() {
        String cadena = String.format("\n%s\n"
                + "Seguro: $%s\n"
                + "Horas trabajadas: %s\n"
                + "Valor por Hora: %s\n"
                + "Sueldo: $%s\n", super.toString(), obtener_costo_seguro(),obtener_horas_trabajadas(),
                obtener_costo_por_hora(),obtener_sueldo());
        return cadena;
    }
    
    
}
