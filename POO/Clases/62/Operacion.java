
import javax.swing.JOptionPane;

public class Operacion {
     // atributos
     int numero1;
     int numero2;
     int suma;
     int resta;
     int multiplicacion;
     int division;

     // metodos

     // metodo para pedir numeros
     public void leerNumeros() {
          System.out.println("Introduce un numero");
          numero1 = Integer.parseInt(System.console().readLine());
          
          System.out.println("Introduce otro numero");
          numero2 = Integer.parseInt(System.console().readLine());
     }

     // metodo para sumar ambos numeros
     public void suma() {
          suma = numero1 + numero2;
          
     }
     
     // metodo para restar ambos numeros
     public void resta() {
          resta = numero1 - numero2;
          
     }
     
     // metodo para multiplicar ambos numeros
     public void multiplicacion() {
          multiplicacion = numero1 * numero2;
          
     }
     
     // metodo para dividir ambos numeros
     public void division() {
          division = numero1 / numero2;
     }

     public void mostrarResultado() {
          System.out.println("La suma es: " +suma);
          System.out.println("La resta es: " +resta);
          System.out.println("La multiplicación es: " +multiplicacion);
          System.out.println("La división es: " +division);
          
     }
}
