package sesion4;

public class CalculoResistencia {

    
    public double serie(double[] resistencias){
        double suma = 0.0;
        
        for(int perrito = 0; perrito < resistencias.length; perrito++){
            suma += resistencias[perrito];
        }
        
        return suma;
    }
   
    
    public double paralelo(double[] resistencias){
        double suma = 0.0;
        
        for(int i = 0; i < resistencias.length; i++){
            suma += 1/resistencias[i];
        }
        
        return 1/suma;
    }
    
    public double serie(double resitencia1, double resistenca2){
        return resitencia1 + resistenca2;
    }
    
    public double serie(int resistencia1, int resistencia2){
        return resistencia1 + resistencia2;
    }
}
