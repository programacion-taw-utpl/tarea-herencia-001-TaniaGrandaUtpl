/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import paquete_personal.Trabajador;
import paquete_laempresa.Empresa_Privada;
/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trabajador t = new Trabajador();
        
        Trabajador lista_trabajadores[] = new Trabajador[2];
        lista_trabajadores[0] = new Trabajador("Ana Luisa", "Velez Alcivar", 30, 12903939, 100, 40, 10, t.obtener_sueldo());
        lista_trabajadores[1] = new Trabajador("Mario Anibal", "Vela Narvaez", 35, 212889, 100, 50, 10, t.obtener_sueldo());
        
        
        Empresa_Privada e_p = new Empresa_Privada("Soluciones Software", "SS´s", "Loja", lista_trabajadores, 20000, 12);
        System.out.println(e_p);
    }
    
}
