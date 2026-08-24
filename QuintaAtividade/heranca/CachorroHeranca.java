package heranca;

public class CachorroHeranca extends AnimalHeranca {
    public CachorroHeranca(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Au, au!");
    }
}