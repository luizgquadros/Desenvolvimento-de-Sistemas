package exercicios;

public class ex8 {
    public static void main(String[] args) {
        System.out.println("Valor A: ");
        int a = new java.util.Scanner(System.in).nextInt();

        System.out.println("Valor B: ");
        int b = new java.util.Scanner(System.in).nextInt();

        int maior = (a > b) ? a : b;
        System.out.println("Maior: " + maior);
    }
}
