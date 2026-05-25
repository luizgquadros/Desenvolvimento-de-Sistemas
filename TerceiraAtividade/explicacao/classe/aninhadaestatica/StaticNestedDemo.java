package explicacao.classe.aninhadaestatica;

class Empresa {
    // classe aninhada estatica: nao depende de instancia da classe externa
    static class Departamento {
        private String nome;

        public Departamento(String nome) {
            this.nome = nome;
        }
        public void mostrar () {
            System.out.println("Departamento " + nome);
        }
    }
}

public class StaticNestedDemo {
    public static void main(String[] args) {
        // a classe aninhada estatica pode ser crida sem objeto externo
        Empresa.Departamento d = new Empresa.Departamento("Financeiro");
        d.mostrar();
    }
}
