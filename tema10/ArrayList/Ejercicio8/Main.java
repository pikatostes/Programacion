import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        ArrayList<Carta> baraja = new ArrayList<Carta>();
        for (int i = 0; i < palos.length; i++) {
            for (int j = 1; j <= 12; j++) {
                baraja.add(new Carta(j, palos[i]));
            }
        }

        Collections.shuffle(baraja);
        
        ArrayList<Carta> mano = new ArrayList<Carta>();
        for (int i = 0; i < 10; i++) {
            mano.add(baraja.get(i));
        }
        System.out.println(mano);
    }
}
