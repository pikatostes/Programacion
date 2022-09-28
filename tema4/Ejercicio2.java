public class Ejercicio2 {
	public static void main (String[] args) {
		System.out.println("Introduce una hora");
    String linea = System.console().readLine();
    int hora;
    hora = Integer.parseInt(linea);
    if ((hora <=6)||(hora <=12)){
      System.out.println("Buenos dias");
    }
    if ((hora >=13)||(hora <=20)){
      System.out.println("Buenos tardes");
    }
    if ((hora >=21)||(hora <=24)||(hora <=5)){
      System.out.println("Buenos noches");
    }
    
	}
}

