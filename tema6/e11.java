public class e11 {
    public static void main(String[] args){
        int contadorSuspensos = 0;
        int contadorSuficiente = 0;
        int contadorBien = 0;
        int contadorNotable = 0;
        int contadorSobresaliente = 0;

        for (int i = 0; i <= 19; i++) {
            int nota = (int) (Math.random() * 5);
            switch (nota) {
                case 0:
                    System.out.print(" suspenso ");
                    contadorSuspensos++;
                    break;
                case 1:
                    System.out.print(" suficiente ");
                    contadorSuficiente++;
                    break;
                case 2:
                    System.out.print(" bien ");
                    contadorBien++;
                    break;
                case 3:
                    System.out.print(" notable ");
                    contadorNotable++;
                    break;
                case 4:
                    System.out.print(" sobresaliente ");
                    contadorSobresaliente++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(contadorSuspensos + " suspenos");
        System.out.println(contadorSuficiente + " suficientes");
        System.out.println(contadorBien + " bien");
        System.out.println(contadorNotable + " notables");
        System.out.println(contadorSobresaliente + "sobresaliente");
    }
}