package exercicio.classe.aninhadaestatica;

class Aplicativo {

    static class Versao{
        private String nome;

        public Versao(String nome) {
            this.nome = nome;
        }
        public void mostrar () {
            System.out.println("Versão: " + nome);
        }
    }
}

public class AplicativoDemo {
    public static void main(String[] args) {
        Aplicativo.Versao versao = new Aplicativo.Versao("Android 14.0");
        versao.mostrar();
    }
}