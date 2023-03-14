public class Fraccion {
     private int numerador;
     private int denominador;
 
     public Fraccion(int numerador, int denominador) throws ArithmeticException {
         if (denominador == 0) {
             throw new ArithmeticException("El denominador no puede ser cero");
         }
         this.numerador = numerador;
         this.denominador = denominador;
     }
 
     public Fraccion(int numero) {
         this.numerador = numero;
         this.denominador = 1;
     }
 
     public Fraccion(double numero) {
         int precision = 10;
         while (((int) (numero * precision)) % 10 != 0) {
             precision *= 10;
         }
         this.numerador = (int) (numero * precision);
         this.denominador = precision;
         this.simplificar();
     }
 
     public int getNumerador() {
         return numerador;
     }
 
     public void setNumerador(int numerador) {
         this.numerador = numerador;
     }
 
     public int getDenominador() {
         return denominador;
     }
 
     public void setDenominador(int denominador) throws ArithmeticException {
         if (denominador == 0) {
             throw new ArithmeticException("El denominador no puede ser cero");
         }
         this.denominador = denominador;
     }
 
     private int mcm(int a, int b) {
         return a * b / mcd(a, b);
     }
 
     private int mcd(int a, int b) {
         if (b == 0) {
             return a;
         } else {
             return mcd(b, a % b);
         }
     }
 
     public void simplificar() {
         int divisorComun = mcd(numerador, denominador);
         numerador = numerador / divisorComun;
         denominador = denominador / divisorComun;
     }
 
     @Override
     public String toString() {
         return numerador + "/" + denominador;
     }
 
     public Fraccion negate() {
         return new Fraccion(-numerador, denominador);
     }
 
     public Fraccion add(Fraccion f) {
         int mcm = mcm(denominador, f.denominador);
         int nuevoNumerador = numerador * (mcm / denominador) + f.numerador * (mcm / f.denominador);
         return new Fraccion(nuevoNumerador, mcm);
     }
 
     public Fraccion subtract(Fraccion f) {
         return this.add(f.negate());
     }
 
     public Fraccion multiply(Fraccion f) {
         int nuevoNumerador = numerador * f.numerador;
         int nuevoDenominador = denominador * f.denominador;
         return new Fraccion(nuevoNumerador, nuevoDenominador);
     }
 
     public Fraccion divide(Fraccion f) throws ArithmeticException {
         if (f.numerador == 0) {
             throw new ArithmeticException("No se puede dividir por cero");
         }
         int nuevoNumerador = numerador * f.denominador;
         int nuevoDenominador = denominador * f.numerador;
         return new Fraccion(nuevoNumerador, nuevoDenominador);
     }
 
     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof Fraccion)) return false;
         Fraccion fraccion = (Fraccion) o;
         this.simplificar();
         fraccion.simplificar();
         return this.numerador == fraccion.numerador && this.denominador == fraccion.denominador;
     }

     public int compareTo(Fraccion f) {
          Fraccion resultado = subtract(f);
          if (resultado.getNumerador() > 0) {
              return 1;
          } else if (resultado.getNumerador() < 0) {
              return -1;
          } else {
              return 0;
          }
     }
}
 