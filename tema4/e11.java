public class e11 {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("-------------RELOJ-------------");
        System.out.println("-------------------------------");
        System.out.println("Introduce la hora (formato 24h)");
        int hora = Integer.parseInt(System.console().readLine());
        if ((0 < hora) && (hora > 23)) {
            System.out.println("El dato no es correcto");
        } else {
            System.out.println("Introduce los minutos");
            int min = Integer.parseInt(System.console().readLine());
            if ((0 < min) && (min > 59)) {
                System.out.println("El dato no es correcto");
            } else {
                /* Ya es media noche */
                if ((hora == 0) && (min == 0)){
                    System.out.println("Ya es medianoche");
                    /* Demás casos */
                } else {
                    int horaSec = (23 - hora)* 3600;
                    int minSec = (60 - min)* 60;
                    int medianoche = horaSec + minSec;
                    System.out.println("Faltan " + medianoche + " segundos para medianoche.");
                }
            }
        }
    }
}
