public class Ejercicio13 {
	
	public static void main (String[] args) {
		System.out.println("----------------------------------");
    System.out.println("---------CALCULAR LA NOTA---------");
    System.out.println("----------------------------------");
    System.out.println("Introduce la nota del primer examen");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("¿Qué nota quieres sacar?");
    double notaFinal = Double.parseDouble(System.console().readLine());
    
    double nota2 = ((notaFinal * 100) - (nota1 * 40))/60;
    
    System.out.println("Para tener un " + notaFinal + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen");
	}
}

