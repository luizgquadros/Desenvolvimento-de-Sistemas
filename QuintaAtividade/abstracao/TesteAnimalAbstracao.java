package abstracao;

// Código_5.4: Classe principal TestaAnimalAbstracao em Java

public class TesteAnimalAbstracao {
    public static void main(String[] args) {
        AnimalAbstracao cachorro = new CachorroAbstracao("Billy");
        AnimalAbstracao gato = new GatoAbstracao("Bibi");

        cachorro.emitirSom();
        gato.emitirSom();
    }
}