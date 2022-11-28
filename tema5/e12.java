public class e12 {
    public static void main(String[] args){
        System.out.println("------------------------");
        System.out.println("---SERIE DE FIBONACCI---");
        System.out.println("------------------------");
        System.out.print("Introduce cuantos términos quieres mostrar: ");
        int contador = Integer.parseInt(System.console().readLine());
        int num1 = 0;
        int num2 = 1;
        int totalActual = 0;
        int totalPos = 0;
        int totalAnt = 0;
        System.out.print(num1 + " ");
        totalActual=num1+num2;
        do {
            totalAnt = totalActual;
            totalActual = totalPos;
            totalPos = totalActual + totalAnt;
            System.out.print(totalPos + " ");
            contador--;
        } while (contador > 0);
        System.out.println();
    }
}