package exercicios;

public class ex12 {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        int numero = new java.util.Scanner(System.in).nextInt();
        long fatorial = 1;
        for(int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("Resultado: " + fatorial);
    }
}
