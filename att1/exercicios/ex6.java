package exercicios;

public class ex6 {
    public static void main(String[] args) {
        System.out.println("Primeiro valor do ponto 1: ");
        int x1 = new java.util.Scanner(System.in).nextInt();

        System.out.println("Segundo valor do ponto 1: ");
        int y1 = new java.util.Scanner(System.in).nextInt();

        System.out.println("Primeiro valor do ponto 2: ");
        int x2 = new java.util.Scanner(System.in).nextInt();

        System.out.println("Segundo valor do ponto 2: ");
        int y2 = new java.util.Scanner(System.in).nextInt();

        System.out.println("Ponto 1: " + "(" + x1 + ","  + y1 + ")" );
        System.out.println("Ponto 2: " + "(" + x2 + ","  + y2 + ")" );

        int d = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        System.out.println("Distância: " + d);
    }
}
