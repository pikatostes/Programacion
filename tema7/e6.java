// Escribe un programa que lea 15 números por teclado y que los almacene en un array.
// Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1,
// el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0.
// Finalmente, muestra el contenido del array.

public class e6 {
    public static void main(String[] args){
        int[] numero = new int[10];
        for (int i = 0; i<10; i++){
            System.out.print("Introduce un número: ");
            numero[i] = Integer.parseInt(System.console().readLine());
        }

        int aux = numero[numero.length-1];
        for (int i = (numero.length - 1); i > 0; --i){
            numero[i] = numero[i-1];
        }
        numero[0] = aux;

        System.out.println();
        for (int i = 0; i < numero.length; i++){
            System.out.print(numero[i]+" ");
        }
    }
}