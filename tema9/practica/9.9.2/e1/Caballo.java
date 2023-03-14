public class Caballo {
     // Atributos
     private String nombre;
     private int edad;
     private String color;
 
     // Constructor
     public Caballo(String nombre, int edad, String color) {
         this.nombre = nombre;
         this.edad = edad;
         this.color = color;
     }
 
     // Métodos
     public void relinchar() {
         System.out.println("El caballo " + nombre + " está relinchando.");
     }
 
     public void galopar() {
         System.out.println("El caballo " + nombre + " está galopando.");
     }
 
     public void comer() {
         System.out.println("El caballo " + nombre + " está comiendo.");
     }
 
