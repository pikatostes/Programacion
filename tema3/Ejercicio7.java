public class Ejercicio07 {
    public static void main(String[] args) {
        final int IVA = 21;
        String linea;
        System.out.print("Por favor, introduce la base imponible: ");
        linea = System.console().readLine();
        double baseImp = Double.parseDouble(linea);
        double totalFac = ((baseImp*IVA/100)+baseImp);
        System.out.printf("El total sin IVA es: "+baseImp+ "\n");
        System.out.printf("El total con IVA es: "+totalFac+ "\n");
    }
}