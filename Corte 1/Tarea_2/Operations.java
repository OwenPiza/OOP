public class Operations {
    private int a, b;

    public Operations(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Métodos privados
    private int sumar() {
        return a + b;
    }

    private int restar() {
        return a - b;
    }

    private int multiplicar() {
        return a * b;
    }

    private int potencia() {
        return potenciaRecursiva(a, b);
    }

    private int potenciaRecursiva(int base, int exponente) {
        return (exponente == 0) ? 1 : base * potenciaRecursiva(base, exponente - 1);
    }

    // Métodos públicos para acceder al resultado
    public int getSuma() {
        return sumar();
    }

    public int getResta() {
        return restar();
    }

    public int getMultiplicacion() {
        return multiplicar();
    }

    public int getPotencia() {
        return potencia();
    }
}
