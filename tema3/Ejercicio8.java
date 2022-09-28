public class Ejercicio8 {
	public static void main (String[] args) {
		String linea;
    
    System.out.println("-----------------------------------------");
    System.out.println("-------------SALARIO SEMANAL-------------");
    System.out.println("-----------------------------------------");
    
    System.out.println("¿Cuántas horas has trabajado esta semana?");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt(linea);
    
    int res;
    res=base*12;
    System.out.println("Tu salario de esta semana es de " + res);
	}
}

