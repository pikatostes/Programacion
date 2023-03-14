
import javax.swing.JOptionPane;

public class Operacion {
     // atributos
     int suma;
     int resta;
     int multiplicacion;
     int division;

     // metodos

     // metodo para sumar ambos numeros
     public void suma(int num1, int num2) {
          suma = num1 + num2;
     }
     
     // metodo para restar ambos numeros
     public void resta(int num1, int num2) {
          resta = num1 - num2;
          
     }
     
     // metodo para multiplicar ambos numeros
     public void multiplicacion(int num1, int num2) {
          multiplicacion = num1 * num2;
          
     }
     
     // metodo para dividir ambos numeros
     public void division(int num1, int num2) {
          division = num1 / num2;
     }

     public void mostrarResultado() {
          System.out.println("La suma es: " +suma);
          System.out.println("La resta es: " +resta);
          System.out.println("La multiplicación es: " +multiplicacion);
          System.out.println("La división es: " +division);
          
     }
}
