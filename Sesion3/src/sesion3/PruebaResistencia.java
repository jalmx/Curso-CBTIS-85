package sesion3;

public class PruebaResistencia {

    public static void main(String[] args) {

        Resistencia resistencia = new Resistencia();//cree una instancia

        resistencia.resistiendo();

        resistencia.setValorOhmico(220);

        resistencia.resistiendo();

        resistencia.setPotencia(34.2);

        System.out.println("El valor de la potencia es " +
                                resistencia.getPotencia() + " Watts");

        double potenciaMultiplicada = resistencia.potenciaMil(77);
        System.out.println("La potencia al mil " + potenciaMultiplicada);
    }
}
