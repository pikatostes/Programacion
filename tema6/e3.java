// Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.

public class e3 {
    public static void main(String[] args){
        System.out.println("----------------------------------");
        System.out.println("---CARTAS DE LA BARAJA ESPAÑOLA---");
        System.out.println("----------------------------------");
        int numPalo = (int)(Math.random()*4)+1;
        String palo = "a";
        switch (numPalo){
            case 1:
                palo="oro";
                break;
            case 2:
                palo="bastos";
                break;
            case 3:
                palo="copas";
                break;
            case 4:
                palo="espadas";
                break;
            default:
                break;
        }
        int numCarta = (int)(Math.random()*7)+1;
        String carta = "a";
        switch (numCarta){
            case 1:
                carta = "sota";
                break;
            case 2:
                carta = "caballo";
                break;
            case 3:
                carta = "rey";
                break;
            case 4:
                carta = "as";
                break;
            default:
                carta = String.valueOf(numCarta);
                break;
        }
        System.out.println(carta + " de " + palo);
    }
}