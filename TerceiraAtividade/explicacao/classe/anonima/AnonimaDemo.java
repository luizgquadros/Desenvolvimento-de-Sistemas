package explicacao.classe.anonima;

interface  Saudacao {
    void mostrarMensagem();
}

public class AnonimaDemo {
    public static void main(String[] args) {
        // classe anonima implementando a interface Saudacao
        Saudacao s = new Saudacao() {
            @Override
            public void mostrarMensagem() {
                System.out.println("Olá! Esta mensagem vem de uma classe anônima.");
            }
        };
        // chamando o metodo da classe anonima
        s.mostrarMensagem();
    }
}
