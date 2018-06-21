package sesion3;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double suma = 0;//inicializamos la variable en cero
        
        System.out.println("Cuántos números va a ingresar?" + "\n");
        
        int total = leer.nextInt();
        
        for(int x = 1; x <= total; x++){
            System.out.println("Dar el dato " + x);
            double dato = leer.nextDouble();
            suma = suma + dato;
        }
        
        double media = suma / total;
        
        System.out.printf("La media es: %.2f \n", media);
        
    }
    
}
