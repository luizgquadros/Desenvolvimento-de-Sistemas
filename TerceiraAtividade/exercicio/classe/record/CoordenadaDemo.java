package exercicio.classe.record;

record Coordenada (int x, int y) {
}

public class CoordenadaDemo {
    public static void main(String[] args) {
        // objeto record
        Coordenada coordenada = new Coordenada(10, 2);

        System.out.println("X: " + coordenada.x());
        System.out.println("Y: " + coordenada.y());
        System.out.println(coordenada);
    }
}
