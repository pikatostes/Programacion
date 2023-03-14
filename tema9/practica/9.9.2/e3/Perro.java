 // Clase Perro
 public class Perro extends Mamifero {
     public Perro(String nombre) {
         super(nombre);
     }
     
     // método exclusivo
     public void ladrar() {
         System.out.println(getNombre() + " está ladrando.");
     }
     
     //redefino
     @Override
     public void mover() {
         System.out.println(getNombre() + " se está moviendo a cuatro patas con energía.");
     }

     @Override
     public void comer() {
         System.out.println(getNombre() + " está comiendo con costillas.");
     }
 }
 
