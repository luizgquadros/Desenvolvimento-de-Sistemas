package exercicio.classe.concreta;

//classe concreta: pode ser instanciada diretamente
class Aluno {
    //atributos da classe
    private String nome;
    private int nota;

    //construtor para inicializar os atributos
    public Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    //metodo que exibe os dados do projeto
    public void mostrarResultado() {
        System.out.println("Nome: " + nome + ", Nota: " + nota);
    }
}

// classe principal com metodo main
public class AlunoDemo {
    public static void main(String[] args) {
        // objeto da classe concreta
        Aluno p = new Aluno("Luiz", 10);
        p.mostrarResultado();
    }
}
