public class e1 {
    public e1() {
    }

    public static void main(String[] var0) {
        boolean var1 = true;
        System.out.print("¿Cuánto dinero quieres apostar? ");
        int var2 = Integer.parseInt(System.console().readLine());
        int var3 = (int)(Math.random() * 6.0 + 1.0);
        System.out.println("Dado 1: " + var3);
        int var4 = (int)(Math.random() * 6.0 + 1.0);
        System.out.println("Dado 2: " + var4);
        int var5 = var3 + var4;
        System.out.println("Suma: " + var5);
        int var6 = var5;

        switch (suma){
            case 3:
                System.out.println("¡Enhorabuena! ¡Ha ganado otros " + var2 + "!");
                System.out.println("¡Ahora tiene " + var2 * 2 + "!");
                break;
            case 7:
                System.out.println("Lo siento, ha perdido todo su dinero :(");
                break;
            default:
                System.out.println("Tiene que seguir tirando, debe conseguir un " + var5);
                System.out.println("Si obtiene un 7 perderá la partida");
                System.out.println("Pulse INTRO para tirar los dados.");
                System.out.println(var5);

                do{

                }while ()
        }
        }
    }