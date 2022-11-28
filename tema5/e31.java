public class e31 {
    public static void main(String[] args){
        System.out.print("Introduce la altura de la L: ");
        int h = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < h-1; i++){
            System.out.println("*");
        }
        for (int i = 0; i < ((h/2)+1); i++){
            System.out.print("* ");
        }
    }
}