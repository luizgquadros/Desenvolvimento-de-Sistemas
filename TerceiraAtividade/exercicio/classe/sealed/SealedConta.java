package exercicio.classe.sealed;

sealed class Conta permits ContaCorrente, ContaPoupanca {
    public void exibirSaldo() {
        System.out.println("Exibindo saldo da conta");
    }
}

final class ContaCorrente extends Conta {
    public void usarChequeEspecial() {
        System.out.println("Cheque especial consultado");
    }
}

final class ContaPoupanca extends Conta {
    public void calcularRendimento() {
        System.out.println("Rendimento mensal atualizado");
    }
}

public class SealedConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.exibirSaldo();
        cc.usarChequeEspecial();

        ContaPoupanca cp = new ContaPoupanca();
        cp.exibirSaldo();
        cp.calcularRendimento();
    }
}