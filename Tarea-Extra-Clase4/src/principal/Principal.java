/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

//Imprtamos los paquetes con su clase especifica para poder llamar a sus metodos
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
        
        //Llamamos a la clase Trabajador sin parametros
        Trabajador t = new Trabajador();
        
        //Llamamos a la clase trabajores con parametros, y los guardamos en una array
        Trabajador lista_trabajadores[] = new Trabajador[2];
        lista_trabajadores[0] = new Trabajador("Ana Luisa", "Velez Alcivar", 30, 12903939, 100, 40, 10, t.obtener_sueldo());
        lista_trabajadores[1] = new Trabajador("Mario Anibal", "Vela Narvaez", 35, 212889, 100, 50, 10, t.obtener_sueldo());
        
        //Llamamos a la clase Empresa_Privada con sus parametros
        Empresa_Privada e_p = new Empresa_Privada("Soluciones Software", "SS´s", "Loja", lista_trabajadores, 20000, 12);
        //Imprimimos el identificador de la clase Empresa_Privada
        System.out.println(e_p);
    }
}
