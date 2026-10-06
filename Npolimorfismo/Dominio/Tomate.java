package AulasJava.AulasJava.JavaCore.Npolimorfismo.Dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @java.lang.Override
    public double calcularImposto() {
            System.out.println("Calculando imposto do Tomate");
            return this.valor * IMPOSTO_POR_CENTO;
    }

    private String DataVal;



    public java.lang.String getDataVal() {
        return DataVal;
    }

    public void setDataVal(java.lang.String dataVal) {
        DataVal = dataVal;


    }
}
