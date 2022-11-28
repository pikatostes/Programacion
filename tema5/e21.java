public class e21 {
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("---EJERCICIO 21---");
        System.out.println("------------------");
        int contador = 0;
        int contadorImpares = 0;
        double media = 0;
        double acumuladorImpares = 0;
        double mayor = 0;

        for (int num = 0; num >= 0;){
            System.out.println("Introduce un número");
            num = Integer.parseInt(System.console().readLine());
            if (num > 0){
                contador++;
            }
            if ((num % 2 != 0) && (num > 0)){
                contadorImpares++;
                acumuladorImpares = acumuladorImpares+num;
            } else{
                if (num > mayor){
                    mayor = num;
                }
            }
        }
        media = acumuladorImpares/contadorImpares;
        System.out.println("Se han introducido " + contador + " números");
        System.out.println("La media de los números impares ha sido " + media);
        System.out.println("El mayor numero par ha sido " + mayor);
    }
}