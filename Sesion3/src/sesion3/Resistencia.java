package sesion3;

public class Resistencia {

    private int valorOhmico;//campo privados
    private double potencia;//campo privado

    public void setValorOhmico(int resistencia){
        valorOhmico = resistencia;//asigno lo que tiene resistencia a valorOhmico
    }

    public int getValorOhmico(){
      return valorOhmico;  //regreso el valor ohmico
    }

    public void setPotencia(double p){
        potencia = p; //asigno el valor que tiene p a mi variable potencia
    }

    public double getPotencia() {
        return potencia; //retorno el valotr de potencia
    }

    public void resistiendo(){
        System.out.println("Mi resistencia es de " + valorOhmico + " Ohms");
    }

    public double potenciaMil(int multiplicador){
        return potencia * multiplicador;
    }
}
