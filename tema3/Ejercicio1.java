public class Ejercicio1 {
	
	public static void main (String[] args) {
		String linea;
    
    System.out.println("Por favor introduce un numero: ");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt(linea);
    
    System.out.println("Por favor introduce un segundo numero: ");
    linea = System.console().readLine();
    int y;
    y = Integer.parseInt(linea);
    
    int res;
    res=x*y;
    
    System.out.println("El resultado de la multiplicacion es: " + res);
	}
}

