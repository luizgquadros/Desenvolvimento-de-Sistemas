package encapsulamento;

public class Pessoa {
    private String nome; // só pode ser acessado dentro da classe Pessoa
    protected int idade; // pode ser acessado por subclasses e classes do mesmo pacote
    String endereco; // default: acessivel por classs do mesmo pacote
    public String telefone; // acessivel de qualquer lugar

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
