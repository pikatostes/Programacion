import java.io.*;

public class LeerNumerosPrimos {
    public static void main(String[] args) {
        try {
            String rutaArchivo = "../e1/primos.dat"; // Ruta completa del archivo
            FileReader fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            while ((linea = br.readLine()) != null) {
                int primo = Integer.parseInt(linea);
                System.out.println(primo);
            }
            
            br.close();
            fr.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo");
        }
    }
}

