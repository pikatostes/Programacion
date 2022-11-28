public class e13 {
    public static void main(String[] args){
        int[] array = new int[100];
        int mayor = 0;
        int menor = 500;
        int res = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*501);
            if (array[i] > mayor){
                mayor = array[i];
            }
            if (array[i] < menor){
                menor = array[i];
            }
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        System.out.print("¿Qué número quieres destacar? ([1] Mayor [2] Mínimo): ");
        res = Integer.parseInt(System.console().readLine());
        System.out.println();

        if (res == 1){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == mayor) {
                    System.out.print("**"+array[i]+"** ");
                } else System.out.print(array[i] + " ");
            }
        }
        if (res == 2){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == menor) {
                    System.out.print(" **"+array[i]+"** ");
                } else System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}