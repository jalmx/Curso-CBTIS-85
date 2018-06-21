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
public class TablaUsario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Qué tabla quieres?(Dar valor)");
        int tabla = leer.nextInt();

        System.out.println("La tabla del " + tabla + " es:");
        
        for (int x = 1; x <= 10; x++) {
            int valor = tabla * x;
            System.out.println(tabla + " X " + x + " = " + valor);
        }
    }

}
