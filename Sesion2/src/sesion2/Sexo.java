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
public class Sexo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Qué sexo eres?");
        System.out.println("1) Hombre");
        System.out.println("2) Mujer");
        int sexo = leer.nextInt();

        if (sexo == 1) {
            System.out.println("Macho alfa lomo plateado");
        } else if (sexo == 2) {
            System.out.println("Eres un linda señorita");
        } else {
            System.out.println("Identidad desconocida");
        }
        
    }//termina main
}//termina clases
