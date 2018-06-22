/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion4;

import java.util.Scanner;

/**
 *
 * @author josef
 */
public class ProbarResistencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Resistencia cien = new Resistencia(100);
        Resistencia diez = new Resistencia(10, 4);
        
        System.out.println("Mi resitencia tiene un valor de " +
                cien.getValorOhmico() + " Ohms");
        
        System.out.println("Mi resistencia tiene un valor de " +
                diez.getValorOhmico() + " Ohms y una potencia de " + 
                diez.getPotencia() + " Watts");
    }
    
}
