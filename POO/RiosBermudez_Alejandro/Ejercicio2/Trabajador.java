public class Trabajador {
     private String nombre;
     private int edad;
     public static int cat;
     public static int ant;
     private double sueldo;

     // constructor
    public Trabajador(String nombre, int edad, int cat, int ant) {
        this.nombre = nombre;
        this.edad = edad;
        Trabajador.cat = cat;
        Trabajador.ant = ant;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Trabajador(double sueldo) {
        this.sueldo = sueldo;
    }
  
    // getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    // calculo de los salarios
    public double calcularSueldo(double sueldo) {
     switch (cat) {
          case 0:
               sueldo = sueldo+(sueldo*0.15);     
          break;
          case 1:
               sueldo = sueldo+(sueldo*0.30);
          break;
          case 2:
               sueldo = sueldo+(sueldo*0.60);
          break;
          default:
          break;
     }
     switch (ant) {
          case 0:
               sueldo += 150;
          break;
          case 1:
               sueldo += 300;
          break;
          case 2:
               sueldo += 600;
          break;
     }
     System.out.println(this.sueldo);
     return sueldo;
    }
}