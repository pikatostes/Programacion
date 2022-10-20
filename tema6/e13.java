public class e13 {
    public static void main(String[] args){
        System.out.println("---------------------");
        System.out.println("---TIRADA DE DADOS---");
        System.out.println("---------------------");
        boolean iguales = false;
        while (!iguales){
            int dado1 = (int)(Math.random()*6) + 1;
            int dado2 = (int)(Math.random()*6) + 1;
            System.out.println(dado1 + " " + dado2);
            if (dado1==dado2){
                iguales = true;
            }
        }
        System.out.println();
    }
}