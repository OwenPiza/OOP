public class Operations {
   private int a,b,r;
        // Métodos para operaciones matemáticas
    public int sumar(int a, int b) {
        r = a + b;
        return r;
    }

    public int restar(int a, int b) {
        r = a - b;
        return r;   
    }

    public int multiplicar(int a, int b) {
        r = a * b;
        return r;
    }
    public int potencia (int base, int exponente){
        
        r = exponente == 0 ? 1: base*potencia(base,exponente-1);
        return r;
    }
    //Getter y Setter
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a = a;
    }
     public int getB(){
        return b;
    }
    public void setB(int b){
        this.b = b;
    }
     public int getR(){
        System.out.print("Resultado = ");
        return r;
    }
    public void setR(int r){
        this.r = r;
    }
}
