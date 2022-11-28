// Calculo nota final

public class Ejercicio3 {
    public static void main(String[] args){
        int contadorSuspensos = 0;
        double[] nota = new double[7];
        double media = 0;
        double notaFinal = 0;

        for (int i = 0; i<7; i++){
            do {
                System.out.print("Introduce las notas de los 7 examenes: ");
                nota[i] = Double.parseDouble(System.console().readLine());
            } while ((nota[i]<0) || (nota[i]>11));

            media = media+nota[i];
            if (nota[i] < 5){
                contadorSuspensos++;
            }
        }
        if (contadorSuspensos <2){
            notaFinal = media/7;
            System.out.println("Tu nota media es "+notaFinal);
        } else System.out.println("Al haber suspendido 2 o mas examenes, tu nota es un 4");
    }
}
