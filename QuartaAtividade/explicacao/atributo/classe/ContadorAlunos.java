package explicacao.atributo.classe;

// O atributo de classe é declarado com a palavra-chave static. Ele pertence à classe, e
// não a cada objeto individualmente. Todos os objetos compartilham o mesmo valor
// desse atributo. A Oracle explica que campos static são associados à classe e existe
// uma única cópia compartilhada por todas as instâncias.

public class ContadorAlunos {
    String nome;
    static int totalAlunos = 0;

    public ContadorAlunos(String nome) {
        this.nome = nome;
        totalAlunos++;
    }

    public static void main(String[] args) {
        ContadorAlunos a1 = new ContadorAlunos("Ana");
        ContadorAlunos a2 = new ContadorAlunos("Pedro");

        System.out.println("Total de alunos: " + ContadorAlunos.totalAlunos);
    }
}
