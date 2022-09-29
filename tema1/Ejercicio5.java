public class Ejercicio5 {
	public static void main (String[] args) {
	String r = "\033[31m";
    String v = "\033[32m";
    String n = "\033[33m";
    String a = "\033[34m";
    String m = "\033[35m";
    String c = "\033[36m";
    String b = "\033[37m";
    
    System.out.println("Hora      Lunes      Martes      Miercoles      Jueves      Viernes");
    System.out.println("-----------------------------------------");
    System.out.printf("%s      %-15s      %-15s      %-15s      %-15s      %-8s\n",  b+"08.00", v+"BBDD", "EEDD", b+"Programacion", b+"Programacion", v+"BBDD");
    System.out.printf("%s      %-15s      %-15s      %-15s      %-15s      %-8s\n",  b+"09.00", v+"BBDD", "EEDD", b+"Programacion", b+"Programacion", v+"BBDD");
    System.out.printf("%s      %-15s      %-15s      %-15s      %-15s      %-8s\n",  b+"10.00", m+"Inglés", b+"Programacion", b+"Programacion", "Prog", n+"SSII");
    System.out.printf("%s      %-15s      %-15s      %-15s      %-15s      %-8s\n",  b+"11.30", a+"FOL", r+"Lenguaje", m+"Inglés", b+"Programacion", n+"SSII");
    System.out.printf("%s      %-15s      %-15s      %-15s      %-15s      %-8s\n",  b+"12.30", a+"FOL", r+"Lenguaje", n+"SSII", n+"SSII", r+"Lenguaje");
    System.out.printf("%s      %-15s      %-15s      %-15s      %-15s      %-8s\n",  b+"13.30", a+"FOL", r+"Lenguaje", n+"SSII", n+"SSII", r+"Lenguaje");
	}
}

