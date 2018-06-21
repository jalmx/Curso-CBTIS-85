package sesion3;

public class PruebaLeyOhm {

    public static void main(String[] args) {
        LeyOhm ley = new LeyOhm();
        
        double resistencia = 220;
        double corriente = 0.5;
        
        double voltaje = ley.voltaje(corriente, resistencia);
        
        System.out.println("El voltaje = 220 ohms x 0.5A = " + 
                voltaje + " Volts");
        
    }
    
}
