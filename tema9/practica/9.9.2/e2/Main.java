import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        // Creación
         Bicicleta bicicleta = new Bicicleta();
         Coche coche = new Coche();
 
         Scanner scanner = new Scanner(System.in);
         int opcion = 0;
        
         // Bucle del menú
         while (opcion != 8) {
             System.out.println("VEHÍCULOS\n==============================================================================");
             System.out.println("1. Anda con la bicicleta                  2. Haz el caballito con la bicicleta");
             System.out.println("3. Anda con el coche                      4. Quema rueda con el coche");
             System.out.println("5. Ver kilometraje de la bicicleta        6. Ver kilometraje del coche");
             System.out.println("7. Ver kilometraje total                  8. Salir");
             System.out.print("Elige una opción (1-8): ");
             opcion = scanner.nextInt();
            
             // swicth para escoger opción
             switch (opcion) {
                 case 1:
                     System.out.print("¿Cuántos kilómetros quieres recorrer? ");
                     int kmBicicleta = scanner.nextInt();
                     bicicleta.recorrer(kmBicicleta);
                     break;
                 case 2:
                     bicicleta.hacerCaballito();
                     break;
                 case 3:
                     System.out.print("¿Cuántos kilómetros quieres recorrer? ");
                     int kmCoche = scanner.nextInt();
                     coche.recorrer(kmCoche);
                     break;
                 case 4:
                    // ejecuta el método e imprime por pantalla
                     coche.quemarRueda();
                     break;
                 case 5:
                     System.out.println("La bicicleta ha recorrido " + bicicleta.getKilometrosRecorridos() + " km.");
                     break;
                 case 6:
                     System.out.println("El coche ha recorrido " + coche.getKilometrosRecorridos() + " km.");
                     break;
                 case 7:
                     System.out.println("Se han recorrido " + Vehiculo.getKilometrosTotales() + " km en total.");
                     break;
                 case 8:
                    System.out.println("Fin del programa");
               }
          }
     }
}
