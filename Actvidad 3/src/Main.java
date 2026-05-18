public class Main {
    public static void main(String[] args) {
        Animal animal = new Perro();
        animal.hacerSonido();

        if (animal instanceof Perro) {
            Perro perro = (Perro) animal;
            perro.buscarHueso();
        }
    }
}