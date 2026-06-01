package explicacao.classe.sealed;

sealed class Veiculo permits Carro, Moto {
    public void mover() {
        System.out.println("O veicúlo está em moviemnto.");
    }
}

final class Carro extends Veiculo {
    public void abrirPortaMalas(){
        System.out.println("Posta-malas aberto.");
    }
}

final class Moto extends Veiculo {
    public void empinar() {
        System.out.println("A moto empinou com segurançna no evento didático");
    }
}

public class SealedDemo {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.mover();
        c.abrirPortaMalas();

        Moto m = new Moto();
        m.mover();
        m.empinar();
    }
}
