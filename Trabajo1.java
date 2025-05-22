import java.util.Scanner;
import javax.swing.JOptionPane;

public class Trabajo1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static int obtenerNumeros(String mensaje) {
        int numeroTemporal = 0;

        String input = JOptionPane.showInputDialog(mensaje + ":");
        numeroTemporal = Integer.parseInt(input);

        while (numeroTemporal <= 0) {
            System.out.println("Por favor, ingresa un número positivo mayor a cero.");
            System.out.println(mensaje);
            input = JOptionPane.showInputDialog(mensaje + ":");
            numeroTemporal = Integer.parseInt(input);
        }

        return numeroTemporal;
    }

    public static void main(String[] args) {
        int numero = obtenerNumeros("Ingresa un número");
        int numero2 = obtenerNumeros("Ingresa otro número");
        int resultado = numero / numero2;
        JOptionPane.showMessageDialog(null, "EL RESULTADO ES: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }   
}
