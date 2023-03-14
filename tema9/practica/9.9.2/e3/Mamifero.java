 // Clase Mamifero
 public class Mamifero extends Animal {
     public Mamifero(String nombre) {
         super(nombre);
     }
     
     // métodos exclusivos
     public void amamantar() {
         System.out.println(getNombre() + " está amamantando a sus crías.");
     }
     
     // redefino
     @Override
     public void mover() {
         System.out.println(getNombre() + " se está moviendo a cuatro patas.");
     }
 }