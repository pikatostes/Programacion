public class e14 {
    public static void main(String[] args) {
        System.out.println("Piensa en un número del 0 al 100: ");
        int i = 1;
        final int intentos = 5;
        boolean acertado = false;
        int maxim = 100;
        int minim = 0;
        while((i <= intentos)&&(!acertado)){
            int num = (int)(Math.random()*(maxim-minim+1))+minim;
            System.out.println("¿Es el " + num + "?");
            System.out.println("(s) Sí  |  (+) Es mayor  |  (-) Tu número es menor");
            String opcion = "";
            opcion = System.console().readLine().toLowerCase();
            switch(opcion){
                case "s":
                    acertado = true;
                    System.out.println("Facilito");
                    break;
                case "+":
                    minim = num+1;
                    break;
                case "-":
                    maxim = num-1;
                    break;
                default:
                    System.out.println("Caracter erróneo");
                    i--;
                    break;
            }
            if ((minim > maxim) || (maxim < minim)){
                System.out.println("Fullerías ninguna");
                i--;
            }
            i++;
        }
        if (!acertado){
            System.out.println("Good Game");
        }
    }
}