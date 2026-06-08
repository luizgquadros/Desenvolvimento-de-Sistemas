package exercicio.classe.sealed;

sealed class Forma permits Circulo, Quadrado {
    public void desenhar() {
        System.out.println("Desenhando a forma.");
    }
}

final class Circulo extends Forma {
    public void calcularRaio() {
        System.out.println("Calculando raio.");
    }
}

final class Quadrado extends Forma {
    public void calcularArea() {
        System.out.println("Calculando area do quadrado.");
    }
}

public class SealedForma {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.desenhar();
        c.calcularRaio();

        Quadrado q = new Quadrado();
        q.desenhar();
        q.calcularArea();
    }
}