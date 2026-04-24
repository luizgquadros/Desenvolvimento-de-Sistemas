package exercicios.metodos.parametros;

public class MetodosComParametros2 {
    public void imprimirMensagem(String resultado) {
        int a = 10;
        int b = 10;
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        MetodosComParametros2 msg = new MetodosComParametros2();
        msg.imprimirMensagem("");
    }
}
