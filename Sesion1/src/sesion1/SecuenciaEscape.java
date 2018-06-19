/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion1;

/**
 *
 * @author josef
 */
public class SecuenciaEscape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("poner texto\nmás texto\n");//\n salto de linea
        System.out.print("\"dentro de doble comilla\"\n");// \" para imprimir la doble comilla
        System.out.print("\\diagonal invertida\\ \n");// doble diagonal invertida, imprimi la diagonal invertida
    }
    
}
