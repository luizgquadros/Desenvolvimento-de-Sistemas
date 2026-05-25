package explicacao.classe.abstrata;

// class abstrata: serve de modelo para subclasses
abstract class Funcionario {
    // atributo protegido para ser reutilizado nas subclasses
    protected String nome;

    // construtor da classe abstrata
    public Funcionario(String nome) {
        this.nome = nome;
    }

    // metodo concreto: já possui implementação
    public void mostrarNome() {
        System.out.println("Funcionário: " + nome);
    }
    // metodo abstrato: cada subclasse deve implementar
    public abstract double calcularSalario();
}
    // subclasse concreta que implementa o metodo abstrato
    class FuncionarioCLT extends Funcionario {
        private double salarioBase;

        public FuncionarioCLT(String nome, double salarioBase) {
            super(nome);
            this.salarioBase = salarioBase;
        }

        // Override é quando uma classe filha redefine um metodo herdado da classe pai usando a mesma assinatura.
        @Override
        public double calcularSalario() {
            return salarioBase;
        }
    }

public class FuncionarioDemo {
    public static void main(String[] args) {
        // nao é possivel fazer: new Funcionario
        Funcionario f = new FuncionarioCLT("Carlos", 3500.0);
        f.mostrarNome();
        System.out.println("Salário: R$" + f.calcularSalario());
        }
    }