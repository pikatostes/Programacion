
public class Main {
     public static void main(String[] args) {

          System.out.print("Introduce un numero: ");
          int n1 = Integer.parseInt(System.console().readLine());

          System.out.print("Introduce otro numero: ");
          int n2 = Integer.parseInt(System.console().readLine());

          Operacion op = new Operacion();
          
          // argumentos
          op.suma(n1, n2);
          op.resta(n1, n2);
          op.multiplicacion(n1, n2);
          op.division(n1, n2);

          op.mostrarResultado();
     }
}
