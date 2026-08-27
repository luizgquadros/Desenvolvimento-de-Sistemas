package heranca;

public class TesteHerancaExercicioDois {
    public static void main(String[] args) {
        EstudanteHeranca aluno = new EstudanteHeranca("Luiz", 17, "20267");

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}