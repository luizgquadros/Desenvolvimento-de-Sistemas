package exercicio.classe.tipofinal;

final class ConfiguracaoSistema {

    public String mostrarVersao(){
        return "2.3.7";
    }
}

public class ConfiguracaoSistemaDemo {
    public static void main(String[] args) {
        ConfiguracaoSistema config = new ConfiguracaoSistema();
        System.out.println("Versão do sistema: " + config.mostrarVersao());
    }
}
