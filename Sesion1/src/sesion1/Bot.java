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
public class Bot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Hola, Cómo te llamas?");
        String nombre = leer.next();
        
        System.out.println("Es un guto conocerte " + nombre);
        
        System.out.println("Cuántos años tienes?");
        int edad = leer.nextInt();
        
        System.out.println("Yo  tengo " + (edad - 10));
        
        System.out.println("Ven, vamos a jugar!");
        
    }
    
}
