import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.print("Moneda origen (USD/EUR): ");
        String origen = scanner.nextLine();

        System.out.print("Moneda destino (USD/EUR): ");
        String destino = scanner.nextLine();

        System.out.print("Cantidad a convertir: ");
        String cantidadTexto = scanner.nextLine();

        try {
            double cantidad = Double.parseDouble(cantidadTexto);
            double resultado = conversor.convertir(origen, destino, cantidad);
            System.out.println("Resultado: " + String.format("%.2f", resultado) + " " + destino.toUpperCase());
        } catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar un número válido.");
        } catch (MonedaNoSoportadaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado correctamente.");
            scanner.close();
        }
    }
}
