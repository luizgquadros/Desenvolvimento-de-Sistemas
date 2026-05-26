package explicacao.classe.tipoenum;

// Enum class: conjunto fixo de constantes
enum StatusPedido {
    PENDENTE,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE
}

public class EnumDemo {
    public static void main(String[] args) {
        // variavel do tipo enum
        StatusPedido status = StatusPedido.PROCESSANDO;

        //exibindo valor escolhido
        System.out.println("Status atual: " + status);
    }
}
