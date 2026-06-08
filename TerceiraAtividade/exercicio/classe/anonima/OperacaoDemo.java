package exercicio.classe.anonima;

interface Operacao {
    int calcular(int a, int b);
}

public class OperacaoDemo {
    public static void main(String[] args) {
        Operacao soma = new Operacao() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };

        int resultado = soma.calcular(20, 30);
        System.out.println("Resultado da soma: " + resultado);
    }
}