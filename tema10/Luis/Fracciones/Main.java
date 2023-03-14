public class Main {
     public static void main(String[] args) {
         // Ejemplo de creación de fracciones
         Fraccion f1 = new Fraccion(3, 4);
         Fraccion f2 = new Fraccion(5);
         Fraccion f3 = new Fraccion(1.25);
         
         // Ejemplo de uso de propiedades
         System.out.println("Numerador de f1: " + f1.getNumerador());
         System.out.println("Denominador de f1: " + f1.getDenominador());
         f1.setNumerador(1);
         f1.setDenominador(2);
         System.out.println("Fracción f1 actualizada: " + f1.toString());
         
         // Ejemplo de uso de métodos
         Fraccion f4 = f1.negate();
         Fraccion f5 = f1.add(f2);
         Fraccion f6 = f1.subtract(f2);
         Fraccion f7 = f1.multiply(f2);
         Fraccion f8 = f1.divide(f2);
         
         // Ejemplo de uso de operadores
         boolean f1EqualsF2 = f1.equals(f2);
         int f1CompareToF2 = f1.compareTo(f2);
         
         // Ejemplo de impresión de fracciones
         System.out.println("Fracción f1: " + f1.toString());
         System.out.println("Fracción f2: " + f2.toString());
         System.out.println("Fracción f3: " + f3.toString());
         System.out.println("Fracción f4 (negativa de f1): " + f4.toString());
         System.out.println("Suma de f1 y f2: " + f5.toString());
         System.out.println("Resta de f1 y f2: " + f6.toString());
         System.out.println("Multiplicación de f1 y f2: " + f7.toString());
         System.out.println("División de f1 y f2: " + f8.toString());
         System.out.println("¿f1 es igual a f2? " + f1EqualsF2);
         System.out.println("Comparación de f1 con f2: " + f1CompareToF2);
     }
 }
 
