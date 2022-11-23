public class e10 {
    public static void main(String[] args) {
        System.out.println("Tres en raya");
        System.out.println("------------");

        int[][] tabla = new int[3][3];
        int fila;
        int col;

        for(fila = 0; fila < 3; fila++) {
            for(col = 0; col < 3; col++) {
                tabla[fila][col] = 0;
                System.out.print(tabla[fila][col]+"     ");
            }
            System.out.println();
            System.out.println();
        }

        do {
            System.out.print("Introduce la fila: ");
            fila = Integer.parseInt(System.console().readLine());

            System.out.print("Introduce la columna: ");
            col = Integer.parseInt(System.console().readLine());

            tabla[fila][col] = 1;

            for(fila = 0; fila < 3; fila++) {
                for(col = 0; col < 3; col++) {
                    System.out.print(tabla[fila][col]+"     ");
                }
                System.out.println();
                System.out.println();
            }

        } while (col > 0);
    }
}