package explicacao.classe.finall;

// classe final: nao pode ser estenddida
final class UtilitarioMatematica {
    // metodo simples de soma
    public int somar(int a, int b){
        return a + b;
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        // criando objeto normalmente
        UtilitarioMatematica u = new UtilitarioMatematica();
        System.out.println("Soma: " + u.somar(10,5));
    }
}
