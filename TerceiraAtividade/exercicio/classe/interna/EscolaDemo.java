package exercicio.classe.interna;

class Escola {
    private String nome;

    public Escola(String nome) {
        this.nome = nome;
    }

    class Turma {
        private String serie;

        public Turma(String serie) {
            this.serie = serie;
        }

        public void mostrarDados(){
            System.out.println("Nome da escola: " + nome);
            System.out.println("Turma com melhor frequência: " + serie);
        }
    }
}

public class EscolaDemo {
    public static void main(String[] args) {
        Escola escola = new Escola("Etec Uirapuru");
        Escola.Turma turma = escola.new Turma("2º Desenvolvimento de Sistemas");
        turma.mostrarDados();
    }
}
