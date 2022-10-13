public class e14 {
    public static void main(String[] args){
        System.out.println("------------------------------");
        System.out.println("---CALCULADORA DE POTENCIAS---");
        System.out.println("------------------------------");
        System.out.println("Introduzca la base");
        double base = Double.parseDouble(System.console().readLine());
        System.out.println("Introduzca el exponente");
        double expo = Double.parseDouble(System.console().readLine());

        double res = Math.pow(base, expo);
        System.out.println("El resultado de " + base + "" + expo + " es igual a " + res);
    }
}