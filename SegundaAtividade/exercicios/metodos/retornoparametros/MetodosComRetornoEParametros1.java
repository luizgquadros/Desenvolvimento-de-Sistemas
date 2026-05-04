package exercicios.metodos.retornoparametros;

public class MetodosComRetornoEParametros1 {
    public int multiplicar(int x, int y) {
        return x * y;
    }
    public static void main(String[] args) {
        MetodosComRetornoEParametros1 calc = new MetodosComRetornoEParametros1();
        int resultado = calc.multiplicar(10, 10);
        System.out.println("Resultado: " + resultado);
    }
}
