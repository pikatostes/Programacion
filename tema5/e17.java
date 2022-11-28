public class e17 {
    public static void main(String[] args){
        System.out.println("---------------------");
        System.out.println("---SUMA DE NÚMEROS---");
        System.out.println("---------------------");

        System.out.println("Introduce un número positivo");
        int num = Integer.parseInt(System.console().readLine());

        if (num < 0){
            System.out.println("Introduce un número POSITIVO");
        } else {
            System.out.println("La suma de los 100 siguientes números a "+num+" y "+num+" es: ");
            int suma = 0;
            for(int i = num; i < (num+100); i++){
                suma += i;
            }
            System.out.println(suma);
        }
    }
}