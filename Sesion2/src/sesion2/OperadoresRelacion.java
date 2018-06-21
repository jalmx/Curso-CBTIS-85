package sesion2;

import java.util.Scanner;

public class OperadoresRelacion {
    
    public static void main(String[] a){
        Scanner patito = new Scanner(System.in);
        
        System.out.println("Dar primer valor entero");
        int primero = patito.nextInt();
        
        System.out.println("Dar segundo valor entero");
        int segundo = patito.nextInt();
        
        if(primero < segundo){
            System.out.printf("%d es menor que %d\n", primero,segundo);
        }
        if(primero > segundo){
            System.out.printf("%d es mayor que %d\n", primero,segundo);
        }
        if(primero <= segundo){
            System.out.printf("%d es menor o igual que %d\n", primero,segundo);
        }
        
        if(primero >= segundo){
            System.out.printf("%d es mayor o igual que %d\n", primero,segundo);
        }
        
        if(primero == segundo){
            System.out.printf("%d es igual que %d\n", primero,segundo);
        }
        
        if(primero != segundo){
            System.out.printf("%d es diferente que %d\n", primero,segundo);
        }
    }//termina método main
}//termina la clase
