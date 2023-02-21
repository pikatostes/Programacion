 // Clase Pinguino
 public class Pinguino extends Ave {
     public Pinguino(String nombre) {
         super(nombre);
     }
 
     public void nadar() {
         System.out.println(getNombre() + " está nadando.");
     }
     
     // redefino
     @Override
     public void mover() {
         System.out.println(getNombre() + " se está desplazando sobre la nieve con habilidad.");
     }
 }