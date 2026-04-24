package exercicios.metodos.retorno;

public class MetodosComRetorno3 {
    public String numeroFixo() {
        return "100";
    }
    public static void main(String[] args) {
        MetodosComRetorno3 numero = new MetodosComRetorno3();
        System.out.println("Número: " + numero.numeroFixo());
    }
}
