package AulasJava.AulasJava.JavaCore.BintroducaoMetodos.Teste;

import AulasJava.AulasJava.JavaCore.BintroducaoMetodos.Dominio.Funcionario;

public class ExercicioFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        funcionario01.nome = "Gabriel";
        funcionario01.idade=23;
        funcionario01.salarios = new double[]{2000};

        funcionario02.nome = "Laila";
        funcionario02.idade=25;
        funcionario02.salarios =new double[]{2000};

        funcionario03.nome = "Sabrina";
        funcionario03.idade=27;
        funcionario03.salarios = new double[]{3000};

        funcionario01.ImprimirDados();
        System.out.println("-------------------");
        funcionario02.ImprimirDados();
        System.out.println("-------------------");
        funcionario03.ImprimirDados();
        System.out.println("-------------------");




    }
}
