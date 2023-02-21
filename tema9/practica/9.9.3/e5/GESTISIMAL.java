import java.util.ArrayList;
import java.util.Scanner;

public class GESTISIMAL {
    public static void main(String[] args) {

        ArrayList<Articulo> articulos = new ArrayList<Articulo>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        do {
            System.out.println("GESTISIMAL - GESTIÓN SIMPLIFICADA DE ALMACÉN\n");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir\n");
            System.out.print("Introduzca una opción (1-7): ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1: // Listado
                    if (articulos.isEmpty()) {
                    System.out.println("No hay artículos en el almacén.");
                    } else {
                        System.out.println("Listado de artículos:\n");
                        System.out.printf("%-10s %-20s %10s %10s %10s\n", "Código", "Descripción", "Precio compra", "Precio venta", "Stock");
                        System.out.println("--------------------------------------------------------------------------");

                        for (Articulo a : articulos) {
                            System.out.printf("%-10s %-20s %10.2f %10.2f %10d\n", a.getCodigo(), a.getDescripcion(), a.getPrecioCompra(), a.getPrecioVenta(), a.getStock());
                        }
                    }
                break;

                case 2: // Alta
                    Articulo nuevoArticulo = new Articulo();
                    System.out.print("Introduzca el código del artículo: ");
                    nuevoArticulo.setCodigo(sc.next());
                    sc.nextLine();
                    System.out.print("Introduzca la descripción del artículo: ");
                    nuevoArticulo.setDescripcion(sc.nextLine());
                    System.out.print("Introduzca el precio de compra del artículo: ");
                    nuevoArticulo.setPrecioCompra(sc.nextDouble());
                    System.out.print("Introduzca el precio de venta del artículo: ");
                    nuevoArticulo.setPrecioVenta(sc.nextDouble());
                    System.out.print("Introduzca el stock del artículo: ");
                    nuevoArticulo.setStock(sc.nextInt());
                    articulos.add(nuevoArticulo);
                    System.out.println("Artículo añadido correctamente.");
                break;
                
                case 3:
                    if (articulos.isEmpty()) {
                        System.out.println("No hay artículos en el almacén.");
                    } else {
                        System.out.print("Introduzca el código del artículo a dar de baja: ");
                        String codigoBaja = sc.next();
                        boolean encontrado = false;

                        for (Articulo a : articulos) {
                            if (a.getCodigo().equals(codigoBaja)) {
                                articulos.remove(a);
                                encontrado = true;
                                System.out.println("Artículo eliminado correctamente.");
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("No se ha encontrado ningún artículo con ese código.");
                        }
                    }
                break;
                
                case 4: // Modificación
                    if (articulos.isEmpty()) {
                        System.out.println("No hay artículos en el almacén");
                    } else {
                        System.out.print("Introduzca el código del artículo a modificar: ");
                        String codigoModificacion = sc.next();
                        boolean encontrado = false;
     
                        for (Articulo a : articulos) {
                            if (a.getCodigo().equals(codigoModificacion)) {
                                System.out.println("Introduzca los nuevos datos del artículo (deje en blanco si no desea modificarlos):");
                                System.out.print("Código (" + a.getCodigo() + "): ");
                                String codigo = sc.next();
                                if (!codigo.equals("")) {
                                    a.setCodigo(codigo);
                                }
                                sc.nextLine();
                                System.out.print("Descripción (" + a.getDescripcion() + "): ");
                                String descripcion = sc.nextLine();
                                if (!descripcion.equals("")) {
                                    a.setDescripcion(descripcion);
                                }
                                System.out.print("Precio de compra (" + a.getPrecioCompra() + "): ");
                                String precioCompraStr = sc.nextLine();
                                if (!precioCompraStr.equals("")) {
                                    double precioCompra = Double.parseDouble(precioCompraStr);
                                    a.setPrecioCompra(precioCompra);
                                }
                                System.out.print("Precio de venta (" + a.getPrecioVenta() + "): ");
                                String precioVentaStr = sc.nextLine();
                                if (!precioVentaStr.equals("")) {
                                    double precioVenta = Double.parseDouble(precioVentaStr);
                                    a.setPrecioVenta(precioVenta);
                                }
                                System.out.print("Stock (" + a.getStock() + "): ");
                                String stockStr = sc.nextLine();
                                if (!stockStr.equals("")) {
                                    int stock = Integer.parseInt(stockStr);
                                    a.setStock(stock);
                                }
                                encontrado = true;
                                System.out.println("Artículo modificado correctamente.");
                                break;
                            }
                        }
     
                        if (!encontrado) {
                            System.out.println("No se ha encontrado ningún artículo con ese código.");
                        }
                    }
                break;
                
                case 5: // Entrada de mercancía
                if (articulos.isEmpty()) {
                    System.out.println("No hay artículos en el almacén.");
                } else {
                    System.out.print("Introduzca el código del artículo al que se va a añadir stock: ");
                    String codigoEntrada = sc.next();
                    boolean encontrado = false;

                    for (Articulo a : articulos) {
                        if (a.getCodigo().equals(codigoEntrada)) {
                            System.out.print("Introduzca la cantidad de unidades a añadir: ");
                            int cantidadEntrada = sc.nextInt();
                            a.aumentarStock(cantidadEntrada);
                            encontrado = true;
                            System.out.println("Stock actualizado correctamente.");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se ha encontrado ningún artículo con ese código.");
                    }
                }
                break;

                case 6: // Salida de mercancía
                    if (articulos.isEmpty()) {
                        System.out.println("No hay artículos en el almacén.");
                    } else {
                        System.out.print("Introduzca el código del artículo del que se va a restar stock: ");
                        String codigoSalida = sc.next();
                        boolean encontrado = false;

                        for (Articulo a : articulos) {
                            if (a.getCodigo().equals(codigoSalida)) {
                                System.out.print("Introduzca la cantidad de unidades a restar: ");
                                int cantidadSalida = sc.nextInt();
                                if (a.getStock() >= cantidadSalida) {
                                    a.reducirStock(cantidadSalida);
                                    encontrado = true;
                                    System.out.println("Stock actualizado correctamente.");
                                break;
                            } else {
                                System.out.println("No hay suficiente stock para realizar la salida de mercancía.");
                                break;
                            }
                        }
    
                        if (!encontrado) {
                            System.out.println("No se ha encontrado ningún artículo con ese código.");
                        }
                    }
                break;

                case 7: // Salir
                salir = true;
                System.out.println("¡Hasta pronto!");
                break;

                default:
                System.out.println("Opción no válida. Introduzca un número del 1 al 7");
                break;
            }
        } while (salir != true);
    }
}
}         
     
