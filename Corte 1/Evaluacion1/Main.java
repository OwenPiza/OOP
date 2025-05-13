// Clase principal que ejecuta el cajero
public class Main {
    public static void main(String[] args) {
        // Se crea una cuenta con $10.000 de saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria(10000);
        
        // Se crea el controlador con esa cuenta
        ControladorCajero controlador = new ControladorCajero(cuenta);
        
        // Se lanza la interfaz gráfica
        new VistaCajero(controlador);
    }
}
