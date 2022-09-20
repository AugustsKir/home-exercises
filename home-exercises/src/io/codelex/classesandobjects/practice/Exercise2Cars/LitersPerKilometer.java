package io.codelex.classesandobjects.practice.Exercise2Cars;

import java.util.Scanner;


public class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car = new Car(startKilometers, endKilometers, liters);

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car2 = new Car(startKilometers, endKilometers, liters);


        System.out.println("Kilometers per liter are " + car.CalculateConsumption() + " and " + car2.CalculateConsumption());
        System.out.println("Car number 1 is an economic car: " + car.isEconomyCar());
        System.out.println("Car number 1 is a gashog: " + car.isGasHog());
        System.out.println("Car number 2 is an economic car: " + car2.isEconomyCar());
        System.out.println("Car number 2 is a gashog: " + car2.isGasHog());
    }

}



