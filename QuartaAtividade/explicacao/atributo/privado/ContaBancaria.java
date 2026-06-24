package explicacao.atributo.privado;

// O atributo private só pode ser acessado dentro da própria classe. Ele é muito usado
// para aplicar encapsulamento, protegendo os dados do objeto contra acessos diretos
// indevidos.
// Normalmente, atributos privados são acessados por métodos públicos chamados
// getters e setters.

public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100);

        System.out.println("Saldo: " + conta.getSaldo());
    }
}
