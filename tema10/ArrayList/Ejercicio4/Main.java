import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList de tipo String asignada a 'nombres'
        ArrayList<String> palabras = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        
        // Bucle introducción palabras
        System.out.println("Introduce las palabras:");
        for (int i = 0; i < 10; i++) {
            String palabra = scanner.next();
            palabras.add(palabra);
        }
        
        // Método sort() de la clase Collections
        Collections.sort(palabras);
        
        // Impresión palabras ordenadas
        System.out.println("Palabras ordenadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
