
public class Main {
     public static void main(String[] args) {
          Trabajador trabajador1 = new Trabajador("Alejandro", 18, 0, 1);
          Trabajador trabajador2 = new Trabajador("José", 30, 1, 1);
          boolean fin = false;
          System.out.println("Bienvenido al programa de cálculo de salarios");

          // genera la interfaz
          do {
               System.out.println("Empleados");
               System.out.println("------------------------------------------------");
               System.out.println("| Nombre    |  Edad  | Categoría  | Antigüedad |");
               System.out.println("------------------------------------------------");
               System.out.println("| 1. "+trabajador1.getNombre()+" |  "+trabajador1.getEdad()+"  |      "+trabajador1.cat+"    |     "+trabajador1.ant+"      |");
               System.out.println("| 2. "+trabajador2.getNombre()+"      |  "+trabajador2.getEdad()+"  |      "+trabajador2.cat+"    |     "+trabajador2.ant+"      |");
               System.out.println("------------------------------------------------");
          
               // estuve durante bastante tiempo tratando de implementar el cálculo, desgraciadamente no lo logré y tan solo aparece 0.0
               System.out.println("Elige un trabajador");
               int opcion = Integer.parseInt(System.console().readLine());
               switch (opcion) {
                    case 1:
                         trabajador1.calcularSueldo(500);
                         System.out.println();
                    break;
                    case 2:
                         trabajador2.calcularSueldo(1000);
                    break;
                    default:
                         System.out.println("Valor incorrecto");
                    break;
          }
          } while (fin != true);

     }
}
