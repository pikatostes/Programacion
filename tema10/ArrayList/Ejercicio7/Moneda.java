public class Moneda {
     private double valor;
     private int posicion;
 
     public Moneda(double valor, int posicion) {
         this.valor = valor;
         this.posicion = posicion;
     }
 
     public double getValor() {
         return valor;
     }
 
     public int getPosicion() {
         return posicion;
     }
 
     @Override
     public String toString() {
         String valorString = String.format("%.0f", valor);
         String posicionString = (posicion == 0) ? "cara" : "cruz";
 
         return valorString + " céntimos - " + posicionString;
     }
 }