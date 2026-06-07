package exercicio.classe.record;

record Filme (String nome, int ano) {
    public Filme {
        if (ano < 0) {
            throw new IllegalArgumentException ("Ano não pode ser negativo.");
            // IllegalArgumentException: lança erro quando um argumento passado para um metodo é inválido
        }
    }
}

public class FilmeDemo {
    public static void main(String[] args) {
        // objeto record
        Filme filme = new Filme("Batman: O Cavaleiro das Trevas", 2008);

        System.out.println("Nome: " + filme.nome());
        System.out.println("Ano de lançamento: " + filme.ano());
        System.out.println(filme);
    }
}
