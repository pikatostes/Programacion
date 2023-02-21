// Clase Animal
public class Animal {
     private String nombre;
 
     public Animal(String nombre) {
         this.nombre = nombre;
     }
 
     public String getNombre() {
         return nombre;
     }
     
     // métodos generales
     public void mover() {
         System.out.println(nombre + " se está moviendo.");
     }
 
     public void comer() {
         System.out.println(nombre + " está comiendo.");
     }
 
     public void dormir() {
         System.out.println(nombre + " está durmiendo.");
     }
 }
 
