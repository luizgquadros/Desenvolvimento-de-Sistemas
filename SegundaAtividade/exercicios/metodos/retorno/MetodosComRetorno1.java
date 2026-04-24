package exercicios.metodos.retorno;

public class MetodosComRetorno1 {
    public String anoAtual() {
        return "2026";
    }
    public static void main(String[] args) {
        MetodosComRetorno1 ano = new MetodosComRetorno1();
        System.out.println("Ano atual: " + ano.anoAtual());
    }
}
