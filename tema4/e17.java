public class e17 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.println(" La última cifra de " +num+ " es: " +(num % 10));
    }
}