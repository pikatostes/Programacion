public class Ejercicio5 {
	public static void main (String[] args) {
    int x=0;
    
    System.out.println("ax + b = 0");
    System.out.println("Introduce el valor de la a");
    int var1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("--------------------------");
    System.out.println(var1 + "x + b = 0");
    System.out.println("Introduce el valor de b");
    int var2 = Integer.parseInt(System.console().readLine());
    
    x = (-var2)/var1;
    System.out.printf("En %dx + %d = 0, x = %d", var1, var2, x);
	}
}

