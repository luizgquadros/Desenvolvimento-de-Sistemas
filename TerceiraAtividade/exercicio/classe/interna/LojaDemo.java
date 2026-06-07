package exercicio.classe.interna;

class Loja {
    private String nome;

    public Loja(String nome) {
        this.nome = nome;
    }

    class Caixa {
        private String funcionario;

        public Caixa(String funcionario) {
            this.funcionario = funcionario;
        }

        public void mostrarDados(){
            System.out.println("Nome da loja: " + nome);
            System.out.println("Funcionário responsável pelo caixa: " + funcionario);
        }
    }
}

public class LojaDemo {
    public static void main(String[] args) {
        Loja loja = new Loja("Papelaria Dois Irmãos");
        Loja.Caixa caixa = loja.new Caixa("Rodrigo Muniz");
        caixa.mostrarDados();
    }
}