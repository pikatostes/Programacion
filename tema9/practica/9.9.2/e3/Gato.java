 // Clase Gato
 public class Gato extends Mamifero {
     public Gato(String nombre) {
         super(nombre);
     }
     
     // métodos gato
     public void maullar() {
         System.out.println(getNombre() + " está maullando.");
     }
     
     // redefino
     @Override
     public void mover() {
         System.out.println(getNombre() + " se está moviendo con elegancia.");
     }

     @Override
     public void comer() {
         System.out.println(getNombre() + " está comiendo desconfiado.");
     }
 }
 
