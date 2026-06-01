package exercicio.classe.concreta;

//classe concreta: pode ser instanciada diretamente
class Carro {
    //atributos da classe
    private String marca;
    private String modelo;

    //construtor para inicializar os atributos
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //metodo que exibe os dados do projeto
    public void exibir() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

// classe principal com metodo main
public class CarroDemo {
    public static void main(String[] args) {
        // objeto da classe concreta
        Carro p = new Carro("Volkswagen", "Jetta GLI");
        p.exibir();
    }
}
