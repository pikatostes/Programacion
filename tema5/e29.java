public class e29 {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 0;
        System.out.print("Introduce un número: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce otro numero: ");
        num2 = Integer.parseInt(System.console().readLine());
        boolean ninguno = true;

        System.out.print("Los números positivos menores que "+num1+" no divisibles entre "+num2+" son: ");
        for (int i = 1; i <= num1; i++){
            if (i%num2 != 0){
                ninguno = false;
                System.out.print(i+" ");
            }
        }
        if (ninguno){
            System.out.print("ninguno.");
        }
    }
}