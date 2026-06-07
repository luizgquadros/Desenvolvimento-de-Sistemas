package exercicio.classe.local;

class Exibidor {
    public void exibir(){
        class Etiqueta {
            private String titulo;

            public Etiqueta(String titulo) {
                this.titulo = titulo;
            }
            public void mostrar() {
                System.out.println("Produto: " + titulo);
            }
        }
        Etiqueta etiqueta = new Etiqueta("Notebook");
        etiqueta.mostrar();
    }
}

public class ExibidorDemo {
    public static void main(String[] args) {
        Exibidor exibidor = new Exibidor();
        exibidor.exibir();
    }
}
