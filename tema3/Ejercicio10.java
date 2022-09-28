public class Ejercicio10 {
	public static void main (String[] args) {
		String linea;
		
		System.out.println("----------------------");
		System.out.println("-CONVERSOR DE Mb A Kb-");
		System.out.println("----------------------");
		System.out.println("Introduce una cantidad");
		linea = System.console().readLine();
		int cantidad;
		cantidad = Integer.parseInt( linea );
		
		int res;
		res=cantidad*1000;
		System.out.println(cantidad + " Mb equivalen a " + res);
		
		
	}
}

