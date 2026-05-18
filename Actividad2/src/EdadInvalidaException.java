public class EdadInvalidaException extends Exception {
    private int edadIngresada;

    public EdadInvalidaException(int edad) {
        super("Edad inválida ingresada: " + edad + ". La edad debe estar entre 0 y 120.");
        this.edadIngresada = edad;
    }

    public int getEdadIngresada() {
        return edadIngresada;
    }
}