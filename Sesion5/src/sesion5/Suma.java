package sesion5;
import javax.swing.JOptionPane;
public class Suma {
    public static void main(String[] args) {
        try {
            String valor1 = JOptionPane.showInputDialog("Dar un valor");
            double s1 = Double.parseDouble(valor1);

            String valor2 = JOptionPane.showInputDialog("Dar siguiente valor");
            double s2 = Double.parseDouble(valor2);

            double suma = s1 + s2;

            JOptionPane.showMessageDialog(null, "El resultado es: " + suma);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Diste un valor incorrecto");
        }
    }
}
