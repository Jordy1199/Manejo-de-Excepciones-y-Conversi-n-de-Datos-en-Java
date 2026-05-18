public class Conversor {
    public double convertir(String monedaOrigen, String monedaDestino, double cantidad) throws MonedaNoSoportadaException {
        double enUSD;

        switch (monedaOrigen.toUpperCase()) {
            case "USD": enUSD = cantidad; break;
            case "EUR": enUSD = cantidad * 1.08; break;
            default: throw new MonedaNoSoportadaException(monedaOrigen);
        }

        switch (monedaDestino.toUpperCase()) {
            case "USD": return enUSD;
            case "EUR": return enUSD / 1.08;
            default: throw new MonedaNoSoportadaException(monedaDestino);
        }
    }
}