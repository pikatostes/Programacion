import java.util.Scanner;

public class Expocoches {
    public static void main(String[] args) {
        // creación
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // bucle y menú
        while (opcion != 3) {
            System.out.println("Menú:");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Entradas disponibles:");
                    System.out.println("Sala principal: " + principal.getEntradasPorVender());
                    System.out.println("Compra-venta: " + compraVenta.getEntradasPorVender());
                    System.out.println("VIP: " + vip.getEntradasPorVender());
                    break;
                case 2:
                    System.out.println("¿Para qué zona desea las entradas?");
                    System.out.println("1. Sala principal");
                    System.out.println("2. Compra-venta");
                    System.out.println("3. VIP");
                    int zona = scanner.nextInt();
                    Zona zonaSeleccionada;

                    // escoge zona
                    switch (zona) {
                        case 1:
                            zonaSeleccionada = principal;
                            break;
                        case 2:
                            zonaSeleccionada = compraVenta;
                            break;
                        case 3:
                            zonaSeleccionada = vip;
                            break;
                        default:
                            System.out.println("Opción no válida");
                            continue;
                    }
                    System.out.print("¿Cuántas entradas desea? ");
                    int n = scanner.nextInt();
                    zonaSeleccionada.vender(n);
                    break;
                case 3:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
        scanner.close();
    }
}

