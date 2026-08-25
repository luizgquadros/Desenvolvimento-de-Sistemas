package encapsulamento;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;

    public Funcionario(String nome, String departamento, double salario){
        setNome(nome);
        setDepartamento(departamento);
        setSalario(salario);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if (nome != null && !nome.isEmpty()){
            this.nome = nome;
        }else {
            System.out.println("Nome inválido");
        }
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        if (departamento != null && !departamento.isEmpty()){
            this.departamento = departamento;
        }else {
            System.out.println("Departamento inválido");
        }
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if (salario >= 0){
            this.salario = salario;
        }else {
            System.out.println("Sálario não pode ser negativo");
        }
    }
}