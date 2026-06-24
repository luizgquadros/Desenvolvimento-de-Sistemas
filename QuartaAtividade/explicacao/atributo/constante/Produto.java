package explicacao.atributo.constante;

// Um atributo declarado com final só pode receber valor uma vez. Depois de inicializado,
// não pode ser alterado. Segundo a especificação da linguagem Java, campos de classe
// e de instância podem ser declarados como final.

public class Produto {
    final String codigo;

    public Produto(String codigo) {
        this.codigo = codigo;
    }

    public static void main(String[] args) {
        Produto p = new Produto("P001");
        System.out.println("Código: " + p.codigo);

        //p.codigo = "P002"; //Erro: não pode alterar atributo final
    }
}
