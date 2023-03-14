import java.util.ArrayList;
import java.util.List;

public class Dinero {
    private double cantidad;
    private Moneda moneda;

    private static List<Moneda> listaMonedas = new ArrayList<>();

    static {
        listaMonedas.add(new Moneda(TipoMoneda.EURO, 2, "€", 1));
        listaMonedas.add(new Moneda(TipoMoneda.DOLAR, 2, "$", 1.18));
        listaMonedas.add(new Moneda(TipoMoneda.LIBRA, 2, "£", 0.85));
    }

    public Dinero(double cantidad, TipoMoneda t) {
        this.cantidad = cantidad;
        this.moneda = buscaMoneda(t);
    }

    public double getCantidad() {
        return cantidad;
    }

    public TipoMoneda getTipoMoneda() {
        return moneda.getTipoMoneda();
    }

    public String getSimbolo() {
        return moneda.getSimbolo();
    }

    public int getDecimales() {
        return moneda.getDecimales();
    }

    public double getCambioEuro() {
        return moneda.getCambioEuro();
    }

    public void setCambioEuro(double nuevoCambio) {
        if (nuevoCambio >= 0) {
            moneda.setCambioEuro(nuevoCambio);
        }
    }

    public String toString() {
        return String.format("%.2f %s", cantidad, moneda.getSimbolo());
    }

    private static Moneda buscaMoneda(TipoMoneda t) {
        for (Moneda m : listaMonedas) {
            if (m.getTipoMoneda() == t) {
                return m;
            }
        }
        return null;
    }

    public double getCantidadEnEuros() {
        return cantidad / moneda.getCambioEuro();
    }

    public double getCantidadEnMoneda(TipoMoneda t) {
        Moneda otraMoneda = buscaMoneda(t);
        double cambio = otraMoneda.getCambioEuro() / moneda.getCambioEuro();
        return cantidad * cambio;
    }

    public Dinero suma(Dinero otro) {
        double sumaCantidad = this.getCantidad() + otro.getCantidadEnMoneda(this.getTipoMoneda());
        return new Dinero(sumaCantidad, this.getTipoMoneda());
    }

    public Dinero resta(Dinero otro) {
        double restaCantidad = this.getCantidad() - otro.getCantidadEnMoneda(this.getTipoMoneda());
        return new Dinero(restaCantidad, this.getTipoMoneda());
    }
}