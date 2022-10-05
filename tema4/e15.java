public class e15 {
    public static void main(String[] args) {
        System.out.println("Introduce un caracter");
        String x = System.console().readLine();
        System.out.println("Escoge una orientacion");
        System.out.println("1. Vertice hacia arriba");
        System.out.println("2. Vertice hacia abajo");
        System.out.println("3. Vertice hacia la izquierda");
        System.out.println("4. Vertice hacia la derecha");
        int numero = Integer.parseInt(System.console().readLine());

        switch (numero){
            case 1:
                System.out.println("    " + x);
                System.out.println("   " + x+x);
                System.out.println("  " + x+x+x);
                System.out.println(" " + x+x+x+x);
                System.out.println(x+x+x+x+x);
                break;
            case 2:
                System.out.println(x+x+x+x+x);
                System.out.println( x+x+x+x);
                System.out.println(  x+x+x);
                System.out.println(   x+x);
                System.out.println(    x);
                break;
            case 3:
                System.out.println(x);
                System.out.println(x+x);
                System.out.println(x+x+x);
                System.out.println(x+x+x+x);
                System.out.println(x+x+x);
                System.out.println(x+x);
                System.out.println(x);
                break;
            case 4:
                System.out.println(      x);
                System.out.println(    x+x);
                System.out.println(  x+x+x);
                System.out.println(x+x+x+x);
                System.out.println(  x+x+x);
                System.out.println(    x+x);
                System.out.println(      x);
        }

    }
}