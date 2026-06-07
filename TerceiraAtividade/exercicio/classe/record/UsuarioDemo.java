package exercicio.classe.record;

record Usuario (String login, String email) {
}

public class UsuarioDemo {
    public static void main(String[] args) {
        // objeto record
        Usuario usuario = new Usuario("Luiz_Quadros", "luizgustavoquadros00@gmail.com");

        System.out.println("Login: " + usuario.login());
        System.out.println("E-mail: " + usuario.email());
        System.out.println(usuario);
    }
}
