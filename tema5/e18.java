public class e18 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce otro número diferente: ");
        int num2 = Integer.parseInt(System.console().readLine());
        if (num1 == num2){
            System.out.print("Los números tienen que ser DIFERENTES");
        } else {
            int menor = 0;
            int mayor = 0;
            int i = 0;
            if (num1 < num2){
                menor = num1;
                mayor = num2;
            } else {
                menor = num2;
                mayor = num1;
            }
            for(i = 0; menor < mayor; i++){
                System.out.println(menor);
                menor+= 7;
            }
            System.out.print("El número 7 cabe "+(i-1)+" veces entre el "+num1+" y el "+num2);
        }
    }
}