/*Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).*/

public class e3 {
    public static void main(String[] args){
        int[][] num = new int[4][5];

        int fila;
        int columna;

        // Lee los datos de teclado
        for(fila = 0; fila < 4; fila++) {
            for(columna = 0; columna < 5; columna++) {
                num[fila][columna] = (int)(Math.random()*900+100);
            }
        }

        System.out.println();

        // Muestra los datos y las sumas parciales de las filas
        int sumaFila;
        for(fila = 0; fila < 4; fila++) {
            sumaFila = 0;
            for(columna = 0; columna < 5; columna++) {
                System.out.printf("%7d   ", num[fila][columna]);
                sumaFila += num[fila][columna];
            }
            System.out.printf("|%7d\n", sumaFila);
        }

        // Muestra las sumas parciales de las columnas
        for(columna = 0; columna < 5; columna++) {
            System.out.print("----------");
        }
        System.out.println("-----------");

        int sumaColumna;
        int sumaTotal = 0;
        for(columna = 0; columna < 5; columna++) {
            sumaColumna = 0;
            for(fila = 0; fila < 4; fila++) {
                sumaColumna += num[fila][columna];
            }

            sumaTotal += sumaColumna;
            System.out.printf("%7d   ", sumaColumna);
        }
        System.out.printf("|%7d   ", sumaTotal);
        System.out.println();
    }
}