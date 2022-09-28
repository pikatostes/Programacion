public class Ejercicio3{
	public static void main (String[] args) {
		System.out.println("Introduce un numero del 1 al 7");
    String linea = System.console().readLine();
    double num = Double.parseDouble( linea );
    
    if (num == 1){
      System.out.println("Lunes");
    }
    if (num == 2){
      System.out.println("Martes");
    }
    if (num == 3){
      System.out.println("Miércoles");
    }
    if (num == 4){
      System.out.println("Jueves");
    }
    if (num == 5){
      System.out.println("Viernes");
    }
    if (num == 6){
      System.out.println("Sábado");
    }
    if (num == 7){
      System.out.println("Domingo");
    }
	}
}

