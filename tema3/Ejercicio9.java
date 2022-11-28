public class Ejercicio9 {
	public static void main (String[] args) {
		String linea;
    double p;
    p=3.14;
    
    System.out.println("--------------------------------------------");
    System.out.println("-------------VOLUMEN DE UN CONO-------------");
    System.out.println("--------------------------------------------");
    
    System.out.println("¿Cuánto mide el radio?");
    linea = System.console().readLine();
    double r;
    r = Double.parseDouble(linea);
    
    System.out.println("¿Cuánto mide la altura?");
    linea = System.console().readLine();
    double h;
    h = Double.parseDouble(linea);
    
    double res;
    res=(p*r*r*h)/3.0;
    System.out.println("El volumen del cono es de " + res);
	}
}

