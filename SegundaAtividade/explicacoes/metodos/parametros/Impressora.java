package explicacoes.metodos.parametros;

public class Impressora {
    public void imprimirNome(String nome) {
        System.out.println("Nome recebido: " + nome);
    }
    public static void main(String[] args) {
        Impressora imp = new Impressora();
        imp.imprimirNome("João");
    }
}