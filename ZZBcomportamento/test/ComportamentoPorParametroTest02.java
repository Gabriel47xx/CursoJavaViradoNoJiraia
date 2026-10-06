package AulasJava.AulasJava.JavaCore.ZZBcomportamento.test;

import AulasJava.AulasJava.JavaCore.ZZBcomportamento.Dominio.Car;
import AulasJava.AulasJava.JavaCore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(
            new Car("green", 2001),
            new Car("black", 1988),
            new Car("red", 2019));
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }


    public static void main(String[] args) {



        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        System.out.println(redCars);


    }
}

