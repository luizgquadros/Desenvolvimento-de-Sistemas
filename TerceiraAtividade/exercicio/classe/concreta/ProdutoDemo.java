package exercicio.classe.concreta;

//classe concreta: pode ser instanciada diretamente
class Produto {
    //atributos da classe
    private String nome;
    private double preco;

    //construtor para inicializar os atributos
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //metodo que exibe os dados do projeto
    public void exibirPreco() {
        System.out.println("Nome: " + nome + ", Preço: " + preco);
    }
}

// classe principal com metodo main
public class ProdutoDemo {
    public static void main(String[] args) {
        // objeto da classe concreta
        Produto p = new Produto("Arroz Camil 5kg", 25.99);
        p.exibirPreco();
    }
}
