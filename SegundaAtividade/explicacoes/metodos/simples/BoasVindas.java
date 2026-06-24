package explicacoes.metodos.simples;

public class BoasVindas {
    public void exibirSaudacao() {
        System.out.println("Seja bem-vindo à aula de Java!");
    }

    public static void main(String[] args) {
        BoasVindas mensagem = new BoasVindas();
        mensagem.exibirSaudacao();
    }
}