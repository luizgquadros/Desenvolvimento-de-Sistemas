package exercicio.classe.aninhadaestatica;

class Biblioteca {

    static class Categoria{
        private String nome;

        public Categoria(String nome) {
            this.nome = nome;
        }
        public void mostrar () {
            System.out.println("Categoria: " + nome);
        }
    }
}

public class BibliotecaDemo {
    public static void main(String[] args) {
        Biblioteca.Categoria categoria = new Biblioteca.Categoria("Romance");
        categoria.mostrar();
    }
}