package exercicio.classe.record;

record Produto (String nome, double preco) {
    public Produto {
        if (preco < 0) {
            throw new IllegalArgumentException ("Preço não pode ser negativo.");
            // IllegalArgumentException: lança erro quando um argumento passado para um metodo é inválido
        }
    }
}

public class ProdutoDemo {
    public static void main(String[] args) {
        // objeto record
        Produto produto = new Produto("Leite Integral", 15.99);

        System.out.println("Produto: " + produto.nome());
        System.out.println("Preço: R$" + produto.preco());
        System.out.println(produto);
    }
}
