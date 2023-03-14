public class Moneda {
     private TipoMoneda tMoneda;
     private int decimales;
     private String simbolo;
     private double cambioEuro;
 
     public Moneda(TipoMoneda tMoneda, int decimales, String simbolo, double cambioEuro) {
         if (decimales < 0 || decimales > 4) {
             throw new IllegalArgumentException("Número de decimales no válido");
         }
         if (simbolo == null || simbolo.isEmpty()) {
             throw new IllegalArgumentException("Símbolo de moneda no válido");
         }
         if (cambioEuro < 0) {
             throw new IllegalArgumentException("Cambio con respecto al euro no puede ser negativo");
         }
 
         this.tMoneda = tMoneda;
         this.decimales = decimales;
         this.simbolo = simbolo;
         this.cambioEuro = cambioEuro;
     }
 
     public TipoMoneda getTMoneda() {
         return tMoneda;
     }
 
     public int getDecimales() {
         return decimales;
     }
 
     public String getSimbolo() {
         return simbolo;
     }
 
     public double getCambioEuro() {
         return cambioEuro;
     }
 
     public void setCambioEuro(double cambioEuro) {
         if (cambioEuro < 0) {
             throw new IllegalArgumentException("Cambio con respecto al euro no puede ser negativo");
         }
 
         this.cambioEuro = cambioEuro;
     }
 }
 