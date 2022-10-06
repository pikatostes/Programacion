public class e11 {
    public static void main(String[] args) {
        int res = 0;
        
        System.out.println("----------------------------------");
        System.out.println("---CUADRADO Y CUBO DE UN NÚMERO---");
        System.out.println("----------------------------------");
        System.out.println("Introduce un número");
        int num = Integer.parseInt(System.console().readLine());

        do{
            System.out.println(res= num*num);
            num++;
        }while (num<=num+5);
    }
}
