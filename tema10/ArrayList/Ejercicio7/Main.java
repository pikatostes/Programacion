import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Generar 6 monedas aleatorias y guardarlas en una lista
        List<Moneda> monedas = new ArrayList<>();
        Moneda monedaAnterior = null;

        for (int i = 0; i < 6; i++) {
            Moneda monedaGenerada;

            if (i == 0) { // La primera moneda se genera aleatoriamente
                monedaGenerada = generarMonedaAleatoria();
            } else { // Las siguientes monedas se generan según la pauta indicada
                monedaGenerada = generarMonedaSegunPauta(monedaAnterior);
            }

            monedaAnterior = monedaGenerada;
            monedas.add(monedaGenerada);
        }

        // Mostrar las monedas generadas
        for (Moneda moneda : monedas) {
            System.out.println(moneda);
        }
    }

    private static Moneda generarMonedaAleatoria() {
        Random random = new Random();
        double valor = random.nextInt(9) + 1;
        int posicion = random.nextInt(2);

        return new Moneda(valor, posicion);
    }

    private static Moneda generarMonedaSegunPauta(Moneda monedaAnterior) {
        Random random = new Random();
        double valor = 0;
        int posicion = 0;

        if (monedaAnterior.getPosicion() == random.nextInt(2)) { // Misma posición
            valor = monedaAnterior.getValor();
            int incremento = random.nextInt(3) + 1; // Incremento de 1, 2 o 5 céntimos
            if (valor + incremento <= 2) {
                valor += incremento;
            } else {
                valor -= incremento;
            }
        } else { // Misma posición que la moneda anterior
            switch ((int) monedaAnterior.getValor()) {
                case 1:
                    valor = 2;
                    break;
                case 2:
                    valor = 1;
                    break;
                case 5:
                    valor = 10;
                    break;
                case 10:
                    valor = 5;
                    break;
                case 25:
                    valor = 50;
                    break;
                case 50:
                    valor = 25;
                    break;
                case 100:
                    valor = 200;
                    break;
                case 200:
                    valor = 100;
                    break;
            }
        }

        posicion = random.nextInt(2);

        return new Moneda(valor, posicion);
    }
}