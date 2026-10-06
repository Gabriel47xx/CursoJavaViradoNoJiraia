package AulasJava.AulasJava.JavaCore.BintroducaoMetodos.Dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprimirEstudante(){
        System.out.println("-------------------------");

        System.out.println(this.nome);
        System.out.println(this.sexo);
        System.out.println(this.idade);

    }

}
