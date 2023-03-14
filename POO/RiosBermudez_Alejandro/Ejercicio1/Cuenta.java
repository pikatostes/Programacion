
public class Cuenta {
    // atributos de la clase
     String titular;
     private double saldo;
     private String entidad;
     private String oficina;
     private String numCuenta;
     private String DC;
     
     // constructor
    public Cuenta(String titular, String entidad, String oficina,String DC, String numCuenta) {
        this.titular = titular;
        this.entidad = entidad;
        this.oficina = oficina;
        this.DC = DC;
        this.numCuenta = numCuenta;
    }

    // no sabía muy bien que poner aquí y como más tarde ví que no era imprescindible lo dejé pasar
     public Cuenta(String titular, String CCC) {

     }
     
    // getters
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getEntidad() {
        return entidad;
    }
    public String getOficina() {
        return oficina;
    }
    public String getNumCuentaCompleto() {
        return numCuenta;
    }
    public String getDC() {
        return DC;
    }

     // setters
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    // métodos

    // ingreso
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad introducida no es correcta");
        }
    }

    // retiro
    public void retirar(double cantidad) {
        if ((cantidad > 0) && (cantidad < saldo)) {
            saldo -= cantidad;
        } else {
            System.out.println("La cantidad introducida no es correcta");
        }
    }

    // no supe aplicar correctamente el calculo de los DC, así que opté por inventarme uno aleatorio
    public static String obtenerDigitosControl(String entidad, String oficina, String numCuenta) {
        
        return numCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }
}
