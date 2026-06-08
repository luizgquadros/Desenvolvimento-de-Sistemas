package exercicio.classe.anonima;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable tarefa = new Runnable() {
            @Override
            public void run() {
                System.out.println("Tarefa executada por uma classe anônima através do Runnable.");
            }
        };

        tarefa.run();
    }
}