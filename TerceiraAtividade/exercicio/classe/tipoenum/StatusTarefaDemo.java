package exercicio.classe.tipoenum;

// Enum class: conjunto fixo de constantes
enum StatusTarefa {
    PENDENTE,
    EM_ANDAMENTO,
    ENVIADA
}

public class StatusTarefaDemo {
    public static void main(String[] args) {
        // variavel do tipo enum
        StatusTarefa statusTarefa = StatusTarefa.EM_ANDAMENTO;

        //exibindo valor escolhido
        System.out.println("Status da tarefa atual: " + statusTarefa);
    }
}
