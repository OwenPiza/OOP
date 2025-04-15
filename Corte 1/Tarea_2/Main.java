public class Main {
    public static void main(String[] args) {
        Operations op1 = new Operations(3, 2);
        System.out.println("Suma: " + op1.getSuma());

        Operations op2 = new Operations(5, 4);
        System.out.println("Resta: " + op2.getResta());

        Operations op3 = new Operations(6, 8);
        System.out.println("Multiplicación: " + op3.getMultiplicacion());

        Operations op4 = new Operations(4, 6);
        System.out.println("Potencia: " + op4.getPotencia());
    }
}
