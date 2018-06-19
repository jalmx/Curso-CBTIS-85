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
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int suma = 3 + 4;
        int resta = 10 - 5;
        int multiplicacion = 8 * 3;
        double division =  3.0 /2.0;
        int residuo = 3 % 10;
        
        //el signo + concatena el texto
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " + multiplicacion);
        System.out.println("La divison es " + division);
        System.out.println("El residuo es " + residuo);
    }
    
}
