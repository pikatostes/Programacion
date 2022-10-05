public class e22 {
    public static void main(String[] args){
        System.out.println("Introduza un dia de la semana (lunes a viernes)");
        String dia = System.console().readLine();
        System.out.println("Introduzca la hora");
        int hora = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca los minutos");
        int min = Integer.parseInt(System.console().readLine());

        int minRes;
        switch (dia){
            case "lunes":
                minRes = ((23-hora)*60+(60-min))+24*60*3+15*60;
                System.out.println("Faltan " + minRes + " minutos para el fin de semana");
                break;
            case "martes":
                minRes = ((23-hora)*60+(60-min))+24*60*2+15*60;
                System.out.println("Faltan " + minRes + " minutos para el fin de semana");
                break;
            case "miércoles":
                minRes = ((23-hora)*60+(60-min))+24+15*60;
                System.out.println("Faltan " + minRes + "minutos para el fin de semana");
                break;
            case "jueves":
                minRes = ((23-hora)*60+(60-min))+15*60;
                System.out.println("Faltan " + minRes + " minutos para el fin de semana");
                break;
            case "viernes":
                minRes = (14-hora)*60+(60-min);
                System.out.println("Faltan " + minRes + " minutos para el fin de semana");
                break;
            default:
                System.out.println("El día '" + dia + "' no es válido.");
                break;
        }
    }
}