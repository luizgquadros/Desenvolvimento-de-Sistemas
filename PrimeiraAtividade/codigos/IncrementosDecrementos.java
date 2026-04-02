package codigos;

public class IncrementosDecrementos {
    public static void main(String[] args) {
        int a = 30;
        int b = 30;
        System.out.println(a + " " + (a++) + " " + a);
        //o valor será primeiro apresentado na tela e somente depois será incrementado.

        System.out.println(b + " " + (++b) + " " + b);
        //o valor será primeiro incrementado e depois apresentado na tela.
    }
}
