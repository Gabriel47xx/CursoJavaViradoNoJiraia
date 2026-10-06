package AulasJava.AulasJava.JavaCore.Zgenerics.test;

import javax.sound.midi.Soundbank;
import java.nio.channels.GatheringByteChannel;
import java.util.ArrayList;

abstract class Animal{
    public abstract void consulta();
}
class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando Doguinho");

    }
}
class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
}
public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);

    }
    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

    }

}
