package exercicio.classe.tipoenum;

// Enum class: conjunto fixo de constantes
enum NivelAcesso {
    USUARIO,
    MODERADOR,
    ADMINISTRADOR
}

public class NivelAcessoDemo {
    public static void main(String[] args) {
        // variavel do tipo enum
        NivelAcesso nivelAcesso = NivelAcesso.MODERADOR;

        //exibindo valor escolhido
        System.out.println("Nível de acesso: " + nivelAcesso);
    }
}
