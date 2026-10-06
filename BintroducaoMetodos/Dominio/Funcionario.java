package AulasJava.AulasJava.JavaCore.BintroducaoMetodos.Dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;
    public double media;

    public void ImprimirDados() {
        System.out.println(nome);
        System.out.println(idade);
        for (double salario : salarios) {
            System.out.println(salario);
        }
    }

    public void MediaSalario() {
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media salarial " + media);

    }
}
