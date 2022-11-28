public class Ejercicio8 {
    public static void main (String[] args) {
        String notaBoletin = "a";
        System.out.println("------------------------------");
        System.out.println("---CALCULO DE LA NOTA MEDIA---");
        System.out.println("------------------------------");

        System.out.println("Introduce la primera nota");
        int nota1 = Integer.parseInt(System.console().readLine());

        System.out.println("Introduce la segunda nota");
        int nota2 = Integer.parseInt(System.console().readLine());

        System.out.println("Introduce la tercera nota");
        int nota3 = Integer.parseInt(System.console().readLine());

        System.out.println("------------------------------");
        int notaMedia = (nota1+nota2+nota3)/3;

        if (notaMedia < 5){
            notaBoletin = "insuficiente";
        } else if (notaMedia < 6){
            notaBoletin = "suficiente";
        } else if (notaMedia < 7){
            notaBoletin = "bien";
        } else if (notaMedia < 9){
            notaBoletin = "notable";
        } else if (notaMedia < 10){
            notaBoletin = "sobresaliente";
        }
        System.out.printf("Su nota en el boletin es: %s.", notaBoletin);
    }
}