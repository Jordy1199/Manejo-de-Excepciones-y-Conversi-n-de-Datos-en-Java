import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            if (numero == 0) {
                throw new ArithmeticException("división por cero");
            }
            double resultado = 100.0 / numero;
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un número válido");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } finally {
            System.out.println("Programa finalizado correctamente");
        }

        sc.close();
    }
}