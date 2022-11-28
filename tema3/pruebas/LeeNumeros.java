public class LeeNumeros{
  public static void main(Strings[] args){
    String linea;
    
    System.out.println("Por favor, introduce un numero: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt(linea);
    
    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt(linea);
    
    int total;
    total = (2* primerNumero) + segundoNumero;
    
    System.out.print("El primer numero introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.print("El doble del primer numero mas el segundo es ");
    System.out.print(total);
  }
}
