package exercicios;

public class ex13 {
    public static void main(String[] args) {
        System.out.println("Digite o valor de x: ");
        int x = new java.util.Scanner(System.in).nextInt();

        System.out.println("Digite o valor de y: ");
        int y = new java.util.Scanner(System.in).nextInt();

        int potencia = 1;
        for(int i = 1; i <= y; i++) {
            potencia *= x;
        }
        System.out.println("Resultado: " + potencia);
    }
}
