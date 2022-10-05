public class e21 {
    public static void main(String[] args){
        System.out.println("-----------------------------------");
        System.out.println("-------------NOTA MEDIA------------");
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("Introduce la nota del primer examen");
        Double nota1 = Double.parseDouble(System.console().readLine());

        System.out.println("Introduce la nota del segundo examen");
        Double nota2 = Double.parseDouble(System.console().readLine());

        Double notaFinal = (nota1 + nota2)/2;
        if (notaFinal<5){
            System.out.println("Tu nota media es inferior a 5");
            System.out.println("¿Cuál ha sido tu resultado en la recuperación? (apto/no apto)");
            String resRec = System.console().readLine();
            if (resRec.equals("apto")){
                notaFinal = 5.0;
            }
        }
        System.out.println("Tu nota en programación es un " + notaFinal);
    }
}