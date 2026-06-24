package explicacao.atributo.enumm;

// Um atributo do tipo enum armazena um conjunto fixo de valores possíveis. É útil
// quando queremos limitar as opções válidas.

enum SituacaoAluno {
    APROVADO, RECUPERACAO, REPROVADO
}

public class Resultado {
    SituacaoAluno situacao;

    public Resultado (SituacaoAluno situacao){
        this.situacao = situacao;
    }

    public static void main(String[] args) {
        Resultado r = new Resultado(SituacaoAluno.APROVADO);

        System.out.println("Situação: " + r.situacao);
    }
}
