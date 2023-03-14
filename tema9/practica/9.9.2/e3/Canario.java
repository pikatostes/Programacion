 // Clase Canario
 public class Canario extends Ave {
     public Canario(String nombre) {
         super(nombre);
     }
     
     // métodos exclusivos de canario
     public void cantar() {
         System.out.println(getNombre() + " está cantando.");
     }
     
     // redefino
     @Override
     public void mover() {
         System.out.println(getNombre() + " se está moviendo a dos patas con agilidad.");
     }
 }