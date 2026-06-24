package explicacao.atributo.volatil;

// O atributo volatile é usado em programação concorrente, quando várias threads
// podem acessar a mesma variável. Ele indica que o valor deve ser lido diretamente da
// memória principal, ajudando na visibilidade entre threads.

public class ControleThread {
    private volatile boolean executando = true;

    public void parar(){
        executando = false;
    }

    public void executar(){
        while (executando){
            System.out.println("Executando...");
            break;
        }
    }

    public static void main(String[] args) {
        ControleThread controle = new ControleThread();
        controle.executar();
        controle.parar();
    }
}


