package exercicio.classe.sealed;

sealed class UsuarioSistema permits Administrador, Cliente {
    public void fazerLogin() {
        System.out.println("Usuário autenticado no sistema.");
    }
}

final class Administrador extends UsuarioSistema {
    public void gerenciarUsuarios() {
        System.out.println("Painel de gerenciamento aberto.");
    }
}

final class Cliente extends UsuarioSistema {
    public void realizarCompra() {
        System.out.println("Pedido enviado para o carrinho.");
    }
}

public class SealedUsuarioSistema {
    public static void main(String[] args) {
        Administrador admin = new Administrador();
        admin.fazerLogin();
        admin.gerenciarUsuarios();

        Cliente cliente = new Cliente();
        cliente.fazerLogin();
        cliente.realizarCompra();
    }
}