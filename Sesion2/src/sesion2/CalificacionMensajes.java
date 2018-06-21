/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

import java.util.Scanner;

/**
 *
 * @author josef
 */
public class CalificacionMensajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ponny = new Scanner(System.in);
        
        System.out.println("Dar calificacion del animalito de la creacion");
        double calificacion = ponny.nextDouble();
        
        if(calificacion < 6){
            System.out.println("Nos vemos en recursa");
        }
        
        if(calificacion >= 6 && calificacion < 7){
            System.out.println("De panzazo");
        }
        
        if(calificacion >= 7 && calificacion < 8){
            System.out.println("Echale más punch");
        }
        if(calificacion >= 8 && calificacion < 9){
            System.out.println("Bien puedes mejorar");
        }
        
        if(calificacion >= 9 && calificacion < 10){
            System.out.println("Muy bien, te falto tantito");
        }
        
        if(calificacion >= 10){
            System.out.println("Excelente, con toda la actitud");
        }
        
    }
    
}
