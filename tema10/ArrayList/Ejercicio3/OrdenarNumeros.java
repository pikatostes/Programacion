import java.util.ArrayList;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int num;

        // Pedir al usuario que introduzca los 10 números
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            num = sc.nextInt();
            numeros.add(num);
        }

        // Ordenar los números de forma ascendente usando el algoritmo de selección
        for (int i = 0; i < numeros.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(j) < numeros.get(min)) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = numeros.get(i);
                numeros.set(i, numeros.get(min));
                numeros.set(min, temp);
            }
        }

        // Mostrar los números ordenados
        System.out.println("Los números ordenados son:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
    }
}
