package codigos;

public class VerificandoNumero {
    public static void main(String[] args) {
        System.out.println("Entre com um valor para x: ");
        int x = new java.util.Scanner(System.in).nextInt();
        if (x >= 1 && x <= 1000){
            System.out.println("O número ESTÁ compreendido entre 1 e 1000");
        }else
            System.out.println("O número NÃO ESTÁ compreendido entre 1 e 1000");
    }
}
