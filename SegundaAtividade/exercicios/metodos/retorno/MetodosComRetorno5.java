package exercicios.metodos.retorno;

public class MetodosComRetorno5 {
    public String numeroPi() {
        return "3.14159";
    }
    public static void main(String[] args) {
        MetodosComRetorno5 numero = new MetodosComRetorno5();
        System.out.println("Número de PI: " + numero.numeroPi());
    }
}
