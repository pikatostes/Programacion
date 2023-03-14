import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // ArrayList de tipo 'int' asignada a 'numeros'
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Random rand = new Random();
        // Tamaño aleatorio entre 10 y 20
        int tamaño = rand.nextInt(11) + 10;
        int suma = 0;
        int maximo = 0;
        int minimo = 100;
        
        // Agrega valores aleatorios al ArrayList
        for (int i = 0; i < tamaño; i++) {
            int valor = rand.nextInt(101); // Genera un valor aleatorio entre 0 y 100
            numeros.add(valor);
            suma += valor;      // calcula suma
            if (valor > maximo) {
                maximo = valor;     // calcula máximo
            }
            if (valor < minimo) {
                minimo = valor;     // calcula mínimo
            }
        }
        
        double media = (double) suma / tamaño;      // calcula media
        
        // Imprime los resultados
        System.out.println("Lista de números: " + numeros);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
