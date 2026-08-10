package encapsulamento;

public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome) {
        this.nome = nome;
        this.nota = 0.0;
    }

    public String getNome(){
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota (double nota) {
        if (nota >= 0 && nota <= 10){
            this.nota = nota;
            System.out.println("Nota atualizada para: " + this.nota);
        } else {
            System.out.println("Nota inválida. Deve ser entre 0 e 10.");
        }
    }
}
