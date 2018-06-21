package sesion3;

import java.util.Scanner;

public class CalculoResistencia {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Calculadora de Resistencias en Serie y Paralelo");
        System.out.println("Cuantas resistencias tienes?");
        int total = leer.nextInt();

        int sumaSerie = 0;
        double sumaParalelo = 0;

        for (int r =0; r < total; r++){
            System.out.println("Dar la resistenca " + (r+1));
            double resistencia = leer.nextDouble();
            sumaSerie+= resistencia;
            sumaParalelo+= 1/resistencia;
        }

        System.out.printf("Resistencia total en Series es: %d\n", sumaSerie);

        double resistenciaParalelo = 1/sumaParalelo;
        System.out.printf("Resistencia total en Paralelo %.2f\n", resistenciaParalelo);

    }
}
