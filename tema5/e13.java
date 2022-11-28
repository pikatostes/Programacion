public class e13 {
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("---LISTA DE NÚMEROS---");
        System.out.println("----------------------");
        int positivos = 0;
        int negativos = 0;

        System.out.print("¿Cúantos números vas a introducir? ");
        int contador = Integer.parseInt(System.console().readLine());

        do {
            System.out.print("Introduce un número ");
            int num = Integer.parseInt(System.console().readLine());

            if (num > 0){
                positivos++;
            } else{
                negativos++;
            }
            contador--;
        } while (contador > 0);

        System.out.println("Hay un total de " + positivos + " positivos y " + negativos + " negativos");
    }
}