public class e15 {
    public static void main(String[] args){
        System.out.println("---------------------------");
        System.out.println("---CALCULADORA POTENCIAS---");
        System.out.println("---------------------------");
        System.out.print("Introduce una base ");
        double base = Double.parseDouble(System.console().readLine());

        System.out.print("Introduce un exponente ");
        int expo = Integer.parseInt(System.console().readLine());
        int contador = expo;

        do {
            double res = base*base;
        }
    }
}