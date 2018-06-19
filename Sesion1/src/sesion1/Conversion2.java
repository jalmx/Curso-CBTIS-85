package sesion1;

import java.util.Scanner;

public class Conversion2 {

    public static void main(String[] args) {
        //Scanner me ayuda a leer de teclado
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Dar valor en centimetros para conversion a pulgadas");
        double medida = leer.nextDouble();//centimetros

        double centimetros = 2.54;
        double pulgada = 1;

        double resultado = (medida * pulgada) / centimetros;

        System.out.printf("El resultado de %.2f cm a pulgadas es %.3f\n",
                medida, resultado);
    }
    
}
