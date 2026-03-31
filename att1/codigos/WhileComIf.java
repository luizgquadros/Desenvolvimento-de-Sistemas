package codigos;

import java.util.Scanner;

public class WhileComIf {
    public static void main(String[] args) {
        boolean impar = false;
        while (impar == false){
            System.out.println("Entre com um valor pra x: ");
            int x = new java.util.Scanner(System.in).nextInt();
            if (x % 2 == 0){
                System.out.println("É par!");
            }else{
                impar = true;
                System.out.println("É impar");
            }
        }
    }
}
