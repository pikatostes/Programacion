//Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma total (los puntos que suman entre los tres dados).
public class e1 {
    public static void main(String[] args){
        System.out.println("---------------------");
        System.out.println("---TIRADA DE DADOS---");
        System.out.println("---------------------");
        int suma = 0;
        for (int i = 1; i <= 3; i++) {
            int dado = (int)(Math.random()*6) + 1;
            switch (dado){
                case 1:
                    System.out.print("1");
                    suma += dado;
                    break;
                case 2:
                    System.out.print("2");
                    suma += dado;
                    break;
                case 3:
                    System.out.print("3");
                    suma += dado;
                    break;
                case 4:
                    System.out.print("4");
                    suma += dado;
                    break;
                case 5:
                    System.out.print("5");
                    suma += dado;
                    break;
                case 6:
                    System.out.print("6");
                    suma += dado;
                    break;
                default:
                break;
            }
            System.out.print("\t");
        }
        System.out.println("Suma = " + suma);

        System.out.println();
    }
}