package exercicio.classe.aninhadaestatica;

class EmpresaTI {

    static class Setor{
        private String nome;

        public Setor(String nome) {
            this.nome = nome;
        }
        public void mostrar () {
            System.out.println("Setor: " + nome);
        }
    }
}

public class EmpresaTIDemo {
    public static void main(String[] args) {
        EmpresaTI.Setor setor = new EmpresaTI.Setor("Design");
        setor.mostrar();
    }
}