package exercicio.classe.tipoenum;

// Enum class: conjunto fixo de constantes
enum CorSemaforo {
    VERDE,
    AMARELO,
    VERMELHO
}

public class CorSemaforoDemo {
    public static void main(String[] args) {
        // variavel do tipo enum
        CorSemaforo corSemaforo = CorSemaforo.AMARELO;

        //exibindo valor escolhido
        System.out.println("Atenção! O faról está:  " + corSemaforo);
    }
}
