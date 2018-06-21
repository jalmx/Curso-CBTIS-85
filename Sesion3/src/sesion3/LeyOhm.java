package sesion3;

public class LeyOhm {
    
    public double voltaje(double corriente, double resistencia){
        double voltaje = corriente * resistencia;
        return voltaje;
    }
    
    public double corriente(double voltaje, double resistencia){
        double corriente = voltaje / resistencia;
        return corriente;
    }
    
    public double resistencia(double voltaje, double corriente){
        double resistencia = voltaje / corriente;
        return resistencia;
    }
    
}
