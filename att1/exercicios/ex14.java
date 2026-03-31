package exercicios;

public class ex14 {
    public static void main(String[] args) {
        int quantidadeNumerosPrimos = 0;
        for (int i = 1; i <= 1000; i++){
            System.out.println(i + " É primo?");
            int numeroDivisores = 0;
            int j = 1;
            while (j <= i){
                if (i % j == 0){
                    numeroDivisores++;
                }
                j++;
            }
            if (numeroDivisores == 2){
                quantidadeNumerosPrimos++;
                System.out.println("É número primo");
            }else{
                System.out.println("Não é número primo");
            }
        }
        System.out.println("Quantidade de números primos: " + quantidadeNumerosPrimos);
    }
}
