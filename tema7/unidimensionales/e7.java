// Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por
// pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y
// a continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista
// generada anteriormente. Los números que se han cambiado deben aparecer entrecomillados.

public class e7 {
    public static void main(String[] args){
        int[] numero = new int[100];
        for (int i = 0; i < 100; i++) {
            numero[i] = (int) (Math.random() * 21);
        }
        System.out.print("Introduce el numero sustituto: ");
        int num = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce el numero que deseas cambiar: ");
        int sust = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == sust) {
                System.out.print("\"" + num + "\" ");
            } else {
                System.out.print(numero[i] + " ");
            }
        }
        System.out.println();
    }
}