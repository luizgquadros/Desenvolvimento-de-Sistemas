package exercicio.classe.interna;

class Banco {
    private String nome;

    public Banco(String nome) {
        this.nome = nome;
    }

    class Agencia {
        private String numero;

        public Agencia(String numero) {
            this.numero = numero;
        }

        public void mostrarDados(){
            System.out.println("Nome do banco: " + nome);
            System.out.println("Agencia: " + numero);
        }
    }
}

public class BancoDemo {
    public static void main(String[] args) {
        Banco banco = new Banco("Bradesco");
        Banco.Agencia agencia = banco.new Agencia("0001");
        agencia.mostrarDados();
    }
}