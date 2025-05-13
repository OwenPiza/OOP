// Clase que maneja la lógica entre la cuenta y la interfaz
public class ControladorCajero {
    private CuentaBancaria cuenta; // ← Atributo privado

    // Constructor
    public ControladorCajero(CuentaBancaria cuenta) {
        setCuenta(cuenta); // usamos el setter
    }

    // Getter
    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    // Setter
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    // Consultar saldo usando getter
    public double consultarSaldo() {
        return getCuenta().getSaldo();
    }

    // Retirar usando getter
    public boolean retirar(double cantidad) {
        return getCuenta().retirar(cantidad);
    }

    // Depositar usando getter
    public void depositar(double cantidad) {
        getCuenta().depositar(cantidad);
    }
}
