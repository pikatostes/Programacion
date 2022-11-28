public class Ejercicio7 {
	public static void main (String[] args) {
		System.out.println("------------------------------");
    System.out.println("---CALCULO DE LA NOTA MEDIA---");
    System.out.println("------------------------------");
    
    System.out.println("Introduce la primera nota");
    int nota1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce la segunda nota");
    int nota2 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce la tercera nota");
    int nota3 = Integer.parseInt(System.console().readLine());
    
    System.out.println("------------------------------");
    int notaMedia = (nota1+nota2+nota3)/3;
    System.out.printf("La nota media de %d, %d y %d es %d", nota1, nota2, nota3, notaMedia);
	}
}

