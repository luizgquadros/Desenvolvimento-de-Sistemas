package explicacao.atributo.constantedeclasse;

// Quando usamos static final, criamos uma constante pertencente à classe. Esse tipo
// de atributo é muito usado para valores fixos, como taxa de juros, limite máximo, nome
// de sistema ou valor matemático.
// Por convenção, constantes em Java são escritas com letras maiúsculas e palavras
// separadas por underline.

public class Matematica {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        double raio = 5;
        double area = PI * raio * raio;

        System.out.println("Área do círculo: " + area);
    }
}