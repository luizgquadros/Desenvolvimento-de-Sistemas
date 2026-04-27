package exercicios.metodos.parametros;

public class MetodosComParametros1 {
    public void imprimirMensagem(String nome) {
        System.out.println(nome);
    }
    public static void main(String[] args) {
        MetodosComParametros1 imp = new MetodosComParametros1();
        imp.imprimirMensagem("Olá, boa tarde!");
    }
}