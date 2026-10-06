package AulasJava.AulasJava.JavaCore.Hheranca.teste;

import AulasJava.AulasJava.JavaCore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {
    //Ordem de inicializacao:
//0 - Bloco de inicializacao estático da SUPER CLASSE é executado quando a JVM carregar a classe PAI;
//1 - Bloco de inicializacao estático da SUPER CLASSE é executado quando a JVM carregar a classe FILHA;
//2 - Alocado o espaco em memoria para o objeto da classe PAI;
//3 - Cada atributo de classe e inicializado com valores defaut ou o que for passado da classe PAI;
//4 - O Bloco de inicializacao da SUPER CLASSE é executado na ordem em que aparece;
//5 - O Cunstrutor da SUPER CLASSE é executado;
//6 - Alocado o espaco em memoria para o objeto da SUBCLASSE;
//7 - Cada atributo da SUBCLASSE e inicializado com valores defaut ou o que for passado ;
//8 - O Bloco de inicializacao da SUBCLASSE é executado na ordem em que aparece;
//9 - O Cunstrutor da SUBCLASSE é executado;
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Paulo");
    }
}
