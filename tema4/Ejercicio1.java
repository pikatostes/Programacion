public class Ejercicio1 {
	public static void main (String[] args) {
    String dia;
    
		System.out.println("-----------------------------");
    System.out.println("------HORARIO DE CLASE-------");
    System.out.println("-----------------------------");
    System.out.println("Introduce un dia de la semana");
    dia = System.console().readLine();
    
    if (dia.equals("lunes")){
      System.out.println("Bases de Datos");
    }
    if (dia.equals("martes")){
      System.out.println("Entornos de Desarrollo");
    }
    if (dia.equals("miercoles")){
      System.out.println("Programacion");
    }
    if (dia.equals("jueves")){
      System.out.println("Entornos de Desarrollo");
    }
    if (dia.equals("viernes")){
      System.out.println("Bases de Datos");
    }
    
	}
}

