public class Ejercicio3 {
	
	public static void main (String[] args) {
		String linea;
    double factor;
    factor=0.0060;
    
    System.out.println("----------------------------");
    System.out.println("Conversor de pesetas a euros");
    System.out.println("----------------------------");
    System.out.println("Introduzca un numero");
    linea = System.console().readLine();
    int pesetas;
    pesetas= Integer.parseInt(linea);
    
    double res;
    res=pesetas*factor;
    System.out.println(res);
	}
}

