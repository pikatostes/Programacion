import java.io.*;

public class Main {
     public static void main(String[] args) {
          if (args.length != 2) {
               System.out.println("Uso: quita_comentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO");
               return;
          }

          String archivoOriginal = args[0];
          String archivoLimpio = args[1];

          try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
                    PrintWriter pw = new PrintWriter(new FileWriter(archivoLimpio))) {

               boolean comentario = false;
               String linea;

               while ((linea = br.readLine()) != null) {
                    linea = linea.trim();

                    if (linea.startsWith("/*")) {
                         comentario = true;
                    }

                    if (!comentario) {
                         int indice = linea.indexOf("//");

                         if (indice != -1) {
                              linea = linea.substring(0, indice);
                         }

                         pw.println(linea);
                    }

                    if (linea.endsWith("*/")) {
                         comentario = false;
                    }
               }

          } catch (IOException e) {
               System.out.println("Error: " + e.getMessage());
          }
     }
}