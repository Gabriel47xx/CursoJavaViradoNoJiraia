package AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.test;

import AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.dominio.*;

public class DataTranferObjectTest01 {
    public static void main(String[] args) {
        AirCraft airCraft = new AirCraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder
                .personBuilder()
                .firstName("GAbriel")
                .lastName("Developer")
                .build();

        ReportDTO reportDTO = ReportDTO.ReportDTOBuilder.aReportDTO()
                .aircraftName(airCraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDTO);

    }
}
