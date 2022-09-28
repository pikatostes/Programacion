public class Ejercicio5 {
	
	public static void main (String[] args) {
    String linea;
    
    System.out.println("-----------------------------------------");
    System.out.println("----------AREA DE UN RECTANGULO----------");
    System.out.println("-----------------------------------------");
    
    System.out.println("Introduce la base");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt(linea);
    
    System.out.println("Introduce la altura");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt(linea);
    
    int area;
    area=base*altura;
    System.out.println("El area del rectangulo es de " + area);
	}
}

