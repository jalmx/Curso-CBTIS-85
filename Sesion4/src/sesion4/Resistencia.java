package sesion4;

public class Resistencia {

    private double valor;
    private double potencia;
            
    public Resistencia(double valorOhmico){
        valor = valorOhmico;
    }
    
    public Resistencia(double valorOhmico, double p){
        valor = valorOhmico;
        potencia = p;
    }
    
    public double getValorOhmico(){
        return valor;
    }
    
    public double getPotencia(){
        return potencia;
    }
}
