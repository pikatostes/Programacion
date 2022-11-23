// Escribe un programa que pida 10 números por teclado y que luego muestre los números
// introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del
// mínimo respectivamente.

public class e5 {
    public static void main(String[] args){
        int max = 0;
        int min = 999999;
        int[] num = new int[10];
        for (int i = 0; i<10; i++){
            System.out.print("Introduce un número: ");
            num[i] = Integer.parseInt(System.console().readLine());

            if (num[i]>max){
                max = num[i];
            }
            if (num[i]<min){
                min = num[i];
            }
        }
        for (int i = 0; i<10; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("Maximo:" + max);
        System.out.println("Minimo: " + min);
    }
}