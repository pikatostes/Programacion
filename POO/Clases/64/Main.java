
public class Main {
     public static void main(String[] args) {

          System.out.print("Introduce un numero: ");
          int n1 = Integer.parseInt(System.console().readLine());

          System.out.print("Introduce otro numero: ");
          int n2 = Integer.parseInt(System.console().readLine());

          Operacion op = new Operacion();
          
          // argumentos
          System.out.println("La suma es: " + op.sumar(n1, n2));
          System.out.println("La resta es: " +op.restar(n1, n2));
          System.out.println("La multiplicación es: " +op.multiplicar(n1, n2));
          System.out.println("La división es: " +op.dividir(n1, n2)); 
     }
}
