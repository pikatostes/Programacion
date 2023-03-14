
public class Main {
     public static void main(String[] args) {
          Cuenta cuenta1 = new Cuenta("Alejandro", "1234", "4321", "01", "1234 4321 01 2708200400");
          boolean fin = false;
          double dinero = 0;
          int opcion;
          // no he sabido aplicar el algoritmo que calculaba el numero así que directamente lo nombré como una variable
          String numCuenta = "2708200400";

          // aquí podemos ver un pequeño prototipo de un inicio que no he sabido aplicar
          // boolean inicio = true;
          /*do {
               System.out.print("Usuario: ");
               String user = System.console().readLine();
               System.out.println("Número de cuenta: ");
               String accNumb = System.console().readLine();

               if ((user == cuenta1.titular) && (accNumb == cuenta1.getNumCuenta())) {
                    inicio = false;
               }
          } while (inicio != false); */
          
          // genera la interfaz del programa
          do {
               System.out.println("-------------------------------------------------------------------------------------------");
               System.out.println("| 1. Ver el número de la cuenta completo       2. Ver el titular de la cuenta             |");
               System.out.println("| 3. Ver el código de la entidad               4. Ver el código de la oficina             |");
               System.out.println("| 5. Ver el número de la cuenta                6. Ver los dígitos de control de la cuenta |");
               System.out.println("| 7. Consultar saldo                           8. Realizar un ingreso                     |");
               System.out.println("| 9. Retirar efectivo                                                                     |");
               System.out.println("-------------------------------------------------------------------------------------------");
               System.out.println("|                               0. Salir del programa                                     |");
               System.out.println("-------------------------------------------------------------------------------------------");
          
               opcion = Integer.parseInt(System.console().readLine());

               switch(opcion){
                    case 0:
                    fin = true;
                    break;

                    case 1:
                    System.out.println("Numero de la cuenta completo: "+cuenta1.getNumCuentaCompleto());
                    break;
     
                    case 2:
                    System.out.println("Titular: " +cuenta1.getTitular());
                    break;

                    case 3:
                    System.out.println("Código de la entidad: "+cuenta1.getEntidad());
                    break;
                    
                    case 4:
                    System.out.println("Código de la oficina: "+cuenta1.getOficina());
                    break;
     
                    case 5:
                    System.out.println("Número de la cuenta: "+numCuenta);
                    break;
     
                    case 6:
                    System.out.println("Dígitos de control: "+cuenta1.getDC());
                    break;
     
                    case 7:
                    System.out.println("Tu saldo actual es de: " +cuenta1.getSaldo()+" euros");
                    break;
     
                    case 8:
                    System.out.println("===============");
                    System.out.println("¿Cuánto dinero desea ingresar?");
                    dinero = Double.parseDouble(System.console().readLine());

                    cuenta1.ingresar(dinero);
                    break;
     
                    case 9:
                    System.out.println("===============");
                    System.out.println("¿Cuánto dinero desea retirar?");
                    dinero = Double.parseDouble(System.console().readLine());

                    cuenta1.retirar(dinero);
                    break;
               }
          } while (fin != true);
     }
}
