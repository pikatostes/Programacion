public class e16 {
    public static void main(String[] args) {
        int contadorCorazon = 0;
        int contadorDiamante = 0;
        int contadorHerradura = 0;
        int contadorCampana = 0;
        int contadorLimon = 0;

        for (int i = 0; i < 3; i++) {
            int numFig = (int) (Math.random() * 5);
            switch (numFig) {
                case 0:
                    System.out.print("corazón ");
                    contadorCorazon++;
                    break;
                case 1:
                    System.out.print("diamante ");
                    contadorDiamante++;
                    break;
                case 2:
                    System.out.print("herradura ");
                    contadorHerradura++;
                    break;
                case 3:
                    System.out.print("campana ");
                    contadorCampana++;
                    break;
                case 4:
                    System.out.print("limón ");
                    contadorLimon++;
                    break;
                default:
                    break;
            }
        }
        System.out.println();
        if ((contadorCorazon == 2) || (contadorCampana == 2) || (contadorDiamante == 2) || (contadorLimon == 2) || (contadorHerradura == 2)) {
            System.out.println("Bien,ha recuperado su moneda");
        }
        if ((contadorCorazon == 3) || (contadorCampana == 3) || (contadorDiamante == 3) || (contadorLimon == 3) || (contadorHerradura == 3)) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        }
    }
}