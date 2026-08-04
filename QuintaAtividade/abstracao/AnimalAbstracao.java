package abstracao;

// Código_5.1: Classe abstrata AnimalAbstracao em Java

abstract class AnimalAbstracao {
    private String nome;

    public AnimalAbstracao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // metodo abstrato (sem implementação)

    public abstract void emitirSom();
}