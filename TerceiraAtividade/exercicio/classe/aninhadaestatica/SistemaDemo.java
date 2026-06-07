package exercicio.classe.aninhadaestatica;

class Sistema {

    static class Log{
        private String mensagem;

        public Log(String mensagem) {
            this.mensagem = mensagem;
        }
        public void mostrar () {
            // Log é um registro de atividades do sistema,
            // tipo um "diário" que anota o que aconteceu no programa.
            System.out.println("Log: " + mensagem);
        }
    }
}

public class SistemaDemo {
    public static void main(String[] args) {
        Sistema.Log log = new Sistema.Log("Usuário Luiz_Quadros08 fez login!");
        log.mostrar();
    }
}