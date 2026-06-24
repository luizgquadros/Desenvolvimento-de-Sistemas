package explicacao.atributo.instancia;

// O atributo de instância é declarado dentro da classe, mas fora dos métodos,
// construtores ou blocos. Ele pertence a cada objeto criado a partir da classe.
// Isso significa que cada objeto possui sua própria cópia desse atributo.
// Exemplo: em uma classe Aluno, cada aluno pode ter seu próprio nome, idade e
// matrícula. Esses dados variam de objeto para objeto.

public class AlunoInstancia {
    String nome;
    int idade;

    public void exibirDados () {
        System.out.println(nome);
        System.out.println(idade);
    }

    public static void main(String[] args) {
        AlunoInstancia alunoInstancia1 = new AlunoInstancia();
        alunoInstancia1.nome = "Ana";
        alunoInstancia1.idade = 16;

        AlunoInstancia alunoInstancia2 = new AlunoInstancia();
        alunoInstancia2.nome = "Carlos";
        alunoInstancia2.idade = 17;

        alunoInstancia1.exibirDados();
        alunoInstancia2.exibirDados();
    }
}