package explicacao.atributo.publico;

// O atributo public pode ser acessado diretamente por qualquer classe. Embora seja
// permitido, seu uso deve ser cuidadoso, pois pode quebrar o encapsulamento.
// Em programação orientada a objetos, normalmente preferimos atributos private e
// métodos de acesso.

public class Pessoa {
    public String nome;

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Mariana";

        System.out.println("Nome: " + p.nome);
    }
}
