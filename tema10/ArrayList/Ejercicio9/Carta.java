public class Carta {
     private int numero;
     private int palo;
 
     public Carta(int numero, String palos) {
         this.numero = numero;
         this.palo = palos;
     }
 
     public int getNumero() {
         return numero;
     }
 
     public int getPalo() {
         return palo;
     }
 
     @Override
     public String toString() {
         String sNumero;
         switch (numero) {
             case 1:
                 sNumero = "As";
                 break;
             case 10:
                 sNumero = "Sota";
                 break;
             case 11:
                 sNumero = "Caballo";
                 break;
             case 12:
                 sNumero = "Rey";
                 break;
             default:
                 sNumero = String.valueOf(numero);
         }
         String sPalo;
         switch (palo) {
             case 0:
                 sPalo = "Oros";
                 break;
             case 1:
                 sPalo = "Copas";
                 break;
             case 2:
                 sPalo = "Espadas";
                 break;
             default:
                 sPalo = "Bastos";
         }
         return sNumero + " de " + sPalo;
     }
 }
 