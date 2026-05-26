package explicacao.classe.record;

record Aluno(String nome, int idade) {
    public Aluno {
        if (idade < 0) {
            throw new IllegalArgumentException ("Idade não pode ser negativa.");
            // IllegalArgumentException: lança erro quando um argumento passado para um metodo é inválido
        }
    }
}

public class RecordDemo {
    public static void main(String[] args) {
        // objeto record
        Aluno a = new Aluno("Marina", 18);

        System.out.println("Nome: " + a.nome());
        System.out.println("Idade: " + a.idade());
        System.out.println(a);
    }
}
