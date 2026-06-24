package explicacao.atributo.transiente;

// O atributo transient é ignorado durante a serialização de objetos. Ele é usado quando
// não queremos salvar determinado dado em arquivo ou transmissão.
// Exemplo comum: senha, token, dado temporário ou informação sensível.

import java.io.Serializable;

public class Usuario implements Serializable{
    String nome;
    transient String senha;

    public Usuario (String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public static void main(String[] args) {
        Usuario u = new Usuario("Ana", "123456");

        System.out.println("Nome: " + u.nome);
        System.out.println("Senha: " + u.senha);
    }
}
