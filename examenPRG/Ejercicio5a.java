// Numeros hasta 10000

public class Ejercicio5a {
    public static void main(String[] args){
        System.out.println("Introduce numeros hasta llegar a 10000 o superarlo");
        double num = 0;
        double suma = 0;
        int contador = 0;
        double media = 0;

        do {
            System.out.print("Introduce un numero: ");
            num = Double.parseDouble(System.console().readLine());
            contador++;

            suma=num+suma;
        } while (suma<10000);

        media=suma/contador;
        System.out.println("Total: "+suma);
        System.out.println("Numeros introducidos: "+contador);
        System.out.println("Media: "+media);
    }
}
