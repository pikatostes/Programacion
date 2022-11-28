// Realiza un generador de melodía con las siguientes condiciones:
// a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
// b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
// c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la barra vertical “|” (Alt + 1).
// El final de la melodía se marca con dos barras.
// d) La última nota de la melodía debe coincidir con la primera.

public class e15 {
    public static void main(String[] args){
        System.out.println("---------------------------");
        System.out.println("---GENERADOR DE MELODIAS---");
        System.out.println("---------------------------");
        int numCompases = 2;
        do{
            numCompases = (int)((Math.random()*28)+4);
        } while (numCompases%2 != 0);
        String primera = "";
        for (int i = 0; i < numCompases; i++){
            for (int j = 0; j < 4; j++){
                int numNota = (int)(Math.random()*7);
                String nota = "";
                switch (numNota){
                    case 0:
                        nota = "do";
                        break;
                    case 1:
                        nota = "re";
                        break;
                    case 2:
                        nota = "mi";
                        break;
                    case 3:
                        nota = "fa";
                        break;
                    case 4:
                        nota = "sol";
                        break;
                    case 5:
                        nota = "la";
                        break;
                    case 6:
                        nota = "si";
                        break;
                }
                if ((i == 0) && (j == 0)){
                    primera = nota;
                }
                if ((i == numCompases-1) && (j == 3)){
                    nota = primera;
                }
                System.out.print(nota + " ");
            }
            System.out.print("|");
        }
        System.out.println("|");
    }
}