import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Disco> coleccion = new ArrayList<Disco>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listar discos");
            System.out.println("2. Añadir disco");
            System.out.println("3. Modificar disco");
            System.out.println("4. Borrar disco");
            System.out.println("5. Salir");
            System.out.print("Introduce una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: // Listar discos
                    if (coleccion.isEmpty()) {
                        System.out.println("\nLa colección está vacía.");
                    } else {
                        System.out.println("\nLISTADO DE DISCOS");
                        System.out.println("===================");
                        for (Disco d : coleccion) {
                            System.out.println(d);
                        }
                    }
                    break;
                    
                case 2: // Añadir disco
                    System.out.print("\nIntroduce el artista: ");
                    String artista = scanner.next();
                    System.out.print("Introduce el título: ");
                    String titulo = scanner.next();
                    System.out.print("Introduce el género: ");
                    String genero = scanner.next();
                    System.out.print("Introduce la duración (en minutos): ");
                    int duracion = scanner.nextInt();
                    
                    Disco nuevoDisco = new Disco(genero, artista, titulo, genero, duracion);
                    coleccion.add(nuevoDisco);
                    break;
                    
                case 3: // Modificar disco
                    if (coleccion.isEmpty()) {
                        System.out.println("\nLa colección está vacía.");
                    } else {
                        System.out.print("\nIntroduce el título del disco a modificar: ");
                        String tituloModificar = scanner.next();
                        
                        boolean encontrado = false;
                        for (Disco d : coleccion) {
                            if (d.getTitulo().equals(tituloModificar)) {
                                System.out.print("\nIntroduce el nuevo artista (anterior: " + d.getAutor() + "): ");
                                String nuevoArtista = scanner.next();
                                System.out.print("Introduce el nuevo título (anterior: " + d.getTitulo() + "): ");
                                String nuevoTitulo = scanner.next();
                                System.out.print("Introduce el nuevo género (anterior: " + d.getGenero() + "): ");
                                String nuevoGenero = scanner.next();
                                System.out.print("Introduce la nueva duración en minutos (anterior: " + d.getDuracion() + "): ");
                                int nuevaDuracion = scanner.nextInt();
                                
                                d.setAutor(nuevoArtista);
                                d.setTitulo(nuevoTitulo);
                                d.setGenero(nuevoGenero);
                                d.setDuracion(nuevaDuracion);
                                encontrado = true;
                                break;
                            }
                        }
                        
                        if (!encontrado) {
                            System.out.println("\nEl disco no se encuentra en la colección.");
                        }
                    }
                    break;
                    
                case 4: // Borrar disco
                    if (coleccion.isEmpty()) {
                        System.out.println("\nLa colección está vacía.");
                    } else {
                        System.out.print("\nIntroduce el título del disco a borrar: ");
                        String tituloBorrar = scanner.next();
                        boolean borrado = false;
                        for (int i = 0; i < coleccion.size(); i++) {
                            if (coleccion.get(i).getTitulo().equals(tituloBorrar)) {
                                coleccion.remove(i);
                                borrado = true;
                                break;
                            }
                        }
                        
                        if (borrado) {
                            System.out.println("\nEl disco se ha borrado de la colección.");
                        } else {
                            System.out.println("\nEl disco no se encuentra en la colección.");
                        }
                    }
                    break;
                    
                case 5: // Salir
                    System.out.println("\n¡Hasta pronto!");
                    break;
                    
                default:
                    System.out.println("\nLa opción elegida no es válida.");
            }
        } while (opcion != 5);
    }
}    
