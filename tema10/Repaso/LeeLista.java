import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LeeLista {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        leeLista(l);
        System.out.println(l);
    }

    public static void leeLista(List<Integer> lista) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num != -1) {
            num = sc.nextInt();
            if (num != -1) {
                lista.add(num);
            }
        }
    }
}
