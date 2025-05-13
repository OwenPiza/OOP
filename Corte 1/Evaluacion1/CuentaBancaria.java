// Clase que representa una cuenta bancaria
public class CuentaBancaria {
    private double saldo; // ← Atributo privado

    // Constructor
    public CuentaBancaria(double saldoInicial) {
        setSaldo(saldoInicial); // Usamos el setter
    }

    // Getter del saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter del saldo (controlado)
    public void setSaldo(double saldo) {
        // Aseguramos que el saldo no sea negativo
        this.saldo = Math.max(saldo, 0);
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            setSaldo(getSaldo() + cantidad); // usamos getter y setter
        }
    }

    // Método para retirar dinero
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad); // usamos getter y setter
            return true;
        }
        return false;
    }
}
