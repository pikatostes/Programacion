public class Ejercicio9 {
    public static void main (String[] args){
        int x=0;

        System.out.println("ax² + b + c = 0");
        System.out.println("Introduce el valor de la a");
        int a = Integer.parseInt(System.console().readLine());

        System.out.println("--------------------------");
        System.out.println(a + "x² + b + c = 0");
        System.out.println("Introduce el valor de b");
        int b = Integer.parseInt(System.console().readLine());

        System.out.println("--------------------------");
        System.out.println(a + "x + " + b " + c = 0");
        System.out.println("Introduce el valor de c");
        int c = Integer.parseInt(System.console().readLine());

        x= ((-b)+ Math.sqrt(b*b-4*a*c))
        System.out.printf("En %dx² + %d + %d = 0, x = %d", a, b, c, x);
    }
}