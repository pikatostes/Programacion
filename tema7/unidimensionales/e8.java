// Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado
// año y que muestre a continuación un diagrama de barras horizontales con esos datos.
// Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.

public class e8 {
    public static void main(String[] args){
        int[] temperatura = new int[12];
        for (int i = 0; i < temperatura.length; i++){
            System.out.print("Introduce la temperatura media del mes "+(i+1)+": ");
            temperatura[i] = Integer.parseInt(System.console().readLine());
        }
        for (int i = 0; i < temperatura.length; i++){
            System.out.printf("Mes %2d: ",(i+1));
            for (int j = 0; j < temperatura[i]; j++){
                System.out.print("|");
            }
            System.out.println();
        }
    }
}