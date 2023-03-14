 public class Main {
     public static void main(String[] args) {
         Gato[] gatos = new Gato[4];
 
         // introducir datos de los gatos directamente en el código o mediante el constructor
         gatos[0] = new Gato("Tom", "gris", "macho");
         gatos[1] = new Gato("Mimi", "blanco y negro", "hembra");
         gatos[2] = new Gato("Gatito", "marrón", "hembra");
         gatos[3] = new Gato("Garfield", "naranja", "macho");
 
         // mostrar los datos de todos los gatos utilizando un bucle
         for (Gato gato : gatos) {
             System.out.println("Nombre: " + gato.getNombre() + ", Color: " + gato.getColor() + ", Género: " + gato.getGenero());
         }
     }
 }
 