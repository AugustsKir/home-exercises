package io.codelex.classesandobjects.practice.Exercise2Cars;

import java.util.Scanner;


public class LitersPerKilometer {
    public static void main(String[] args) {
        Car car = getData();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter mileage");
        double mileage = in.nextDouble();
        System.out.println("Enter liters");
        double liters = in.nextDouble();
        car.fillUp(mileage, liters);


        System.out.println("KM/L + " + car.calculateConsumption());


    }

    private static Car getData() {
        Scanner scan = new Scanner(System.in);

        double startKilometers;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();


        return new Car(startKilometers);
    }

}



