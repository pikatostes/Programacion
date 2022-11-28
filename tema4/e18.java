public class e18 {
    public static void main(String[] args){
        int num;
        int cifra1 = 0;

        System.out.println("Introduce un número entero positivo de un máximo de 5 cifras");
        num = Integer.parseInt(System.console().readLine());

        if (num < 10){
            cifra1 = num;
        }
        if ((num>=10) && (num<100)){
            cifra1 = num / 10;
        }
        if ((num>=100) && (num<1000)){
            cifra1 = num / 100;
        }
        if ((num>=1000) && (num<10000)){
            cifra1 = num / 1000;
        }
        if ((num >=10000) && (num <99999)){
            cifra1 = num / 10000;
        }
        System.out.println("La primera cifra de " + num + " es " + cifra1);
    }
}