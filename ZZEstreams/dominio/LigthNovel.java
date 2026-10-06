package AulasJava.AulasJava.JavaCore.ZZEstreams.dominio;

public class LigthNovel {
    private String title;
    private Double price;
    private Category category;

    public LigthNovel(String title, Double price) {
        this.title = title;
        this.price = price;

    }

    public LigthNovel(String title, Double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "LigthNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
