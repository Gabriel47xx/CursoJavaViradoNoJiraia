package AulasJava.AulasJava.JavaCore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estatico de Funcionario ");
    }
    {
        System.out.println("Dentro do bloco de inicialização o de Funcionario 01 ");

    }
    {
        System.out.println("Dentro do bloco de inicialização o de Funcionario 02 ");

    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario ");

    }


    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }
    public void relatorioPag(){
        System.out.println("---------Relatório de pagamento--------");
        System.out.println("Eu " + this.nome + "recebi o salario de: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
