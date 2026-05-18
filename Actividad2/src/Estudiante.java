public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException(edad);
        }
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getPromedio() { return promedio; }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "', edad=" + edad + ", promedio=" + promedio + "}";
    }
}