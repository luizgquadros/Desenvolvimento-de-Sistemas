package explicacao.classes.concretas;

class Pessoa {
    //atributos da classe
    private String nome;
    private int idade;

    //construtor para inicializar os atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //metodo que exibe os dados do projeto
    public void apresentar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}


public class PessoaDemo {
    public static void main(String[] args) {
        //criando objeto da classe concreta
        Pessoa p = new Pessoa("Ana", 17);
        p.apresentar();
    }
}
