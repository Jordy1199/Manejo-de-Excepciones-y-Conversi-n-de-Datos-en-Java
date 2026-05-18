public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Ana López", "Carlos Pérez", "Luis Gómez"};
        int[] edades = {20, -5, 22};
        double[] promedios = {8.5, 9.0, 7.8};

        for (int i = 0; i < nombres.length; i++) {
            try {
                Estudiante e = new Estudiante(nombres[i], edades[i], promedios[i]);
                System.out.println("Registrado: " + e);
            } catch (EdadInvalidaException e) {
                System.out.println("Error al registrar estudiante: " + e.getMessage());
                System.out.println("Edad ingresada fue: " + e.getEdadIngresada());
            }
        }
    }
}
