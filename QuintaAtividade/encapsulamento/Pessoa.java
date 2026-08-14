package encapsulamento;

public class Pessoa {
    private String nome;
    protected int idade;
    String endereco;
    public String telefone;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
