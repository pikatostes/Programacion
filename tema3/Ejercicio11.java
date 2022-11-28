public class Ejercicio11{
	public static void main (String[] args) {
		String linea;
    
    System.out.println("----------------------");
    System.out.println("-CONVERSOR DE Kb A Mb-");
    System.out.println("----------------------");
    System.out.println("Introduce una cantidad");
    linea = System.console().readLine();
    double cantidad;
    cantidad = Double.parseDouble(linea);
    
    double res;
    res = cantidad/1000.0;
    System.out.println(cantidad + " Kb equivalen a " + res + " Mb");
	}
}

