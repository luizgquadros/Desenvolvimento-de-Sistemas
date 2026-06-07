package exercicio.classe.abstrata;

import java.util.Scanner;

abstract class Transporte {
    public abstract void mover();
}

class Carro extends Transporte {

    @Override
    public void mover() {
        System.out.println("O carro está se movendo!");
    }
}

public class TransporteDemo {

    public static void main(String[] args) {
        Transporte carro = new Carro();
        carro.mover();
    }
}