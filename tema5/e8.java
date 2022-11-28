public class e8{
    public static void main(String[] args) {
        int valor = 0;
        int res;

        System.out.println("--------------------------");
        System.out.println("---TABLA DE MULTIPLICAR---");
        System.out.println("--------------------------");
        System.out.println("Introduce un numero");
        int numero = Integer.parseInt(System.console().readLine());

        do{
            res=numero*valor;
            System.out.println(numero + " * " + valor + " = " + res);
            valor++;
        } while (valor<11);
    }
}