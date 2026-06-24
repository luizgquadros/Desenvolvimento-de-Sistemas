package explicacao.atributo.protegido;

// O atributo protected pode ser acessado pela própria classe, por classes do mesmo
// pacote e por subclasses. Ele é comum em situações de herança.

class Animal {
    protected String nome;
}

class Cachorro extends Animal {
    public void latir(){
        nome = "Rex";
        System.out.println(nome + " está latindo.");
    }
}

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.latir();
    }
}