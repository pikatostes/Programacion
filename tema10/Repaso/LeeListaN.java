import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LeeListaN {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        leeListaN(l, 10);
        System.out.println(l);
    }

    public static void leeListaN(List<Integer> lista, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            lista.add(num);
        }
    }
}
