package exercicio.classe.tipofinal;

final class RelogioSistema {

    public String mostrarHora(){
        return "16h40";
    }
}

public class RelogioSistemaDemo {
    public static void main(String[] args) {
        RelogioSistema relogio = new RelogioSistema();
        System.out.println("Horário: " + relogio.mostrarHora());
    }
}
