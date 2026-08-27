package heranca;

public class TesteHeranca {
    public static void main(String[] args) {
        AnimalHeranca animal = new AnimalHeranca("Bicho");
        CachorroHeranca cachorro = new CachorroHeranca("Rex");
        PassaroHeranca passaro = new PassaroHeranca("Chico");

        animal.emitirSom();
        cachorro.emitirSom();
        passaro.emitirSom();
    }
}