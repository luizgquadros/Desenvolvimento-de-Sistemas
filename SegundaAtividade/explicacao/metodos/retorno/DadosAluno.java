package explicacao.metodos.retorno;

public class DadosAluno {
    public String nomeAluno() {
        return "Maria Silva";
    }
    public static void main(String[] args) {
        DadosAluno aluno = new DadosAluno();
        System.out.println("Nome do aluno: " + aluno.nomeAluno());
    }
}