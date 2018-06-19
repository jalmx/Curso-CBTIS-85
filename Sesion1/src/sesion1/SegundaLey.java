package sesion1;

public class SegundaLey {

    /* 
    Calcular la fuerza si un objeto tiene una aceleración de
    10m/s 2 y una masa de 2.5kg. Después, si el objeto incrementa
    su aceleración a 12.6m/s 2 .
    */    
    public static void main(String[] args) {
        
        double masa = 2.5;
        double acelaracion1 = 10;
        double acelaracion2 = 12.6;
        
        double fuerza = masa * acelaracion1;
        
        System.out.println("La fuerza 1 es " + fuerza + " N");
        
        fuerza = masa * acelaracion2;
        
        System.out.println("La fuerza 2 es " + fuerza + " N");
    }
    
}
