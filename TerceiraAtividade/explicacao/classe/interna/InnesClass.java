package explicacao.classe.interna;

class Computador {
    private String marca;

    public Computador(String marca) {
        this.marca = marca;
    }
    // classe interna: depende de um objeto computador
    class Processador {
        private String modelo;

        public Processador(String modelo) {
            this.modelo = modelo;
        }

        public void mostrarDados(){
            // a classe interna pode accesar atributos da classe externa
            System.out.println("Marca do computador: " + marca);
            System.out.println("Modelo do computador: " + modelo);
        }
    }
}

public class InnesClass {
    public static void main(String[] args) {
        // criando objeto externo
        Computador pc = new Computador("Dell");

        // criando objeto da classe interna associado ao objeto externo
        Computador.Processador proc = pc.new Processador("Intel i5");
        proc.mostrarDados();
    }
}
