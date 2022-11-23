public class e62 {
    public static void main(String[] args){
        int[][] num = new int[6][10];
        int fila;
        int columna;
        int mayor = 0;
        int filaMayor = 0;
        int colMayor = 0;
        int menor = 1000;
        int filaMenor = 0;
        int colMenor = 0;

        // Genera el array
        boolean repetido;
        int i;
        int j;

        for(fila = 0; fila < 6; fila++) {
            for(columna = 0; columna < 10; columna++) {
                do {
                    num[fila][columna] = (int)(Math.random() * 1001);
                    // Comprueba si está repetido
                    repetido = false;
                    for (i = 0; i < 10 * fila + columna; i++) {
                        if (num[fila][columna] == num[i / 10][i % 10]) {
                            repetido = true;
                        }
                    }
                    if (num[fila][columna] > mayor){
                        mayor = num[fila][columna];
                        filaMayor = fila;
                        colMayor = columna;
                    }
                    if (num[fila][columna] < menor){
                        menor = num[fila][columna];
                        filaMenor = fila;
                        colMenor = columna;
                    }
                } while (repetido);
            }
        }

        System.out.println();

        // Muestra los datos y las sumas parciales de las filas
        int sumaFila;
        for(fila = 0; fila < 6; fila++) {
            sumaFila = 0;
            for(columna = 0; columna < 10; columna++) {
                if (num[fila][columna] == mayor){
                    System.out.printf("%7d   ", num[fila][columna]);
                } else if (num[fila][columna] == menor){
                    System.out.printf("%7d   ", num[fila][columna]);
                } else System.out.printf("%7d   ", num[fila][columna]);
                sumaFila += num[fila][columna];
            }
            System.out.printf("|%7d\n", sumaFila);
        }

        // Muestra las sumas parciales de las columnas
        for(columna = 0; columna < 6; columna++) {
            System.out.print("----------------");
        }
        System.out.println("------------------");

        int sumaColumna;
        int sumaTotal = 0;
        for(columna = 0; columna < 10; columna++) {
            sumaColumna = 0;
            for(fila = 0; fila < 6; fila++) {
                sumaColumna += num[fila][columna];
            }

            sumaTotal += sumaColumna;
            System.out.printf("%7d   ", sumaColumna);
        }
        System.out.printf("|%7d   ", sumaTotal);
        System.out.println();

        System.out.println("El mayor numero es "+mayor+" que está en la fila "+filaMayor+" y la columna "+colMayor);
        System.out.println("El mayor numero es "+menor+" que está en la fila "+filaMenor+" y la columna "+colMenor);
    }
}