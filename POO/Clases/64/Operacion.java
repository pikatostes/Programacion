
import javax.swing.JOptionPane;

public class Operacion {
     // atributos

     // metodos

     // metodo para sumar ambos numeros
     public int sumar(int num1, int num2) {
          int suma = num1 + num2;
          return suma;
     }
     
     // metodo para restar ambos numeros
     public int restar(int num1, int num2) {
          int resta = num1 - num2;
          return resta;
          
     }
     
     // metodo para multiplicar ambos numeros
     public int multiplicar(int num1, int num2) {
          int multiplicacion = num1 * num2;
          return multiplicacion;
          
     }
     
     // metodo para dividir ambos numeros
     public int dividir(int num1, int num2) {
          int division = num1 / num2;
          return division;
     }

     public void mostrarResultado(int suma, int resta, int division, int multiplicacion) {
          System.out.println("La suma es: " +suma);
          System.out.println("La resta es: " +resta);
          System.out.println("La multiplicación es: " +multiplicacion);
          System.out.println("La división es: " +division);
          
     }
}
