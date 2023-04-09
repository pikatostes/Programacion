import java.util.ArrayList;
import java.util.Scanner;

public class OrdenarPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<String>();
        String palabra;

        // Pedir al usuario que introduzca las 10 palabras
        System.out.println("Introduce 10 palabras:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabra = sc.nextLine();
            palabras.add(palabra);
        }

        // Ordenar las palabras de forma alfabética usando el algoritmo de selección
        for (int i = 0; i < palabras.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < palabras.size(); j++) {
                if (palabras.get(j).compareToIgnoreCase(palabras.get(min)) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                String temp = palabras.get(i);
                palabras.set(i, palabras.get(min));
                palabras.set(min, temp);
            }
        }

        // Mostrar las palabras ordenadas
        System.out.println("Las palabras ordenadas son:");
        for (int i = 0; i < palabras.size(); i++) {
            System.out.print(palabras.get(i) + " ");
        }
    }
}
