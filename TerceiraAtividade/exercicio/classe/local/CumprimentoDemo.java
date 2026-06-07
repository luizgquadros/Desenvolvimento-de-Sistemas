package exercicio.classe.local;

class Cumprimento {
    public void cumprimentar(){
        class Saudacao {
            private String usuario;

            public Saudacao(String usuario) {
                this.usuario = usuario;
            }
            public void mostrar() {
                System.out.println("Olá " + usuario + ", Seja muito bem vindo!");
            }
        }
        Saudacao saudacao = new Saudacao("Luiz Quadros");
        saudacao.mostrar();
    }
}

public class CumprimentoDemo {
    public static void main(String[] args) {
        Cumprimento cumprimento = new Cumprimento();
        cumprimento.cumprimentar();
    }
}
