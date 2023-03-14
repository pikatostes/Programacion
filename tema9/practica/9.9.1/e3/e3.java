public class Equipo {
     private String nombre;
     private Jugador[] jugadores;
     
     public Equipo(String n, Jugador[] j) {
       nombre = n;
       jugadores = j;
     }
   }
   
   public class Jugador {
     private String nombre;
     private int numero;
     private Posicion posicion;
     
     public Jugador(String n, int num, Posicion p) {
       nombre = n;
       numero = num;
       posicion = p;
     }
   }
   
   enum Posicion {
     BASE, ESColtA, ALERO, ALA_PIVOT, PIVOT
   }
   
   public class Partido {
     private Equipo equipoLocal;
     private Equipo equipoVisitante;
     private Resultado resultado;
     
     public Partido(Equipo eL, Equipo eV, Resultado r) {
       equipoLocal = eL;
       equipoVisitante = eV;
       resultado = r;
     }
   }
   
   public class Resultado {
     private int puntosLocal;
     private int puntosVisitante;
     
     public Resultado(int pL, int pV) {
       puntosLocal = pL;
       puntosVisitante = pV;
     }
   }
   
   public class Temporada {
     private Partido[] partidos;
     
     public Temporada(Partido[] p) {
       partidos = p;
     }
   }