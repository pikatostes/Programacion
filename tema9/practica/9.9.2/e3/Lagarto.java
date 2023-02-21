 // Clase Lagarto
 public class Lagarto extends Animal {
     public Lagarto(String nombre) {
         super(nombre);
     }
     
     // métodos lagarto
     public void trepar() {
         System.out.println(getNombre() + " está trepando por la pared.");
     }
     
     // redefino
     @Override
     public void mover() {
         System.out.println(getNombre() + " se está arrastrando por el suelo.");
     }

     @Override
     public void comer() {
         System.out.println(getNombre() + " está comiéndose a otro lagarto.");
     }
 }