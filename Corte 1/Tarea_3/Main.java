
public class Main {
    
    public static void main(String[] args) {
        Operations resultado = new Operations();
        resultado. sumar (3,2);
        System.out.println("El resultado de la suma es " + resultado.getR());
        
        resultado.restar (5,4);
        System.out.println ("El resultado de la resta es " + resultado.getR());
        
        resultado.multiplicar(6,8);
        System.out.println ("El resultado de la multiplicacion es " + resultado.getR());
        
        resultado.potencia(4,6);
        System.out.println("El resultado de la potencia es " + resultado.getR());
        
        
    }
    
}
