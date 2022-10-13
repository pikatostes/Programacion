public class e12 {
    public static void main(String[] args){
        System.out.println("------------------------");
        System.out.println("---SERIE DE FIBONACCI---");
        System.out.println("------------------------");
        System.out.println("Introduce cuantos términos quieres mostrar");
        int contador = Integer.parseInt(System.console().readLine());
        int num = 0;

        do {
            System.out.println(num);
            num=num+num;
            contador--;
        } while (contador > 0);
    }
}