package exercicios;

public class desafio {
    public static void main(String[] args) {
        System.out.println("Digite a data: ");
        int data = new java.util.Scanner(System.in).nextInt();

        int d = data / 1000000;
        int m = (data / 10000) % 100;
        int a = data % 10000;

        int dias = 0;
        for(int y=1990; y<a; y++) dias += (y%4==0 && y%100!=0 || y%400==0) ? 366 : 365;

        int[] dm = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if((a%4==0 && a%100!=0) || a%400==0) dm[2]=29;
        for(int i=1; i<m; i++) dias += dm[i];
        dias += d - 1;

        int diaSemana = dias % 7;

        if(diaSemana==0) System.out.println("Este dia caiu em uma segunda");
        else if(diaSemana==1) System.out.println("Este dia caiu em uma terça");
        else if(diaSemana==2) System.out.println("Este dia caiu em uma quarta");
        else if(diaSemana==3) System.out.println("Este dia caiu em uma quinta");
        else if(diaSemana==4) System.out.println("Este dia caiu em uma sexta");
        else if(diaSemana==5) System.out.println("Este dia caiu em um sábado");
        else System.out.println("Este dia caiu em um domingo");
    }
}
