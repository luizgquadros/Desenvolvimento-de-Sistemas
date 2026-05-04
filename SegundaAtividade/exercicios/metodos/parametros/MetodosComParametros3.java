package exercicios.metodos.parametros;

public class MetodosComParametros3 {
    public void imprimirMensagem(String nome) {
        System.out.println(nome);
    }
    public static void main(String[] args) {
        MetodosComParametros3 imp = new MetodosComParametros3();
        imp.imprimirMensagem("Luiz Gustavo");
        imp.imprimirMensagem("17 anos");
    }
}
