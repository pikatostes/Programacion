public class e11 {
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("---CUADRADO Y CUBO DE UN NÚMERO---");
        System.out.println("----------------------------------");
        System.out.println("Introduce un número");
        double num = Double.parseDouble(System.console().readLine());
        int contador = 1;
        System.out.printf("%15s %15s %15s \n",  "Número", "Cuadrado", "Cubo");
        do{
            double cua = Math.pow(num, 2);
            double cubo = Math.pow(num, 2);
            System.out.printf("%15f %15f %15f \n", num, cua, cubo);
            num++;
            contador++;
        }while (contador < 6);
    }
}
