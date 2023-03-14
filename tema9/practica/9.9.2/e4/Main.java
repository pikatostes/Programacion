public class Main {
     public static void main(String[] args) {
         Fraccion f1 = new Fraccion(1, 2);
         Fraccion f2 = new Fraccion(2, 3);
         
         System.out.println("Fracción 1: " + f1.getNumerador() + "/" + f1.getDenominador());
         System.out.println("Fracción 2: " + f2.getNumerador() + "/" + f2.getDenominador());
         
         f1.invierte();
         System.out.println("Inversa de la fracción 1: " + f1.getNumerador() + "/" + f1.getDenominador());
         
         f1.simplifica();
         System.out.println("Fracción 1 simplificada: " + f1.getNumerador() + "/" + f1.getDenominador());
         
         Fraccion f3 = f1.multiplica(f2);
         System.out.println("Fracción 1 * Fracción 2: " + f3.getNumerador() + "/" + f3.getDenominador());
         
         Fraccion f4 = f1.divide(f2);
         System.out.println("Fracción 1 / Fracción 2: " + f4.getNumerador() + "/" + f4.getDenominador());

         f4.simplifica();
         System.out.println("Fracción 4 simplificada: " + f4.getNumerador() + "/" + f4.getDenominador());
     }
 }
 