public class e9 {
    public static void main(String[] args) {
        int cifras = 0;
        System.out.println("-------------------------");
        System.out.println("---CONTADOR DE DIGITOS---");
        System.out.println("-------------------------");
        System.out.println("Introduce un número");
        int numero = Integer.parseInt(System.console().readLine());
        int num = numero;

        do{
            num = num / 10;
            cifras++;
        } while (num>0);
        
        System.out.println("El numero " + numero + " tiene " + cifras + " cifras");
    } 
}
