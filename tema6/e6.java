public class e6 {
    public static void main(String[] args){
        int combinacion = (int)(Math.random()*100)+1;
        int num = -1;
        if (num != combinacion){
            for (int intentos = 1; intentos <= 5; intentos++){
                System.out.println("Total intentos: " + intentos);
                System.out.print("Introduzca un número del 0 al 100: ");
                num = Integer.parseInt(System.console().readLine());
                if (num == combinacion){
                    System.out.println("Combinación correcta");
                    intentos = 5;
                }
                if (num > combinacion){
                    System.out.println("El número introducido es mayor a la combinación");
                    System.out.println("-----------------------------------------------");
                }
                if (num < combinacion){
                    System.out.println("El número introducido es menor a la combinación");
                    System.out.println("-----------------------------------------------");
                }
            }
        }
        System.out.println("La combinación era " + combinacion);
    }
}