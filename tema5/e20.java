public class e20 {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("---PIRAMIDE---");
        System.out.println("--------------");

        System.out.println("Introduce la altura");
        int h = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce la caracter");
        String car = System.console().readLine();

        for (int fil = 0; fil < h-1; ++fil) {
            for (int col = 0; col < h-fil-1; ++col) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2*fil+1; ++col) {
                if ((col == 0) || (col == 2*fil)){
                    System.out.print(car);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int col = 0; col < 2*h-1; ++col) {
            System.out.print(car);
        }
    }
}