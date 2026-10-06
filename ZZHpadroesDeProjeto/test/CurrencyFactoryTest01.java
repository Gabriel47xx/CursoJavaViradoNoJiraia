package AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.test;

import AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.dominio.Country;
import AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.dominio.Currency;
import AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
