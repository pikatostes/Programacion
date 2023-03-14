public class PilotoDeFormula1 {
     private String nombre;
     private int numero;
     private String equipo;
     private String nacionalidad;
     private int cantidadDeVictorias;
     private int puntos;
     private int polePositions;
     private int vueltasRapidas;
 
     public PilotoDeFormula1(String nombre, int numero, String equipo, String nacionalidad, int cantidadDeVictorias, int puntos, int polePositions, int vueltasRapidas) {
         this.nombre = nombre;
         this.numero = numero;
         this.equipo = equipo;
         this.nacionalidad = nacionalidad;
         this.cantidadDeVictorias = cantidadDeVictorias;
         this.puntos = puntos;
         this.polePositions = polePositions;
         this.vueltasRapidas = vueltasRapidas;
     }
 
     public String getNombre() {
         return nombre;
     }
 
     public void setNombre(String nombre) {
         this.nombre = nombre;
     }
 
     public int getNumero() {
         return numero;
     }
 
     public void setNumero(int numero) {
         this.numero = numero;
     }
 
     public String getEquipo() {
         return equipo;
     }
 
     public void setEquipo(String equipo) {
         this.equipo = equipo;
     }
 
     public String getNacionalidad() {
         return nacionalidad;
     }
 
     public void setNacionalidad(String nacionalidad) {
         this.nacionalidad = nacionalidad;
     }
 
     public int getCantidadDeVictorias() {
         return cantidadDeVictorias;
     }
 
     public void setCantidadDeVictorias(int cantidadDeVictorias) {
         this.cantidadDeVictorias = cantidadDeVictorias;
     }
 
     public int getPuntos() {
         return puntos;
     }
 
     public void setPuntos(int puntos) {
         this.puntos = puntos;
     }
 
     public int getPolePositions() {
         return polePositions;
     }
 
     public void setPolePositions(int polePositions) {
         this.polePositions = polePositions;
     }
 
     public int getVueltasRapidas() {
         return vueltasRapidas;
     }
 
     public void setVueltasRapidas(int vueltasRapidas) {
         this.vueltasRapidas = vueltasRapidas;
     }
}
 