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

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        if (autor != null && !autor.isEmpty()){
            this.autor = autor;
        }else {
            System.out.println("Autor inválido.");
        }
    }

    public int getNumeroPaginas (){
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas){
        if (numeroPaginas > 0){
            this.numeroPaginas = numeroPaginas;
        }else {
            System.out.println("Número de páginas deve ser de positivo.");
        }
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if (preco >= 0){
            this.preco = preco;
        }else {
            System.out.println("Preço não pode ser negativo");
        }
    }
}