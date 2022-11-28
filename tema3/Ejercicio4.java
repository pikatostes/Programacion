public class Ejercicio4 {
	
	public static void main (String[] args) {
		String linea;
    
    System.out.println("-------------------------------");
    System.out.println("----------CALCULADORA----------");
    System.out.println("-------------------------------");
    System.out.println("Por favor introduce un numero: ");
    linea = System.console().readLine();
    int num1;
    num1 = Integer.parseInt(linea);
    
    System.out.println("Por favor introduce un segundo numero: ");
    linea = System.console().readLine();
    int num2;
    num2 = Integer.parseInt(linea);
    
    int sum;
    int res;
    int mul;
    int div;
    
    sum=num1+num2;
    System.out.println(num1 + " + " + num2 + " = " + sum );
    
    res=num1-num2;
    System.out.println(num1 + " - " + num2 + " = " + res );
    
    mul=num1*num2;
    System.out.println(num1 + " * " + num2 + " = " + mul );
    
    div=num1/num2;
    System.out.println(num1 + " / " + num2 + " = " + div );
	}
}

