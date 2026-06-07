package exercicio.classe.abstrata;

import java.util.Scanner;

abstract class FiguraGeometrica {
    public abstract void calcularArea();
}

class Quadrado extends FiguraGeometrica {

    @Override
    public void calcularArea() {
        System.out.println("A área do quadrado é: " + 5 * 5);
    }
}

public class FiguraGeometricaDemo {

    public static void main(String[] args) {
        FiguraGeometrica quadrado = new Quadrado();
        quadrado.calcularArea();
    }
}