package sesion5;

import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{ 
            System.out.println("Da un número entero ");

            int x = sc.nextInt();
            System.out.println("El numero que diste es: " + x);
            
        }catch(Exception e){
            System.out.println("Diste un valor invalido");
        }
      
    }
    
}
