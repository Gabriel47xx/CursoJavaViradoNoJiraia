package AulasJava.AulasJava.JavaCore.ZZBcomportamento.test;

import AulasJava.AulasJava.JavaCore.ZZBcomportamento.Dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(
            new Car("green", 2001),
            new Car("black", 1988),
            new Car("red", 2019));


    private static List<Car> filtarCarByColor(List<Car> cars, String color) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }
    private static List<Car> filtarAgeCar(List<Car> cars, int year) {
        List<Car> ageCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                ageCars.add(car);
            }
        }
        return ageCars;
    }

    public static void main(String[] args) {
        System.out.println(filtarCarByColor(cars, "red"));
        System.out.println("------------------------------");
        System.out.println(filtarAgeCar(cars, 2020));



    }
}

