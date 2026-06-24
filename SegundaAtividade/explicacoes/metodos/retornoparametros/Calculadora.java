package explicacoes.metodos.retornoparametros;

public class Calculadora {
    public int multiplicar(int x, int y) {
        return x * y;
    }
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(4, 5);
        System.out.println("Resultado: " + resultado);
    }
}