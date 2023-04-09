import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

     public static void main(String[] args) {
          if (args.length != 2) {
               System.out.println("Uso: ContarOcurrencias <fichero> <palabra>");
               System.exit(1);
          }

          String nombreFichero = args[0];
          String palabra = args[1];

          try {
               BufferedReader lector = new BufferedReader(new FileReader(nombreFichero));
               String linea;
               int contador = 0;

               while ((linea = lector.readLine()) != null) {
                    // Dividir la línea en palabras
                    String[] palabras = linea.split("\\W+");

                    // Buscar la palabra en cada una de las palabras de la línea
                    for (String p : palabras) {
                         if (p.equalsIgnoreCase(palabra)) {
                              contador++;
                         }
                    }
               }

               lector.close();

               System.out.println("La palabra \"" + palabra + "\" aparece " + contador + " veces en el fichero \""
                         + nombreFichero + "\".");

          } catch (IOException e) {
               System.out.println("Error al leer el fichero: " + e.getMessage());
          }
     }
}