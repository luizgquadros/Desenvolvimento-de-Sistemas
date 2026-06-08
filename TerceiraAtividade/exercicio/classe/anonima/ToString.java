package exercicio.classe.anonima;

class Produto {
    public String obterNome() {
        return "Calça Chrome Hearts";
    }
}

public class ToString {
    public static void main(String[] args) {
        Produto produtoCustomizado = new Produto() {
            @Override
            public String toString() {
                return "Exibindo: " + obterNome() + " (Modificado por classe anônima)";
            }
        };

        System.out.println(produtoCustomizado.toString());
    }
}