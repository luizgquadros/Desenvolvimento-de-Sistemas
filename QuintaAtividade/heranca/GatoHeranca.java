package heranca;

public class GatoHeranca extends AnimalHeranca {
    public GatoHeranca(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau!");
    }
}