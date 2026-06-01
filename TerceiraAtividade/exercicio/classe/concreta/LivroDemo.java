package exercicio.classe.concreta;

//classe concreta: pode ser instanciada diretamente
class Livro {
    //atributos da classe
    private String autor;
    private String titulo;

    //construtor para inicializar os atributos
    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    //metodo que exibe os dados do projeto
    public void mostrarDados() {
        System.out.println("Autor: " + autor + ", Titulo: " + titulo);
    }
}

// classe principal com metodo main
public class LivroDemo {
    public static void main(String[] args) {
        // objeto da classe concreta
        Livro p = new Livro("William Shakespeare", "Romeu e Julieta");
        p.mostrarDados();
    }
}
