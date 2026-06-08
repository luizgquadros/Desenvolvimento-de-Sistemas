package exercicio.classe.anonima;

interface Impressao {
    void imprimir();
}

public class ImpressaoDemo {
    public static void main(String[] args) {
        Impressao impressora = new Impressao() {
            @Override
            public void imprimir() {
                System.out.println("Imprimindo documento por classe anônima");
            }
        };

        impressora.imprimir();
    }
}