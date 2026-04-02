package exercicios;

public class ex16 {
    public static void main(String[] args) {
        System.out.println("Digite o tamanho da matriz quadrada: ");
        int tam = new java.util.Scanner(System.in).nextInt();

        int[][] m = new int[tam][tam];
        System.out.println("Digite os " + (tam*tam) + " elementos: ");
        for(int i = 0; i < tam; i++) {
            for(int j = 0; j < tam; j++) {
                m[i][j] = new java.util.Scanner(System.in).nextInt();
            }
        }
        System.out.println("Diagonal secundária: ");
        for(int i = 0; i < tam; i++) {
            System.out.println(m[i][tam-1-i]);
        }
    }
}
