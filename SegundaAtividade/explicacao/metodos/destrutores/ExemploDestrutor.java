package explicacao.metodos.destrutores;

public class ExemploDestrutor {
    protected void finalize() {
        System.out.println("Objeto está sendo removido pelo Garbage Collector");
    }
    public static void main(String[] args) {
        ExemploDestrutor exemplo = new ExemploDestrutor();
        exemplo = null; // torna objeto disponível para remoção
        System.gc(); // sugere execução do Garbage Collector
    }
}