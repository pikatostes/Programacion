// Racha de victorias

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] goles = new int[10];
        int contador = 0;
        int resul1 = 0;
        int resul2 = 0;
        int victorias = 0;

        System.out.print("Introduce alternando entre los goles marcados por nuestro equipo y el contrincante: ");
        for (int i = 0; i < 10; i++) {
            goles[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println();
        System.out.print("[");
        for (int i = 0; i < 10; i++) {
            System.out.print(goles[i]+" ");
        }
        System.out.print("] se corresponde con:");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(goles[i]+"-"+goles[i+1]+", ");
        }
        System.out.println();
    }
}

