package io.codelex.classesandobjects.practice.Exercise2Cars;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startKilometers, double endKilometers, double liters) {
        this.startKilometers = startKilometers;
        this.endKilometers = endKilometers;
        this.liters = liters;
    }

    public double CalculateConsumption() {
        return liters / ((endKilometers - startKilometers) / 100);
    }

    public boolean isGasHog() {
        return CalculateConsumption() > 15;
    }

    public boolean isEconomyCar() {
        return CalculateConsumption() < 15;
    }


}
