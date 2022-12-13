// Grafica de barras

public class Ejercicio2 {
    public static void main(String[] args){
        int[] num = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Introduce un número: ");
            num[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i = 0; i<5; i++){
            if ((num[i]>0) && (num[i]<11)){
                System.out.print(num[i]+" ");
                for (int l = 0; l < num[i]; l++){
                    System.out.print("|");
                }
                System.out.println();
            } else if ((num[i]<0) || (num[i]>11)) {
                System.out.println("Error al introducir los datos");
            }
        }
    }
}