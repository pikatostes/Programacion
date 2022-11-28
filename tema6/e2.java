// Realiza un programa que muestre al azar el nombre de una carta de la
// baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
// diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
// cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
// sería el 1). Para convertir un número en una cadena de caracteres podemos
// usar String.valueOf(n).

public class e2 {
    public static void main(String[] args){
        System.out.println("----------------------------------");
        System.out.println("---CARTAS DE LA BARAJA FRANCESA---");
        System.out.println("----------------------------------");
        int numPalo = (int)(Math.random()*4)+1;
        String palo = "a";
        switch (numPalo){
            case 1:
                palo="picas";
                break;
            case 2:
                palo="corazones";
                break;
            case 3:
                palo="diamantes";
                break;
            case 4:
                palo="tréboles";
                break;
            default:
                break;
        }
        int numCarta = (int)(Math.random()*13)+1;
        String carta = "a";
        switch (numCarta){
            case 1:
                carta = "J";
                break;
            case 2:
                carta = "Q";
                break;
            case 3:
                carta = "K";
                break;
            case 4:
                carta = "A";
                break;
            default:
                carta = String.valueOf(numCarta);
                break;
        }
        System.out.println(carta + " de " + palo);
    }
}
