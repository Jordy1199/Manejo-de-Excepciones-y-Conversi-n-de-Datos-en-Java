public class ConversionString {
    public static void main(String[] args) {
        int entero = Integer.parseInt("2024");
        double decimal = Double.parseDouble("98.6");
        boolean booleano = Boolean.parseBoolean("false");

        System.out.println("String a int: " + entero);
        System.out.println("String a double: " + decimal);
        System.out.println("String a boolean: " + booleano);

        String desdeInt1 = String.valueOf(entero);
        String desdeInt2 = Integer.toString(entero);
        String desdeInt3 = "" + entero;

        System.out.println("int a String con valueOf: " + desdeInt1);
        System.out.println("int a String con toString: " + desdeInt2);
        System.out.println("int a String con concatenacion: " + desdeInt3);
    }
}