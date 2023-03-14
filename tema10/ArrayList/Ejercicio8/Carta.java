public class Carta {
     private int numero;
     private String palo;
 
     public Carta(int numero, String palo) {
         this.numero = numero;
         this.palo = palo;
     }
 
     public int getNumero() {
         return numero;
     }
 
     public String getPalo() {
         return palo;
     }
 
     @Override
     public String toString() {
         String nombreCarta = "";
         switch(numero) {
             case 1:
                 nombreCarta = "As";
                 break;
             case 10:
                 nombreCarta = "Sota";
                 break;
             case 11:
                 nombreCarta = "Caballo";
                 break;
             case 12:
                 nombreCarta = "Rey";
                 break;
             default:
                 nombreCarta = Integer.toString(numero);
         }
         return nombreCarta + " de " + palo;
     }
 }
 