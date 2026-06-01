package exercicio.classe.concreta;

//classe concreta: pode ser instanciada diretamente
class Conta {
    //atributos da classe
    private String numero;
    private double saldo;

    //construtor para inicializar os atributos
    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    //metodo que exibe os dados do projeto
    public void depositar() {
        System.out.println("Número: " + numero + ", Saldo: " + saldo);
    }
}

// classe principal com metodo main
public class ContaDemo {
    public static void main(String[] args) {
        // objeto da classe concreta
        Conta p = new Conta("1", 156.72);
        p.depositar();
    }
}
