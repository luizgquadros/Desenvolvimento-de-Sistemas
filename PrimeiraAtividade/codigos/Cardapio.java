package codigos;

public class Cardapio {
    public static void main(String[] args) {
        System.out.println("Entre com a opção desejada! ");
        System.out.println("1 - Pratos");
        System.out.println("2 - Bebidas");
        System.out.println("3 - Encerre sua conta");
        int opcao = new java.util.Scanner(System.in).nextInt();
        if (opcao == 1){
            System.out.println("* Hamburguer");
            System.out.println("* Pizza a moda da casa");
            System.out.println("* Batata empanada");
        }else{
            if (opcao == 3){
                System.out.println("Conta encerrada");
            }else{
                System.out.println("Opção invalida");
            }
        }
    }
}
