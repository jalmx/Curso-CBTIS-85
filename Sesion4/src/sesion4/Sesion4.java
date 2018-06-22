package sesion4;

class Sesion4 { //inicio la clase o el objeto

     public static void main(String[] args) {//inicia el método main
        
        int edades[] = new int[4]; //declare mi array vacío con 4 espacios
        
        edades[0] = 50;//cargo un valor a la posicion 0
        edades[1] = 28;//cargo un valor a la posicion 1
        edades[2] = 38;//cargo un valor a la posicion 2
        edades[3] = 63;//cargo un valor a la posicion 3
        
        System.out.println("En la posicion 0 tengo la edad de: " +
                                edades[0]);
        
        System.out.println("En la posicion 2 tengo la edad de: " +
                                edades[2]);
        
        System.out.println("---------------------------");
         
        for(int x = 0; x < 4; x++){
            System.out.println("En la posicion " + x + " la edad es "+
                    edades[x]);
        }
    }
} 
