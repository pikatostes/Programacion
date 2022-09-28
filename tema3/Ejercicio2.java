public class Ejercicio2 {
	
	public static void main (String[] args) {
		String linea;
    
    System.out.println("Conversor de Euros a Pesetas");
    System.out.println("----------------------------");
    System.out.println("Introduzca un numero");
    linea = System.console().readLine();
    int x;
    x =Integer.parseInt(linea);
    
    int res;
    res= x*166;
    
    System.out.println("----------------------------");
    System.out.println(x + " euros son " + res + " en pesetas");
	}
}

