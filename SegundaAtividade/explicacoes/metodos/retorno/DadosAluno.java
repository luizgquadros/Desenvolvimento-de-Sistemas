package explicacoes.metodos.retorno;

public class DadosAluno {
    public String nomeAluno() {
        return "100";
    }
    public static void main(String[] args) {
        DadosAluno aluno = new DadosAluno();
        System.out.println("Nome do aluno: " + aluno.nomeAluno());
    }
}