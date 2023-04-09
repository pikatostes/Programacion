import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList de tipo String asignada a 'nombres'
        ArrayList<String> nombres = new ArrayList<String>();

        // añadimos los elementos
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("María");
        nombres.add("Luis");
        nombres.add("Marta");
        
        // impresión por pantalla con bucle 'for'
        for (String nombre : nombres) {
            System.out.print(nombre+" ");
        }
    }
}