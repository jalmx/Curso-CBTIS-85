package sesion4;

import java.util.Scanner;

public class PruebaResistencia {

    public static void main(String[] args) {
        CalculoResistencia cr = new CalculoResistencia();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dar el número de resistencias");
        int cantidad = sc.nextInt();
        
        double resistencias[] = new double[cantidad];
        
        for(int x = 0; x< cantidad; x++){
            System.out.println("Dar la resistencia " + (x+1) );
            resistencias[x] = sc.nextDouble();
        }
        
        double serie = cr.serie(resistencias);
        double paralelo = cr.paralelo(resistencias);
        
        System.out.println("La resistencia total en serie es: " + 
                serie + " Ohms");
        
        System.out.println("La resistencia total en paralelo es: " + 
                paralelo + " Ohms");
        
        double serieEntero = cr.serie(3.9, 5.6);
        
        System.out.println("El resultado es: " + serieEntero);
        
    }
    
}
