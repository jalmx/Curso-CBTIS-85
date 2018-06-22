package sesion4;

import java.util.Random;

public class Arreglo {


    public static void main(String[] args) {
        
        int aleatorio[] = new int[10];
        
        Random random = new Random();
        
        for(int x = 0; x < aleatorio.length; x++){
            //utilizando a random y usando su metodo, 
            //el cual me regresa numeros aleatorios enteros
            aleatorio[x] = random.nextInt(50);
        }
        
        for(int x = 0; x < aleatorio.length; x++){
            System.out.println("El valor en la posicion "+
                    x + " es " + aleatorio[x]);
        }
        
     //   int x =3;
    }
    
}
