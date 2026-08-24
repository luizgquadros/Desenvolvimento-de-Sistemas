package heranca;

public class AnimalHeranca {
    private String nome;
    public AnimalHeranca(String nome){
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("Som genérico de animal.");
    }

    public String getNome(){
        return nome;
    }
}