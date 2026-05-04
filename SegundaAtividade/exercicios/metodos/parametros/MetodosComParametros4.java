package exercicios.metodos.parametros;

public class MetodosComParametros4 {
    public void imprimirNumero(String resultado) {
        int a = -10;
        if(a > 0) {
            System.out.println("O número é positivo!");
        }else{
            System.out.println("O número é negativo!");
        }
    }
    public static void main(String[] args) {
        MetodosComParametros4 msg = new MetodosComParametros4();
        msg.imprimirNumero("");
    }
}
