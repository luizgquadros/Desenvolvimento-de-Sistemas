package explicacao.metodos.construtores;

public class Aluno {
    String nome;
    // Método construtor
    public Aluno(String nome) {
        this.nome = nome;
    }
    public void exibirAluno() {
        System.out.println("Aluno: " + nome);
    }
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Pedro");
        aluno.exibirAluno();
    }
}
