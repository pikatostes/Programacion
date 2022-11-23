import matematicas.Varias;

public class e15 {

    public static void main(String[] args) {

        for(int i = 1; i < 1001; i++) {
            if (Varias.esPrimo(i)) {
                System.out.print(i + "  ");
            }
        }
    }
}