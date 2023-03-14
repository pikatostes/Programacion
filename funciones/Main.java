public class Main {
     public static void main(String[] args) {
          System.out.println("Introduzca el primer número");
          int num1 = Integer.parseInt(System.console().readLine());

          System.out.println("Introduzca el segundo número");
          int num2 = Integer.parseInt(System.console().readLine());

          int res = sumar(num1, num2);
          System.out.println(res);
     }

     public static int sumar(int a, int b) {
          int resultado = a + b;
          return resultado;
     }        
}