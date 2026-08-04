package abstracao;

// Código_5.8: Classe TestaFormaInterfaces em Java

public class TestaFormaInterfaces {
    public static void main(String[] args) {
        FormaInterfaces circulo = new CirculoInterfaces(2);
        FormaInterfaces retangulo = new RetanguloInterfaces(3,4);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retangulo: " + retangulo.calcularArea());
    }
}