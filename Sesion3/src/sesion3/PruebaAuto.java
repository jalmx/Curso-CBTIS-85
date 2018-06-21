package sesion3;

import java.util.Scanner;

public class PruebaAuto {

    public static void main(String[] args) {

        Auto vochito = new Auto();//generar instancia de tipo Auto

        vochito.noPuertas = 2;
        vochito.kilometraje = 15000;

        vochito.arrancar();
        vochito.acelerar();
        vochito.acelerar();

        System.out.println("Mi auto tiene " + vochito.noPuertas + " puertas");
        System.out.println("Mi auto tiene " + vochito.kilometraje +
                            " de kilometraje");

        vochito.noPuertas = 4;
        System.out.println("Numero de puestas " + vochito.noPuertas);


    }

}
