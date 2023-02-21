public class Fraccion {
     private int numerador;
     private int denominador;
     
     // Constructor
     public Fraccion(int numerador, int denominador) {
         this.numerador = numerador;
         this.denominador = denominador;
     }
     
     // Métodos de acceso
     public int getNumerador() {
         return numerador;
     }
     
     public int getDenominador() {
         return denominador;
     }
     
     // Método para invertir la fracción
     public void invierte() {
         int temp = numerador;
         numerador = denominador;
         denominador = temp;
     }
     
     // Método para simplificar la fracción mediante MCD
     public void simplifica() {
         int mcd = calcularMCD(numerador, denominador);
         numerador /= mcd;
         denominador /= mcd;
     }
     
     // Método para multiplicar dos fracciones
     public Fraccion multiplica(Fraccion otra) {
         int nuevoNumerador = numerador * otra.numerador;
         int nuevoDenominador = denominador * otra.denominador;
         return new Fraccion(nuevoNumerador, nuevoDenominador);
     }
     
     // Método para dividir dos fracciones
     public Fraccion divide(Fraccion otra) {
         int nuevoNumerador = numerador * otra.denominador;
         int nuevoDenominador = denominador * otra.numerador;
         return new Fraccion(nuevoNumerador, nuevoDenominador);
     }
     
     // Método privado para calcular el máximo común divisor (MCD)
     private int calcularMCD(int a, int b) {
         if (b == 0) {
             return a;
         }
         return calcularMCD(b, a % b);
     }
 }
 