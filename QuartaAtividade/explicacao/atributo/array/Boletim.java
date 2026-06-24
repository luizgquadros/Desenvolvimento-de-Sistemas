package explicacao.atributo.array;

// Arrays em Java são objetos criados dinamicamente e podem ser atribuídos a variáveis
// do tipo Object, segundo a especificação da linguagem.

public class Boletim {
    double[] notas = {8.0, 7.5, 9.0};

    public void exibirNotas(){
        for (double nota: notas){
            System.out.println("Nota: " + nota);
        }
    }

    public static void main(String[] args) {
        Boletim b = new Boletim();
        b.exibirNotas();
    }
}
