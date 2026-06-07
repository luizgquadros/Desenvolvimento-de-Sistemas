package exercicio.classe.local;

class Positivo {
    public void verificar(){
        class Validador {
            private int a;

            public Validador(int a) {
                this.a = a;
            }
            public void mostrar() {
                if (a > 0){
                    System.out.println("É um número positivo!");
                }else {
                    System.out.println("Não é um número positivo!");
                }
            }
        }
        Validador validador = new Validador(10);
        validador.mostrar();
    }
}

public class PositivoDemo {
    public static void main(String[] args) {
        Positivo positivo = new Positivo();
        positivo.verificar();
    }
}