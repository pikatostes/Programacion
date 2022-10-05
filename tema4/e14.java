public class e14 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        int num = Integer.parseInt(System.console().readLine());
        String div = "hola";
        String par = "hola";

        if ((num % 5 == 0) && (num % 5 == 0)){
            div = "es divisible entre 5 y par";
        } else if ((num % 5 != 0) && (num % 2 != 0)) {
            div = "es indivisible entre 5 e impar";
        } else if (num % 5 == 0) {
            div = " es divisible entre 5";
        } else if (num % 5 != 0) {
            div = " es indivisible entre 5";
        } else if (num % 2 == 0) {
            div = " es par";
        } else if (num % 2 != 0) {
            div = "es impar";
        }
        System.out.println("El numero " + num + div);
    }
}