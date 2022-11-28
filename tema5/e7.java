public class e7 {
    public static void main(String[] args){
        int intentos=4;
        int claveInt;
        int clave=1111;
        boolean acertado=false;
        do{
            System.out.println("Introduce un número de 4 cifras válido para abrir la caja fuerte");
            claveInt = Integer.parseInt(System.console().readLine());
            if (claveInt == clave){
                acertado=true;
            } else {
                System.out.println("Combinación errónea");
            }
            intentos--;
        } while ((intentos>0) && (!acertado));
        if (acertado){
            System.out.println("Caja fuerte abierta");
        } else {
            System.out.println("Te has quedado sin intentos");
        }
    }
}