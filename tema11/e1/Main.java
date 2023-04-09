import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("primos.dat");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i = 2; i <= 500; i++) {
                if (esPrimo(i)) {
                    pw.println(i);
                }
            }

            pw.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo");
        }
    }

    public static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
