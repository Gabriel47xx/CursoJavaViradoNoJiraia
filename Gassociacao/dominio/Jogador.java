package AulasJava.AulasJava.JavaCore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;
    private Time[] times;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome:" + this.nome);
        if(time != null){
            for (Time time : times) {
                System.out.println("Nome time" + time.getNome());

            }
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}


