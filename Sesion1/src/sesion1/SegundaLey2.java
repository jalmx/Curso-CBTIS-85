/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion1;

import java.util.Scanner;

/**
 *
 * @author josef
 */
public class SegundaLey2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);//creo mi objeto Scanner
        
        System.out.println("Dar el valor de la masa en kg");//mando el mensaje
        double masa = leer.nextDouble();//leo el valor que den

        System.out.println("Dar el valor de aceleración en m/s^2");//mando el mensaje
        double acelaracion = leer.nextDouble();//leo el valor de aceleracion
        
        double fuerza = masa * acelaracion;
        
        System.out.println("La fuerza es " + fuerza + " N");
        
    }
    
}
