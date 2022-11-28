// Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
// El carácter con el que se pinta cada línea se elige de forma aleatoria nentre uno de los siguientes: *, -, =, ., |, @.
// Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.

public class e10 {
    public static void main(String[] args) {
        System.out.println("Pinta por pantalla diez líneas formadas por caracteres de longitud aleatoria ente 1 y 40:");
        final int lineas = 10;
        for (int i = 0; i < lineas; i++){
            int longitud = (int)(Math.random()*40)+1;
            for (int j = 0; j < longitud; j++){
                int c = (int)(Math.random()*6);
                switch (c){
                    case 0:
                        System.out.print("*");
                        break;
                    case 1:
                        System.out.print("-");
                        break;
                    case 2:
                        System.out.print("=");
                        break;
                    case 3:
                        System.out.print(".");
                        break;
                    case 4:
                        System.out.print("|");
                        break;
                    case 5:
                        System.out.print("@");
                        break;
                }
            }
            System.out.println();
        }
    }
}
