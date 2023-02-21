public class Vehiculo {
    // Declaración de variables
     private static int vehiculosCreados = 0;
     private static int kilometrosTotales = 0;
     private int kilometrosRecorridos = 0;
 
     public Vehiculo() {
         vehiculosCreados++;
     }
     
     // Métodos
     public void recorrer(int km) {
         this.kilometrosRecorridos += km;
         kilometrosTotales += km;
     }
 
     public int getKilometrosRecorridos() {
         return this.kilometrosRecorridos;
     }
 
     public static int getKilometrosTotales() {
         return kilometrosTotales;
     }
 
     public static int getVehiculosCreados() {
         return vehiculosCreados;
     }
 }

 