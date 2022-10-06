public class e10 {
    public static void main(String[] args) {
        int nota = 0;
        int media = 0;
        int contador = 0;
        
        System.out.println("-------------------------------");
        System.out.println("---CALCULADORA MEDIA NUMEROS---");
        System.out.println("-------------------------------");
        System.out.println("Introduce un conjunto de numeros para calcular la media. Se dejaran de pedir nú-meros cuando introduzcas un número negativo.");

        do{
            nota = Integer.parseInt(System.console().readLine());
            media = media+nota;
            contador++;
        } while (nota>0);
        double res = (media-nota) / (contador-1);
        System.out.println("La media de los números introducidos es " + res);
    }
}
