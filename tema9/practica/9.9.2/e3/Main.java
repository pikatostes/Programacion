public class Main {
     public static void main(String[] args) {
         // Instanciamos un objeto de cada clase
        Gato gato = new Gato("Misifu");
        Perro perro = new Perro("Firulais");
        Canario canario = new Canario("Piolín");
        Pinguino pinguino = new Pinguino("Tux");
        Lagarto lagarto = new Lagarto("Godzilla");
 
         // Aplicamos métodos a los objetos
         System.out.println("Gato\n====");
         gato.comer();
         gato.mover();
         gato.dormir();
         gato.maullar();
          
         System.out.println("Perro\n====");
         perro.comer();
         perro.mover();
         perro.dormir();
         perro.ladrar();
          
         System.out.println("Ave\n====");
         canario.comer();
         canario.mover();
         canario.dormir();
         canario.volar();
          
         System.out.println("Ave\n====");
         pinguino.comer();
         pinguino.mover();
         pinguino.dormir();
         pinguino.nadar();
          
         System.out.println("Animal\n====");
         lagarto.comer();
         lagarto.mover();
         lagarto.dormir();
     }
 }
 