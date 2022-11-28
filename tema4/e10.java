public class e10 {
    public static void main (String[] args){
        int dia;
        String mes;
        String horoscopo = "hola";

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("---------------------------------HOROSCOPO----------------------------------");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("¿Qué dia naciste?");
        dia = Integer.parseInt(System.console().readLine());
        System.out.println("¿En qué mes naciste?");
        mes = System.console().readLine();

        if (((mes.equals("Diciembre") && (dia >=22)) || ((mes.equals("Enero") && (dia <=20))))){
            horoscopo = "Capricornio";
        } else if (((mes.equals("Enero") && (dia >=21)) || ((mes.equals("Febrero") && (dia <=19))))){
            horoscopo = "Acuario";
        } else if (((mes.equals("Febrero") && (dia >=20)) || (mes.equals("Marzo") && (dia <=20)))){
            horoscopo = "Piscis";
        } else if (((mes.equals("Marzo") && (dia >=21)) || ((mes.equals("Abril") && (dia <=20))))) {
            horoscopo = "Aries";
        } else if (((mes.equals("Abril") && (dia >=21)) || ((mes.equals("Mayo") && (dia <=21))))) {
            horoscopo = "Tauro";
        } else if (((mes.equals("Mayo") && (dia >=22)) || ((mes.equals("Junio") && (dia <=21))))) {
            horoscopo = "Géminis";
        } else if (((mes.equals("Junio") && (dia >=22)) || ((mes.equals("Julio") && (dia <=22))))) {
            horoscopo = "Cáncer";
        } else if (((mes.equals("Julio") && (dia >=23)) || ((mes.equals("Agosto") && (dia <=22))))) {
            horoscopo = "Leo";
        } else if ((mes.equals("Agosto") && (dia >=23)) || ((mes.equals("Septiembre") && (dia <=22)))) {
            horoscopo = "Virgo";
        } else if ((mes.equals("Septiembre") && (dia >=23)) || ((mes.equals("Octubre") && (dia <=22)))) {
            horoscopo = "Libra";
        } else if ((mes.equals("Octubre") && (dia >=23)) || ((mes.equals("Noviembre") && (dia <=22)))) {
            horoscopo = "Escorpio";
        } else if ((mes.equals("Noviembre") && (dia >=23)) || ((mes.equals("Diciembre") && (dia <=21)))) {
            horoscopo = "Sagitario";
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Tu horoscopo es: " + horoscopo);
    }
}