// Escalera

public class Ejercicio5b {
    public static void main(String[] args){
        int numAst = 1;
        System.out.print("Introduce el numero de escalones: ");
        int numEscalones = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce la altura de cada escalon: ");
        int altEscalones = Integer.parseInt(System.console().readLine());

        for (int i = 0; i<numEscalones; i++){
            for (int k = 0; k<altEscalones; k++){
                System.out.println();
                for (int j = 0; j<numAst; j++) {
                    System.out.print("****");
                }
            }
            numAst++;
        }
        System.out.println();
    }
}
