package exercicio.classe.abstrata;

abstract class Animal {
    public abstract void emitirSom();
}

class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Cachorro: Au Au");
    }
}

public class AnimalDemo {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.emitirSom();
    }
}