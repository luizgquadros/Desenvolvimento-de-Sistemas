package exercicio.classe.interna;

class Casa {
    private String endereco;

    public Casa(String endereco) {
        this.endereco = endereco;
    }

    class Quarto {
        private String tipo;

        public Quarto(String tipo) {
            this.tipo = tipo;
        }

        public void mostrarDados(){
            System.out.println("Endereço da casa: " + endereco);
            System.out.println("Tipo do quarto: " + tipo);
        }
    }
}

public class CasaDemo {
    public static void main(String[] args) {
        Casa casa = new Casa("R. Giovanni Gronchi, 1046");
        Casa.Quarto quarto = casa.new Quarto("Casal");
        quarto.mostrarDados();
    }
}
