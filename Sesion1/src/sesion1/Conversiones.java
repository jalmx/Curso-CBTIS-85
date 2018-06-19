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
public class Conversiones {

    public static void main(String[] args) {
        double medida = 8.55;//centimetros

        double centimetros = 2.54;
        double pulgada = 1;

        double resultado = (medida * pulgada) / centimetros;

        System.out.println("El resultado de " + medida + "cm a pulgadas es "
                + resultado);

        System.out.printf("El resultado de %.2f cm a pulgadas es %.3f\n",
                medida, resultado);
    }

}
