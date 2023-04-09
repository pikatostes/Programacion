package e4;

import java.io.*;
import java.util.*;

public class Main {

     public static void main(String[] args) {
          if (args.length != 1) {
               System.out.println("Debe especificar el nombre del archivo como argumento");
               return;
          }

          String nombreArchivo = args[0];
          String nombreArchivoOrdenado = nombreArchivo.replace(".txt", "_sort.txt");

          ArrayList<String> palabras = new ArrayList<>();

          try {
               BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
               String linea;

               while ((linea = lector.readLine()) != null) {
                    palabras.add(linea);
               }

               lector.close();

               Collections.sort(palabras);

               BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivoOrdenado));

               for (String palabra : palabras) {
                    escritor.write(palabra);
                    escritor.newLine();
               }

               escritor.close();

               System.out.println(
                         "El archivo ha sido ordenado alfabéticamente y guardado como " + nombreArchivoOrdenado);

          } catch (IOException e) {
               System.out.println("Ha ocurrido un error al leer o escribir el archivo");
               e.printStackTrace();
          }
     }
}