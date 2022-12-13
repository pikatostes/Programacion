// Tirada de dados

public class Ejercicio1 {
    public static void main(String[] args){
        int cons = 7;
        System.out.print("¿Cuánto dinero quieres apostar? ");
        int apuesta = Integer.parseInt(System.console().readLine());

        int dado1 = (int)(Math.random()*6+1);
        System.out.println("Dado 1: "+dado1);

        int dado2 = (int)(Math.random()*6+1);
        System.out.println("Dado 2: "+dado2);

        int suma = dado1+dado2;
        System.out.println("Suma: "+suma);
        int numPrimTir = suma;

        if (suma == 3){
            System.out.println("¡Enhorabuena! ¡Ha ganado otros " +apuesta+"!");
            System.out.println("¡Ahora tiene "+apuesta*2+"!");
        } else if (suma == 7) {
            System.out.println("Lo siento, ha perdido todo su dinero :(");
        } else {
            System.out.println("Tiene que seguir tirando, debe conseguir un "+numPrimTir);
            System.out.println("Si obtiene un 7 perderá la partida");
            System.out.println("Pulse INTRO para tirar los dados.");

            System.out.println(numPrimTir);
            do {
                System.console().readLine();
                dado1 = (int)(Math.random()*6+1);
                System.out.println("Dado 1: "+dado1);

                dado2 = (int)(Math.random()*6+1);
                System.out.println("Dado 2: "+dado2);

                suma = dado1+dado2;
                System.out.println("Suma: "+suma);
            }while (suma != 7 || suma != numPrimTir);

            if (suma == numPrimTir){
                System.out.println("¡Enhorabuena! ¡Ha ganado otros " +apuesta+"!");
                System.out.println("¡Ahora tiene "+apuesta*2+"!");
            } else if (suma == 7) {
                System.out.println("Lo siento, ha perdido todo su dinero :(");
            }
        }
    }
}