package exercicio.classe.tipofinal;

final class ValidadorCPF {

    public String validar(){
        return "CPF validado!";
    }
}

public class ValidadorCPFDemo {
    public static void main(String[] args) {
        ValidadorCPF validador = new ValidadorCPF();
        System.out.println("CPF: 521.870.424-49, " + validador.validar());
    }
}
