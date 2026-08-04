package abstracao;

// Código_5.2: Classe concreta CachorroAbstracao em Java

public class CachorroAbstracao extends AnimalAbstracao {
    public CachorroAbstracao(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Au, au!");
    }
}