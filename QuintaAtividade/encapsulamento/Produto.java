package encapsulamento;

public class Produto {
    private String nome;
    private double preco;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if (nome != null && !nome.isEmpty()){
            this.nome = nome;
        }else {
            System.out.println("Nome inválido.");
        }
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco (double preco){
        if (preco >= 0){
            this.preco = preco;
        }else {
            System.out.println("Preço não pode ser negativo.");
        }
    }
}
