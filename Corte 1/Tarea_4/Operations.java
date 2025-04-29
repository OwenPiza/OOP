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
    
     public int getB(){
        return b;
    }
   
     public int getR(){
        System.out.print("Resultado = ");
        return r;
    }
   
}
