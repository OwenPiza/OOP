import javax.swing.*;
import java.awt.*;

// Clase de la interfaz gráfica
public class VistaCajero extends JFrame {
    private ControladorCajero controlador; // ← Atributo privado

    // Constructor
    public VistaCajero(ControladorCajero controlador) {
        setControlador(controlador); // usamos el setter

        setTitle("Cajero Automático");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel para botones de depósito
        JPanel panelDepositar = new JPanel(new GridLayout(2, 2, 10, 10));
        panelDepositar.setBorder(BorderFactory.createTitledBorder("Depositar"));

        agregarBoton(panelDepositar, "Depositar $1'000.000", () -> getControlador().depositar(1000000));
        agregarBoton(panelDepositar, "Depositar $100.000", () -> getControlador().depositar(100000));
        agregarBoton(panelDepositar, "Depositar $50.000", () -> getControlador().depositar(50000));
        agregarBoton(panelDepositar, "Depositar $10.000", () -> getControlador().depositar(10000));

        // Panel para botones de retiro
        JPanel panelRetirar = new JPanel(new GridLayout(2, 2, 10, 10));
        panelRetirar.setBorder(BorderFactory.createTitledBorder("Retirar"));

        agregarBoton(panelRetirar, "Retirar $1'000.000", () -> mostrarResultado(getControlador().retirar(1000000)));
        agregarBoton(panelRetirar, "Retirar $100.000", () -> mostrarResultado(getControlador().retirar(100000)));
        agregarBoton(panelRetirar, "Retirar $50.000", () -> mostrarResultado(getControlador().retirar(50000)));
        agregarBoton(panelRetirar, "Retirar $10.000", () -> mostrarResultado(getControlador().retirar(10000)));

        // Botón de saldo
        JButton btnSaldo = new JButton("Consultar Saldo");
        btnSaldo.addActionListener(e -> {
            double saldo = getControlador().consultarSaldo();
            mostrarMensaje("Saldo actual: $" + saldo);
        });

        JPanel panelCentral = new JPanel(new GridLayout(2, 1));
        panelCentral.add(panelDepositar);
        panelCentral.add(panelRetirar);

        add(panelCentral, BorderLayout.CENTER);
        add(btnSaldo, BorderLayout.SOUTH);
        setVisible(true);
    }

    // Getter del controlador
    public ControladorCajero getControlador() {
        return controlador;
    }

    // Setter del controlador
    public void setControlador(ControladorCajero controlador) {
        this.controlador = controlador;
    }

    // Crea y agrega botones al panel
    private void agregarBoton(JPanel panel, String texto, Runnable accion) {
        JButton boton = new JButton(texto);
        boton.addActionListener(e -> {
            accion.run();
            mostrarMensaje("Operación realizada.");
        });
        panel.add(boton);
    }

    // Mensajes de éxito o error
    private void mostrarResultado(boolean exito) {
        if (exito) {
            mostrarMensaje("Retiro exitoso.");
        } else {
            mostrarMensaje("Saldo insuficiente.");
        }
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
}

