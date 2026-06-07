package exercicio.classe.abstrata;

abstract class Pagamento {
    public abstract void processar();
}

class PagamentoCartao extends Pagamento {

    @Override
    public void processar() {
        System.out.println("Processando pagamento . . .");
    }
}

public class PagamentoDemo {

    public static void main(String[] args) {
        Pagamento pagamento = new PagamentoCartao();
        pagamento.processar();
    }
}