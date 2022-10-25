// Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
// Muestra también el máximo, el mínimo y la media de esos números.

public class e5 {
    public static void main(String[] args) {
        int max = 0;
        int min = 199;
        double media = 0;
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            int num = (int)(Math.random()*199);
            System.out.print(num + " ");
            suma = num + suma;
            if (num<min){
                min = num;
            }
            if (num>max){
                max = num;
            }
        }
        System.out.println();
        media = suma/50;
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + media);
    }
}
