package codigos;

public class OperadorNegacao {
    public static void main(String[] args) {
        boolean x = true;
        if (!x) {
            System.out.println("X é falso");
        }else{
            System.out.println("X é verdadeiro");
        }

        if (x){
            System.out.println("X é verdadeiro");
        }else {
            System.out.println("X é falso");
        }
    }
}
