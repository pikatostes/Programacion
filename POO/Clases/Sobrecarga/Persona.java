
public class Persona {
     // atributos
     String nombre;
     int edad;
     String dni;
     
    // metodo
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    
    public void correr() {
        System.out.println("Soy " +nombre+ " tengo " +edad+" y estoy corriendo un maratón");
    }
    
    public void correr(int km) {
        System.out.println("He corrido " +km+ " kilómetros");
    }
}
