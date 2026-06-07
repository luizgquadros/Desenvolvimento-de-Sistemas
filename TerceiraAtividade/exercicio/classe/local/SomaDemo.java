package exercicio.classe.local;

class Soma {
    public void somar(){
        class Calculadora {
            private int a;
            private int b;

            public Calculadora(int a, int b) {
                this.a = a;
                this.b = b;
            }
            public void mostrar() {
                System.out.println("Resultado soma: " + (a + b));
            }
        }
        Calculadora calculadora = new Calculadora(10, 10);
        calculadora.mostrar();
    }
}

public class SomaDemo {
    public static void main(String[] args) {
        Soma soma = new Soma();
        soma.somar();
    }
}
