package exercicio.classe.local;

class Comunicado {
    public void exibir(){
        class Mensagem {
            private String conteudo;

            public Mensagem(String conteudo) {
                this.conteudo = conteudo;
            }
            public void mostrar() {
                System.out.println(conteudo);
            }
        }
        Mensagem mensagem = new Mensagem("Olá, boa noite!");
        mensagem.mostrar();
    }
}

public class ComunicadoDemo {
    public static void main(String[] args) {
        Comunicado comunicado = new Comunicado();
        comunicado.exibir();
    }
}
