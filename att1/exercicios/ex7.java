package exercicios;

public class ex7 {
    public static void main(String[] args) {
        System.out.println("Valor A: ");
        int a = new java.util.Scanner(System.in).nextInt();

        System.out.println("Valor B: ");
        int b = new java.util.Scanner(System.in).nextInt();

        if(a > b){
            System.out.println("Maior " + a);
        }else{
            System.out.println("Maior: " + b);
        }
    }
}