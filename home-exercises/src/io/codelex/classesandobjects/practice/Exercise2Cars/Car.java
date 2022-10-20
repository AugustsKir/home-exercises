package io.codelex.classesandobjects.practice.Exercise2Cars;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startKilometers, double endKilometers, double liters) {
        this.startKilometers = startKilometers;
        this.endKilometers = startKilometers;
        this.liters = 0;

    }

    public Car(double startKilometers) {
    }

    public double calculateConsumption() {
        return liters / ((endKilometers - startKilometers) / 100);
    }

    public boolean isGasHog() {
        return calculateConsumption() > 15;
    }

    public boolean isEconomyCar() {
        return calculateConsumption() < 15;
    }


    public void fillUp(double mileage, double liters) {
        endKilometers = mileage;
        this.liters = liters;
    }
}
