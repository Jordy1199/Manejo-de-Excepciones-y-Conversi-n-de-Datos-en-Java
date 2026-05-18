public class MonedaNoSoportadaException extends Exception {
    private String moneda;

    public MonedaNoSoportadaException(String moneda) {
        super("La moneda no está soportada: " + moneda);
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }
}
