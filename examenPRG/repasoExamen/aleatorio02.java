// Realizar un programa que simule el juego de los dados. Si en la primera tirada obtienes un 7,
// ganas la partida y doblas tu apuesta pero si obtienes un 3 pierdes todo el dinero apostado

public class aleatorio02 {
    public static void main(String[] args){
        int suma = 0;
        int dinTotal = 0;

        System.out.print("¿Cuánto dinero quieres apostar? ");
        int dineroApostado = Integer.parseInt(System.console().readLine());

        int dado1 = (int)(Math.random()*6+1);
        System.out.println("Dado 1: " +dado1);

        int dado2 = (int)(Math.random()*7);
        System.out.println("Dado 2: " +dado2);

        suma = dado1+dado2;
        System.out.println("Suma: " +suma);

        if (suma == 7){
            System.out.println("¡Enhorabuena! ¡Ha ganado otros "+dineroApostado+" €!");
        }
        if (suma == 3) {
            System.out.println("Lo siento, ha perdido todo su dinero 😢");
        }
        while (suma !=7){
            System.out.print("¿Cuánto dinero quieres apostar? ");
            int dineroApostado = Integer.parseInt(System.console().readLine());

            int dado1 = (int)(Math.random()*6+1);
            System.out.println("Dado 1: " +dado1);

            int dado2 = (int)(Math.random()*7);
            System.out.println("Dado 2: " +dado2);

            suma = dado1+dado2;
            System.out.println("Suma: " +suma);
        }
    }
}
