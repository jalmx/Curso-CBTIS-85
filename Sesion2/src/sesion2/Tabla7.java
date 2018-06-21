/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

/**
 *
 * @author josef
 */
public class Tabla7 {

    public static void main(String[] args) {

        // x = x + 1 
        int tabla = 235;
        
        // x = x + 2 -> x+=2
        for (int x = 1; x <= 1000; x++) {//comienza el for
            int valor = tabla * x;
//            System.out.println("valor de x: "+x);
            System.out.println(tabla + "x" + x + " = " + valor);
        }//termina el for
        //
        System.out.println("------------------------");//separador
        
//        for(int x = 10; x >0; x--){
//            int valor = tabla * x;
//            System.out.println(tabla + " x " + x + " = " + valor);
//        }
    }

}
