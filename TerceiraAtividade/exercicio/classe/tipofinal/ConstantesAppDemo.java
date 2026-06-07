package exercicio.classe.tipofinal;

final class ConstantesApp {

    public String mostrarNomeSistema(){
        return "Gerenciamento de Banco";
    }
}

public class ConstantesAppDemo {
    public static void main(String[] args) {
        ConstantesApp constantes = new ConstantesApp();
        System.out.println("Nome do sistema: " + constantes.mostrarNomeSistema());
    }
}
