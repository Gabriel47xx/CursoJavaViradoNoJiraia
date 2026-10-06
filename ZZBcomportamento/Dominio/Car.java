package AulasJava.AulasJava.JavaCore.ZZBcomportamento.Dominio;

public class Car {
    private String nome = "Audi";
    private String color;
    private int year;

    @Override
    public String toString() {
        return "Car{" +
                "nome='" + nome + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public String getNome() {
        return nome;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
