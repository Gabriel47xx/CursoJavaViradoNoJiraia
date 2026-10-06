package AulasJava.AulasJava.JavaCore.FmodificadorEstatico.Domain;

//Ordem de inicializacao:
//0 - Bloco de inicializacao é executado quando a JVM carregar a classe;
//1 - Alocado o espaco em memoria para o objeto;
//2 - Cada atributo de classe e inicializado com valores defaut ou o que for passado;
//3 - O Bloco de inicializacao é executado;
//4 - O Cunstrutor é executado;


public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
            System.out.print(episodios[i] + " ");

        }

    }

    public Anime(){

    }


    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
