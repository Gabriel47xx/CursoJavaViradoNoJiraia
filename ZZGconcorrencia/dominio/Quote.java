package AulasJava.AulasJava.JavaCore.ZZGconcorrencia.dominio;

public final class Quote {
    private final String store;
    private final double price;
    private final Discount.Code discountcode;

    public Quote(String store, double price, Discount.Code discountcode) {
        this.store = store;
        this.price = price;
        this.discountcode = discountcode;
    }

    /**
     * Creates new QUOTE object from the value following the patter storeName:price:discountCode
     * @param value containing storeName:price:discountCode
     * @return new Quote with values from @param value
     */
    public static Quote newQuote(String value){
        String[] values = value.split(":");
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));


    }

}
