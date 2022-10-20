// Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
//El programa intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades.
// En cada intento fallido, el programa debe preguntar si el número que estás pensando es mayor o menor que el que te acaba de decir.

public class e14 {
    public static void main(String[] args){
        System.out.println("¿El número en el que estás pensando es el 50?");
        String respuesta = System.console().readLine();

        if (respuesta == "si"){
            System.out.println("Demasaido fácil");
        }
        if (respuesta.equals("no")) {
            System.out.println("¿El número que estás pensando es mayor o menor a 50?");
            respuesta = System.console().readLine();
            if (respuesta == "mayor"){
                int num = (int)(Math.random()*50) + 1;
                System.out.println(num);
            }
        }
    }
}