// Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine de generar números hasta que no saque el 24.
// El programa deberá decir al final cuántos números se han generado.

public class e9 {
    public static void main(String[] args){
        int contador = 0;
        boolean veinticuatro = false;

        while (!veinticuatro){
            int num = (int)(Math.random()*100);
            if (num%2 == 0){
                System.out.print(num + " ");
                contador++;
                if (num == 24){
                    veinticuatro = true;
                }
            }
        }
        System.out.println("Se han generado " + contador + " números pares hasta llegar al 24");
    }
}