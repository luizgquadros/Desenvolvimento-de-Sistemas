package explicacao.atributo.referencia;

// Atributos de referência armazenam referências para objetos, como String, arrays,
// objetos de outras classes, listas e coleções.

public class Endereco {
    String cidade;

    public Endereco(String cidade){
        this.cidade = cidade;
    }
}

class AlunoComEndereco {
    String nome;
    Endereco endereco;

    public AlunoComEndereco(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public static void main(String[] args) {
        Endereco e = new Endereco("São Paulo");
        AlunoComEndereco aluno = new AlunoComEndereco("Lucas", e);

        System.out.println(aluno.nome + " mora em " + aluno.endereco.cidade);
    }
}
