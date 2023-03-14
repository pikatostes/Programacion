public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;
    private int resto;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void suma(Tiempo otroTiempo) {
        int totalSegundos = this.aSegundos() + otroTiempo.aSegundos();
        this.horas = totalSegundos / 3600;
        this.minutos = (totalSegundos % 3600) / 60;
        this.segundos = totalSegundos % 60;
    }

    public void resta(Tiempo otroTiempo) {
        int totalSegundos = this.aSegundos() - otroTiempo.aSegundos();
        if (totalSegundos < 0) {
            totalSegundos = 0;
        }
        resto = totalSegundos;
        this.horas = totalSegundos / 3600;
        this.minutos = (totalSegundos % 3600) / 60;
        this.segundos = totalSegundos % 60;
    }

    public int aSegundos() {
        return horas * 3600 + minutos * 60 + segundos;
    }

    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + "s";
    }
}

 