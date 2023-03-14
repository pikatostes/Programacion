public class Persona {
     // constante - declaracion
     private final String nombre;
     private int edad;

     // constructor
     public Persona(String nombre, int edad) {
          this.nombre = nombre;
          this.edad = edad;
     }

     public void mostrarDatos() {
          System.out.println("El nombre es: "+nombre);
          System.out.println("La edad es: "+edad);
     }

     public int getEdad() {
          return edad;
     }
     public void setEdad(int edad) {
          this.edad = edad;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }
}
