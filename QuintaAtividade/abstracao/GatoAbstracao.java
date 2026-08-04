package abstracao;

// Código_5.3: Classe concreta GatoAbstracao em Java

public class GatoAbstracao extends AnimalAbstracao {
    public GatoAbstracao(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau!");
    }
}