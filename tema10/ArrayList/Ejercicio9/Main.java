import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<Carta>();

        // Creamos las 40 cartas de la baraja española
        for (int palo = 0; palo < 4; palo++) {
            for (int numero = 1; numero <= 10; numero++) {
                Carta carta = new Carta(numero, palo);
                cartas.add(carta);
            }
        }

        // Barajamos las cartas
        Collections.shuffle(cartas);

        // Las ordenamos por palo y número
        Comparator<Carta> comparador = new Comparator<Carta>() {
            @Override
            public int compare(Carta c1, Carta c2) {
                if (c1.getPalo() < c2.getPalo()) {
                    return -1;
                } else if (c1.getPalo() > c2.getPalo()) {
                    return 1;
                } else {
                    if (c1.getNumero() < c2.getNumero()) {
                        return -1;
                    } else if (c1.getNumero() > c2.getNumero()) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        };

        Collections.sort(cartas, comparador);

        // Mostramos las cartas ordenadas
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

}