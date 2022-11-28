public class aleatorio01 {
    public static void main(String[] args){
        int contador = 0;
        System.out.print("Introduce la longitud del sendero: ");
        int lon = Integer.parseInt(System.console().readLine());

        for (int i = 0; i<lon; i++){
            int camino = (int)(Math.random()*9);
            int espacio = (int)(Math.random()*2);
            switch (espacio){
                case 0:
                    System.out.print(" ");
                    contador++;
                break;
                case 1:
                    break;
            }
            if (contador>0){
                espacio = (int)(Math.random()*2);
                switch (espacio){
                    case 0:
                        System.out.print(" ");
                        contador++;
                        break;
                    case 1:
                        break;
                }
            }
            switch (camino){
                case 0:
                    System.out.println("    |0   |");
                    break;
                case 1:
                    System.out.println("    | 0  |");
                    break;
                case 2:
                    System.out.println("    |  0 |");
                    break;
                case 3:
                    System.out.println("    |   0|");
                    break;
                case 4:
                    System.out.println("    |$   |");
                    break;
                case 5:
                    System.out.println("    | $  |");
                    break;
                case 6:
                    System.out.println("    |  $ |");
                    break;
                case 7:
                    System.out.println("    |   $|");
                    break;
                case 8:
                    System.out.println("    |    |");
                    break;
            }
        }
    }
}
