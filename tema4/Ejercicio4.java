public class Ejercicio4 {
	public static void main (String[] args) {
    int totalSueldo;
    int horasExtra;
    
		System.out.println("-----------------------------");
    System.out.println("-------SALARIO SEMANAL-------");
    System.out.println("-----------------------------");
    System.out.println("¿Cuántas horas has trabajado?");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas <=40){
      totalSueldo = horasTrabajadas*12;
      System.out.println("El salario de esta semana es de " + totalSueldo);
    } 
    else if (horasTrabajadas >40){
      horasExtra = horasTrabajadas-40;
      totalSueldo = 40*12 + horasExtra*16;
      System.out.println("El salario de esta semana es de " + totalSueldo);
    }
	}
}

