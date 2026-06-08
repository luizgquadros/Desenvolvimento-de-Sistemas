package exercicio.classe.sealed;

sealed class Midia permits LivroDigital, Video {
    public void reproduzir() {
        System.out.println("A mídia está sendo carregada.");
    }
}

final class LivroDigital extends Midia {
    public void abrirPagina() {
        System.out.println("Página do livro aberta.");
    }
}

final class Video extends Midia {
    public void alterarResolucao() {
        System.out.println("Resolução do vídeo alterada para 1080p.");
    }
}

public class SealedMidia {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital();
        livro.reproduzir();
        livro.abrirPagina();

        Video video = new Video();
        video.reproduzir();
        video.alterarResolucao();
    }
}