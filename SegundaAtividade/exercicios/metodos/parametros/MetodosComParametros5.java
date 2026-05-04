package exercicios.metodos.parametros;

public class MetodosComParametros5 {
    public void imprimirMensagem(String nome) {
        System.out.println("Olá " + nome + " Boas vindas!");
    }
    public static void main(String[] args) {
        MetodosComParametros5 imp = new MetodosComParametros5();
        imp.imprimirMensagem("Luiz Gustavo");
    }
}
