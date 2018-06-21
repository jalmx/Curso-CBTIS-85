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
public class LeyOhm {

    public static void main(String[] args) {
        Scanner barritasDePina = new Scanner(System.in);
        double voltaje, corriente, resistencia;

        System.out.println("Calculadora de Ley de Ohm");
        System.out.println("1) Voltaje");
        System.out.println("2) Corriente");
        System.out.println("3) Resistencia");
        System.out.print("Qué desea calcular? (digite número): ");
        int opcion = barritasDePina.nextInt();

        if (opcion == 1) {//calcular voltaje
            System.out.println("Dar valor de corriente (A)");
            corriente = barritasDePina.nextDouble();
            System.out.println("Dar valor de resistencia (Ohms)");
            resistencia = barritasDePina.nextDouble();
            voltaje = corriente * resistencia;
            System.out.printf("El valor del voltaje es %.2fV\n", voltaje);
        }

        if (opcion == 2) {//calcular corriente
            System.out.println("Dar valor de voltaje (Volts)");
            voltaje = barritasDePina.nextDouble();
            System.out.println("Dar valor de resistencia (Ohms)");
            resistencia = barritasDePina.nextDouble();
            corriente = voltaje / resistencia;
            System.out.printf("El valor del corriente es %.2fA\n", corriente);
        }

        if (opcion == 3) {//calcular resistencia
            System.out.println("Dar valor de voltaje (Volts)");
            voltaje = barritasDePina.nextDouble();
            System.out.println("Dar valor de corriente (Amper)");
            corriente = barritasDePina.nextDouble();
            resistencia = voltaje / corriente;
            System.out.printf("El valor del resistencia es %.2f Ohms\n", resistencia);
        }
    }

}
