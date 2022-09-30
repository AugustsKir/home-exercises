package io.codelex.oop.Exercise3Cars;

import java.time.LocalDate;

public class CarApp {
    public static void main(String[] args) {
        Car test1 = new Car("Ford", LocalDate.of(1920, 12, 11), "USA", "Focus", 19999, LocalDate.of(2010, 12, 11), EngineType.V6);
        Car test2 = new Car("Ferrari", LocalDate.of(1940, 12, 11), "Italy", "LaFerrari", 299999, LocalDate.of(2012, 11, 10), EngineType.V12);
        CarService.addCar(test1);
        CarService.addCar(test2);
        System.out.println(CarService.listDescending());

    }
}
