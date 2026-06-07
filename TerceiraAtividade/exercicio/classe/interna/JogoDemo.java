package exercicio.classe.interna;

class Jogo {
    private String partida;

    public Jogo(String partida) {
        this.partida = partida;
    }

    class Jogador {
        private String destaque;

        public Jogador(String destaque) {
            this.destaque = destaque;
        }

        public void mostrarDados(){
            System.out.println("Partida: " + partida);
            System.out.println("Jogador destaque: " + destaque);
        }
    }
}

public class JogoDemo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Brasil 2 X 0 Alemanha, Final Copa do Mundo 2002");
        Jogo.Jogador jogador = jogo.new Jogador("Ronaldo Fenômeno");
        jogador.mostrarDados();
    }
}