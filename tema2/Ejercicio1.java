public class Ejercicio1 {
	
	public static void main (String[] args) {
		int x=144;
    int y=999;
    double sum;
    double res;
    double mul;
    double div;
    
    System.out.println("x= " +x + "y= " +y);
    
    sum = (double)x + (double)y;
    System.out.println("La suma es " +sum);
    
    res = (double)y - (double)x;
    System.out.println("La resta es " +res);
    
    mul = (double)x * (double)y;
    System.out.println("La multiplicacion es " +mul);
    
    div = (double)y / (double)x;
    System.out.println("La division es " +div);
	}
}

