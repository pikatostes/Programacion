import java.io.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Debe indicar los nombres de los dos ficheros origen y el fichero destino");
            System.exit(1);
        }
        
        String ficheroOrigen1 = args[0];
        String ficheroOrigen2 = args[1];
        String ficheroDestino = args[2];
        
        try {
            FileReader fr1 = new FileReader(ficheroOrigen1);
            BufferedReader br1 = new BufferedReader(fr1);
            FileReader fr2 = new FileReader(ficheroOrigen2);
            BufferedReader br2 = new BufferedReader(fr2);
            FileWriter fw = new FileWriter(ficheroDestino);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            String linea1 = br1.readLine();
            String linea2 = br2.readLine();
            
            while (linea1 != null || linea2 != null) {
                if (linea1 != null) {
                    pw.println(linea1);
                    linea1 = br1.readLine();
                }
                if (linea2 != null) {
                    pw.println(linea2);
                    linea2 = br2.readLine();
                }
            }
            
            pw.close();
            bw.close();
            fw.close();
            br2.close();
            fr2.close();
            br1.close();
            fr1.close();
        } catch (IOException e) {
            System.err.println("Error al mezclar los ficheros");
        }
    }
}