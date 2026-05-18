public class ConversionExplicita {
    public static void main(String[] args) {
        double valor = 45.89;

        float valorFloat = (float) valor;
        int valorInt = (int) valor;
        short valorShort = (short) valor;
        byte valorByte = (byte) valor;

        System.out.println("double original: " + valor);
        System.out.println("float: " + valorFloat);
        System.out.println("int: " + valorInt + " (se pierden los decimales)");
        System.out.println("short: " + valorShort + " (se pierden los decimales)");
        System.out.println("byte: " + valorByte + " (se pierden decimales y puede haber overflow)");
    }
}