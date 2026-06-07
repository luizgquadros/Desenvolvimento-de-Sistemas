package exercicio.classe.tipoenum;

// Enum class: conjunto fixo de constantes
enum MesAno {
    JANEIRO,
    FEVEREIRO,
    MARCO
}

public class MesAnoDemo {
    public static void main(String[] args) {
        // variavel do tipo enum
        MesAno mesAno = MesAno.JANEIRO;

        //exibindo valor escolhido
        System.out.println("Estamos no mês de:  " + mesAno);
    }
}
