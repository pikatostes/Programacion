public class Gato {
     private String nombre;
     private int edad;
     private String color;
 
     public Gato(String nombre, int edad, String color) {
         this.nombre = nombre;
         this.edad = edad;
         this.color = color;
     }
 
     public String getNombre() {
         return nombre;
     }
 
     public int getEdad() {
         return edad;
     }
 
     public String getColor() {
         return color;
     }
}