public class ConversionImplicita {
    public static void main(String[] args) {
        byte valorByte = 10;
        short valorShort = valorByte;
        int valorInt = valorShort;
        long valorLong = valorInt;
        float valorFloat = valorLong;
        double valorDouble = valorFloat;

        System.out.println("byte: " + valorByte);
        System.out.println("short: " + valorShort);
        System.out.println("int: " + valorInt);
        System.out.println("long: " + valorLong);
        System.out.println("float: " + valorFloat);
        System.out.println("double: " + valorDouble);
    }
}