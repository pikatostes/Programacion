// Clase Ave
public class Ave extends Animal {
     public Ave(String nombre) {
         super(nombre);
     }
     
     // métodos exclusivos
     public void volar() {
         System.out.println(getNombre() + " está volando.");
     }
     
     // redefino
     @Override
     public void mover() {
         System.out.println(getNombre() + " se está moviendo a dos patas.");
     }
     @Override
     public void comer() {
         System.out.println(getNombre() + " está comiendo gusanos.");
     }
 }
