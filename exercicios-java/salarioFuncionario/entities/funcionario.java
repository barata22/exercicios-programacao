package salarioFuncionario.entities;

public class funcionario {
    private Integer id;
    private Double salario;
    private String nome;

    public funcionario(){}

    public funcionario(int id, double salario, String nome){
        this.id = id;
        this.salario = salario;
        this.nome = nome;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String toString(){
        return this.id + ", " + nome + ", " + salario;
    }
}
