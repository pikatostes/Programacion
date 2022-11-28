public class Ejercicio12 {
    public static void  main (String[] args){
        double base;
        String iva;
        String linea;
        double total;

        System.out.println("---------------------------------");
        System.out.println("---PRECIO FINAL DE UN PRODUCTO---");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("Introduce la base imponible");
        linea = System.console().readLine();
        double base;
        base = Double.parseDouble(base);

        System.out.println("Introduce el tipo de IVA (21%, 10%, 4%)");
        iva = System.console.readLine();
        System.out.println(iva);

        if (iva.equals("21%")){
            total=base+base*0.21;
        }
    }
}

