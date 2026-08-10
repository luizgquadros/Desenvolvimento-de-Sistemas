package encapsulamento;

public class ContaBancaria {
    private double saldo;

    // metodo publico para depositar dinheiro
    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    // metodo publico para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    // metodo publico para consultar o saldo
    public double getSaldo() {
        return saldo;
    }

    // Neste exemplo, o atributo saldo é privado e só pode ser modificado através dos
    // métodos públicos depositar e sacar. Isso garante que o saldo nunca seja alterado
    // de forma inadequada.
}