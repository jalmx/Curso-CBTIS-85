package sesion3;

import java.util.Scanner;

public class ResistenciaInfinita {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de resistencias en serie");
        System.out.println("Para salir escriba -1 ");

        int resistenciaTotal=0;
        int numero = 1;

        for ( ; ; ){
            System.out.print("Dar el valor de la resistenca " + numero);
            System.out.println("  ;Escriba -1 para salir");
            int resistencia = scanner.nextInt(); //leyendo el valor dado por el usuario

            if (resistencia == -1){//si el usario escribio -1, sale del for
                break;
            }
            resistenciaTotal += resistencia; //calculo
            numero++; //incremento
        }

        System.out.println("La resistencia total es: " +
                    resistenciaTotal + " Ohms");
    }
}












