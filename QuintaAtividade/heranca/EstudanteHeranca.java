package heranca;

public class EstudanteHeranca extends PessoaHeranca {
    private String matricula;

    public EstudanteHeranca (String nome, int idade, String matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula (){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}
