package exercicio.classe.record;

record Cidade (String nome, String estado) {
}

public class CidadeDemo {
    public static void main(String[] args) {
        // objeto record
        Cidade cidade = new Cidade("Santo André", "SP");

        System.out.println("Nome: " + cidade.nome());
        System.out.println("Estado: " + cidade.estado());
        System.out.println(cidade);
    }
}
