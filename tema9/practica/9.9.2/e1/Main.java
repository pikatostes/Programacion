public class Main {
     public static void main(String[] args) {
         Caballo caballo1 = new Caballo("Pegaso", 5, "blanco"); // Crea una instancia de Caballo
         Caballo caballo2 = new Caballo("Centella", 3, "marrón"); // Crea otra instancia de Caballo
 
         caballo1.relinchar(); // Llama al método relinchar de la instancia caballo1
         caballo1.galopar(); // Llama al método galopar de la instancia caballo1
         caballo1.comer(); // Llama al método comer de la instancia caballo1
 
         caballo2.relinchar(); // Llama al método relinchar de la instancia caballo2
         caballo2.galopar(); // Llama al método galopar de la instancia caballo2
         caballo2.comer(); // Llama al método comer de la instancia caballo2
     }
 }
 