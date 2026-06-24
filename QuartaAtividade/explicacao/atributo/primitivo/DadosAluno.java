package explicacao.atributo.primitivo;

// Atributos primitivos armazenam valores simples. Java possui oito tipos primitivos:
// byte, short, int, long, float, double, char e boolean. A linguagem Java é estaticamente
// tipada, ou seja, toda variável possui um tipo conhecido em tempo de compilação.

public class DadosAluno {
    int idade = 16;
    double media = 8.5;
    char turma = 'A';
    boolean aprovado = true;

    public static void main(String[] args) {
        DadosAluno aluno = new DadosAluno();

        System.out.println(aluno.idade);
        System.out.println(aluno.media);
        System.out.println(aluno.turma);
        System.out.println(aluno.aprovado);
    }
}
