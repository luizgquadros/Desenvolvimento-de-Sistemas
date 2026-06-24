package explicacao.atributo.padrao;

// Quando não usamos public, private ou protected, o atributo possui acesso padrão,
// também chamado de package-private. Ele pode ser acessado por classes do mesmo
// pacote.

class Curso {
    String nomeCurso;

    void exibirCurso(){
        System.out.println("Curso: " + nomeCurso);
    }
}

public class TesteCurso {
    public static void main(String[] args) {
        Curso c = new Curso();
        c.nomeCurso = "Desenvolvimento de Sistemas";
        c.exibirCurso();
    }
}
