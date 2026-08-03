package abstracao;

abstract class AnimalAbstracao {
    private String nome;

    public AnimalAbstracao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // método abstrato (sem implementação)

    public abstract void emitirSom();
}