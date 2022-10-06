public class e6 {
    public static void main(String[] args){
        double t;
        double g=9.81;
        System.out.println("Introduce la altura (expresada en metros)");
        double h = Double.parseDouble(System.console().readLine());

        t=Math.sqrt((2*h)/g);
        //System.out.println("El tiempo que tardará el objeto en caer será de: " + t + "segundos");
        System.out.printf("El tiempo que tardará el objeto en caer será de %.2f \n", t );
    }
}