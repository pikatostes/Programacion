public class Pizza {
     private String tipo;
     private String tamaño;
     private String estado;
     private static int totalPedidas;
     private static int totalServidas;
 
     public Pizza(String tipo, String tamaño) {
         this.tipo = tipo;
         this.tamaño = tamaño;
         this.estado = "pedida";
         totalPedidas++;
     }
 
     public void sirve() {
         if (this.estado.equals("pedida")) {
             this.estado = "servida";
             totalServidas++;
         } else {
            System.out.println("Esa pizza ya está servida");
         }
     }
 
     public static int getTotalPedidas() {
         return totalPedidas;
     }
 
     public static int getTotalServidas() {
         return totalServidas;
     }
 
     @Override
     public String toString() {
         return "Pizza " + tipo + " " + tamaño + ", " + estado;
     }
 }
 