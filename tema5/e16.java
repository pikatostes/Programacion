public class e16 {
    public static void main(String[] args){
        System.out.println("--------------------");
        System.out.println("---NÚMEROS PRIMOS---");
        System.out.println("--------------------");

        System.out.println("Introduce un número");
        int num = Integer.parseInt(System.console().readLine());
        boolean primo = true;

        for (int i = 2; i < num; i++){
            if ((num%i) == 0){
                primo = false;
            } else {
                primo = true;
            }
        }
        System.out.print("El número introducido ");
        if (primo == true){
            System.out.println("es primo.");
        } else {
            System.out.println("no es primo.");
        }
    }
}