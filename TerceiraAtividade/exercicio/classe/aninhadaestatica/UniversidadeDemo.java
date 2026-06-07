package exercicio.classe.aninhadaestatica;

class Universidade {

    static class Curso{
        private String nome;

        public Curso(String nome) {
            this.nome = nome;
        }
        public void mostrar () {
            System.out.println("Curso: " + nome);
        }
    }
}

public class UniversidadeDemo {
    public static void main(String[] args) {
        Universidade.Curso curso = new Universidade.Curso("Desenvolvimento de Sistemas");
        curso.mostrar();
    }
}