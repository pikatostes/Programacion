public class Main {
     public static void main(String[] args) {
          Gato[] gatos = new Gato[4];
  
          // introducir datos de los gatos mediante un bucle
          for (int i = 0; i < gatos.length; i++) {
              String nombre = "Gato " + (i+1);
              int edad = i + 1;
              String color = "Negro";
              gatos[i] = new Gato(nombre, edad, color);
          }
  
          // mostrar los datos de todos los gatos utilizando un bucle
          for (Gato gato : gatos) {
              System.out.println("Nombre: " + gato.getNombre() + ", Edad: " + gato.getEdad() + ", Color: " + gato.getColor());
          }
      }
}
 