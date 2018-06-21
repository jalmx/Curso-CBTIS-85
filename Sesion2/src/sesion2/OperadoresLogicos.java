/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

/**
 *
 * @author josef
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if ((5 == 5) && (4 == 4)) {
            System.out.println("5 es igual a 5 AND 4 es igual a 4");
        }

        if ((9 > 4) || (4 > 6)) {
            System.out.println("9 es mayor a 4 OR 4 es menor a 6");
        }

        if (!false) {
            System.out.println("el falso se convierte verdadero");
        }

    }

}
