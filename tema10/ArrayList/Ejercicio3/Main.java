import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList de tipo 'int' asignada a 'numeros'
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        
        // Bucle introducción números
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        
        // Método 'sort' para ordenar números
        Collections.sort(numeros);
        
        // Imprime los números ordenados
        System.out.println("Números ordenados:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
