package exercicios;

public class ex9 {
    public static void main(String[] args) {
        System.out.println("Digite o valor do lado A: ");
        int a = new java.util.Scanner(System.in).nextInt();

        System.out.println("Digite o valor do lado B: ");
        int b = new java.util.Scanner(System.in).nextInt();

        System.out.println("Digite o valor do lado C: ");
        int c = new java.util.Scanner(System.in).nextInt();

        if(a == b && b == c) {
            System.out.println("É um triângulo equilátero");
        } else if(a == b || b == c || a == c) {
            System.out.println("É um triângulo isósceles");
        } else {
            System.out.println("É um triângulo escaleno");
        }
    }
}
