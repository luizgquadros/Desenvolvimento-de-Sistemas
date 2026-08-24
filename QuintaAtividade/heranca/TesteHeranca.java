package heranca;

public class TesteHeranca {
    public static void main(String[] args) {
        AnimalHeranca animal = new AnimalHeranca("Bicho");
        CachorroHeranca cachorro = new CachorroHeranca("Rex");

        animal.emitirSom();
        cachorro.emitirSom();
    }
}