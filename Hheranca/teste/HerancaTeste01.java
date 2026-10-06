package AulasJava.AulasJava.JavaCore.Hheranca.teste;

import AulasJava.AulasJava.JavaCore.Hheranca.dominio.Endereco;
import AulasJava.AulasJava.JavaCore.Hheranca.dominio.Funcionario;
import AulasJava.AulasJava.JavaCore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 03");
        endereco.setCep("01023121");
        Pessoa pessoa = new Pessoa("Power Guido");
        pessoa.setCpf("6666");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("POpo ");
        funcionario.setCpf("2222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
        funcionario.relatorioPag();


    }
}
