public class Ejercicio10 {
    public static void main (String[] args){
        int dia;
        String mes;
        String horoscopo = "";

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("---------------------------------HOROSCOPO----------------------------------");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("¿Qué dia naciste?");
        dia = Integer.parseInt(System.console().readLine());
        System.out.println("¿En qué mes naciste?");
        mes = System.console().readLine();
        System.out.println(mes);
        if ((mes.equals("Diciembre") || mes.equals("Enero")){
            if (dia <=22){
                horoscopo = "Capricornio";
            }
        } else if ((mes.equals("Enero") || mes.equals("Febrero")){
            if (dia <=21){
                horoscopo = "Acuario";
            }
        } else if ((mes.equals("Febrero") || mes.equals("Marzo")){
            if (dia <=20){
                horoscopo = "Piscis";
            }
        } else if ((mes.equals("Marzo") || mes.equals("Abril")){
            if (dia <=21){
                horoscopo = "Aries";
            }
        } else if ((mes.equals("Abril") || mes.equals("Mayo")) {
            if (dia <= 21) {
                horoscopo = "Tauro";
            }
        } else if ((mes.equals("Mayo") || mes.equals("Junio")) {
            if (dia <= 22) {
                horoscopo = "Géminis";
            }
        } else if ((mes.equals("Junio") || mes.equals("Julio")) {
            if (dia <= 22) {
                horoscopo = "Cáncer";
            }
        } else if ((mes.equals("Julio") || mes.equals("Agosto")) {
            if (dia <= 23) {
                horoscopo = "Leo";
            }


        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Tu horoscopo es: " + horoscopo);
    }
}