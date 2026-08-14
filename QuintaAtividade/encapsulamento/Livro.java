package encapsulamento;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private double preco;

    public Livro (String titulo, String autor, int numeroPaginas, double preco){
        this.titulo = titulo;
        this.autor = autor;
        setNumeroPaginas(numeroPaginas);
        setPreco(preco);
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        if (titulo != null && !titulo.isEmpty()){
            this.titulo = titulo;
        }else {
            System.out.println("Título inválido.");
        }
    }
}