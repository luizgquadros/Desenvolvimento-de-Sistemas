package heranca;

public class PassaroHeranca extends AnimalHeranca {
    public PassaroHeranca(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Piu piu!");
    }
}
