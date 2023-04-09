public class Carta {
    private int numero;
    private int palo;

    public Carta(int numero, int palo) throws Exception {
        if (numero < 1 || numero > 10 || palo < 0 || palo > 3) {
            throw new Exception("Valores no válidos para crear la carta");
        }
        this.numero = numero;
        this.palo = palo;
    }

    public Carta(int id) throws Exception {
        if (id < 1 || id > 40) {
            throw new Exception("Valor no válido para crear la carta");
        }
        this.palo = (id - 1) / 10;
        this.numero = (id - 1) % 10 + 1;
        if (this.numero > 7) {
            this.numero++;
        }
    }

    public int getNumero() {
        return this.numero;
    }

    public int getPalo() {
        return this.palo;
    }

    public String nombreNumero() {
        switch (this.numero) {
            case 1:
                return "as";
            case 8:
                return "sota";
            case 9:
                return "caballo";
            case 10:
                return "rey";
            default:
                return Integer.toString(this.numero);
        }
    }

    public String nombrePalo() {
        switch (this.palo) {
            case 0:
                return "oros";
            case 1:
                return "copas";
            case 2:
                return "espadas";
            default:
                return "bastos";
        }
    }

    public String nombreCarta() {
        return this.nombreNumero() + " de " + this.nombrePalo();
    }

    public int valorTute() {
        switch (this.numero) {
            case 1:
                return 11;
            case 3:
                return 10;
            case 8:
                return 2;
            case 9:
                return 3;
            case 10:
                return 4;
            default:
                return 0;
        }
    }

    public int valorMus() {
        switch (this.numero) {
            case 1:
            case 2:
                return 1;
            case 3:
            case 8:
            case 9:
            case 10:
                return 10;
            default:
                return this.numero;
        }
    }

    public double valor7ymedia() {
        if (this.numero > 7) {
            return 0.5;
        } else {
            return this.numero;
        }
    }
}
