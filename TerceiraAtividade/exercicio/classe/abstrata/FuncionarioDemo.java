package exercicio.classe.abstrata;


abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void mostrarNome() {
        System.out.println("Funcionário: " + nome);
    }

    public abstract double calcularBonus();
}

class FuncionarioCLT extends Funcionario {
    private double salarioBase;

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    // OVERRIDE: É QUANDO UMA CLASSSE FILHA REDEFINE UM
    // METODO HERDADO DA CLASSE PAI USANDO A MESMA ASSINATURA.
    @Override
    public double calcularBonus() {
        return salarioBase;
    }
}

public class FuncionarioDemo {
    public static void main(String[] args) {
        Funcionario f = new FuncionarioCLT("Luiz", 500);
        f.mostrarNome();
        System.out.println("Bônus: R$" + f.calcularBonus());
    }
}