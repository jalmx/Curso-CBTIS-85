/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

import java.util.Scanner;

/**
 *
 * @author josef
 */
public class AproboReprobo {

    public static void main(String[] args) {
        Scanner caballitoDeMar = new Scanner(System.in);
        
        System.out.println("Dar calificación del alumno");
        int calificacion = caballitoDeMar.nextInt();
        
        if(calificacion >= 6){//si es mayor o igual a 6 la calificación
            System.out.println("El alumno está aprobado");
        }
        if(calificacion < 6){//si es menor a 6 la calificación
            System.out.println("Lastima margarito, sigue participando");
        }
    }
    
}
