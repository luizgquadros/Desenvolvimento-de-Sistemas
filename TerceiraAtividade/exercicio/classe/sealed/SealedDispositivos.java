package exercicio.classe.sealed;

sealed class Dispositivo permits Notebook, Tablet {
    public void ligar() {
        System.out.println("O dispositivo está ligando");
    }
}

final class Notebook extends Dispositivo {
    public void abrirTecladoFisico() {
        System.out.println("Pronto para digitação");
    }
}

final class Tablet extends Dispositivo {
    public void ativarModoToque() {
        System.out.println("Tela de toque ativada");
    }
}

public class SealedDispositivos {
    public static void main(String[] args) {
        Notebook note = new Notebook();
        note.ligar();
        note.abrirTecladoFisico();

        Tablet tab = new Tablet();
        tab.ligar();
        tab.ativarModoToque();
    }
}