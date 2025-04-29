import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia de la clase Operations
        Operations resultado = new Operations();

        // Mostrar un cuadro de diálogo para pedir los números
        String num1Str = JOptionPane.showInputDialog("Introduce el primer número:");
        String num2Str = JOptionPane.showInputDialog("Introduce el segundo número:");

        int num1, num2;

        try {
            num1 = Integer.parseInt(num1Str);
            num2 = Integer.parseInt(num2Str);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor, ingrese un número válido.");
            return; // Finaliza el programa si hay un error
        }

        // Realizar operaciones
        resultado.sumar(num1, num2);
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado.getR());

        resultado.restar(num1, num2);
        JOptionPane.showMessageDialog(null, "La diferencia es igual a: " + resultado.getR());

        resultado.multiplicar(num1, num2);
        JOptionPane.showMessageDialog(null, "El producto de la multiplicación es: " + resultado.getR());

        resultado.potencia(num1, num2);
        JOptionPane.showMessageDialog(null, "El resultado de la potencia es: " + resultado.getR());
    }
}
