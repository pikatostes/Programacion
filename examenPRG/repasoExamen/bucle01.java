public class bucle01 {
    public static void main(String[] args){
        System.out.print("Introduce el número de escalones: ");
        int esc = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce la altura de cada escalon: ");
        int alt = Integer.parseInt(System.console().readLine());

        for(int numAsteriscos=1;numAsteriscos<=esc;numAsteriscos++) {
            for (int i = 0; i < numAsteriscos; i++) {
                System.out.print("****");
            }
            System.out.println();
            if (alt>1){
                for (int i = 0; i<alt; i++){
                    for (int j = 0; j < numAsteriscos; j++) {
                        System.out.print("****");
                    }
                }
            }
            System.out.println("");
        }
    }
}
