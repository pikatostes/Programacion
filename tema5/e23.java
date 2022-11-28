public class e23 {
    public static void main(String[] args){
        int num = 0;
        double total = 0;
        int contador = 0;
        double media = 0;

        do {
            System.out.print("Introduce un número: ");
            num = Integer.parseInt(System.console().readLine());
            total = num+num;
            contador++;
        } while (total <= 10000);
        System.out.println("El total ha sido " + total);
        System.out.println("se han introducido " + contador + " números");
        media=total/contador;
        System.out.println("La media ha sido de " + media);
    }
}