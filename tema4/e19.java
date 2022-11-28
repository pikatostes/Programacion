public class e19 {
    public static void main(String[] args){
        int num;
        int digitos = 0;

        System.out.println("Introduce un número entero, positivo o negativo, de un máximo de 5 cifras");
        num = Integer.parseInt(System.console().readLine());

        if (num < 10){
            digitos = 1;
        }
        if ((num>=10) && (num<100)){
            digitos = 2;
        }
        if ((num>=100) && (num<1000)){
            digitos = 3;
        }
        if ((num>=1000) && (num<10000)){
            digitos = 4;
        }
        if ((num >=10000) && (num <99999)){
            digitos = 5;
        }
        System.out.println("El número " + num + " tiene un total de " + digitos + " digitos");
    }
}