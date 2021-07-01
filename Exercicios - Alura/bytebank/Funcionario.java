public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(){

    }

    public double getBonificacao() {
        return this.salario*0.1;
    }

    public String getNome(){
        return nome;
    }
    public String setNome(String nome){
        return this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }
    public String setCpf(String cpf){
        return this.cpf = cpf;
    }

    public double getSalario(){
        return salario;
    }
    public double setSalario(double salario){
        return this.salario = salario;
    }

}
