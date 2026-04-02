package exercicios;

public class ex5 {
    public static void main(String[] args) {
        System.out.println("Velocidade em km/h: ");
        int velocidade = new java.util.Scanner(System.in).nextInt();

        System.out.println("Tempo de viagem: ");
        int viagem = new java.util.Scanner(System.in).nextInt();

        System.out.println("Distância percorrida em km: " +  velocidade * viagem);
    }
}
