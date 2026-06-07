package exercicio.classe.tipoenum;

// Enum class: conjunto fixo de constantes
enum DiaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
}

public class DiaSemanaDemo {
    public static void main(String[] args) {
        // variavel do tipo enum
        DiaSemana diaSemana = DiaSemana.QUARTA;

        //exibindo valor escolhido
        System.out.println("Dia da semana: " + diaSemana);
    }
}
