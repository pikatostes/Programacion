public class e20 {
    public static void main(String[] args) {
        int num;
        boolean capicuo = false;

        System.out.println("Introduce un número entero de un máximo de 5 cifras");
        num = Integer.parseInt(System.console().readLine());

        if (num < 10) {
            capicuo = true;
        }
        if ((num >= 10) && (num < 100)) {
            if ((num / 10) == (num % 10)) {
                capicuo = true;
            }
        }
        if ((num >= 100) && (num < 1000)) {
            if ((num / 100) == (num % 10)) {
                capicuo = true;
            }
        }
        if ((num >= 1000) && (num < 10000)) {
            if (((num / 1000) == (num % 10)) && ((( num / 100 ) % 10)== (( num / 10) % 10))) {
                capicuo = true;
            }
        }
        if (num >= 10000) {
            if (((num / 10000) == (num % 10) ) && ((((num / 1000) % 10)) == ((num / 10) % 10))) {
                capicuo = true;
            }
        }

        if (capicuo) {
            System.out.println("El número introducido es capicúo.");
        } else {
            System.out.println("El número introducido no es capicúo.");
        }
    }
}