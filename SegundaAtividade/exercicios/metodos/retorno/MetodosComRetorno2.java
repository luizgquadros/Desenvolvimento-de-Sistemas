package exercicios.metodos.retorno;

public class MetodosComRetorno2 {
    public String nomeCompleto() {
        return "Luiz Gustavo Nogueira de Quadros";
    }
    public static void main(String[] args) {
        MetodosComRetorno2 nome = new MetodosComRetorno2();
        System.out.println("Meu nome completo: " + nome.nomeCompleto());
    }
}
