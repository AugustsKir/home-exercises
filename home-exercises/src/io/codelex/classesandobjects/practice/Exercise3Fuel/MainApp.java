package io.codelex.classesandobjects.practice.Exercise3Fuel;

public class MainApp {
    public static void main(String[] args) {
        FuelGauge fuel = new FuelGauge(0);
        Odometer odometer = new Odometer(0, fuel);
        for (int i = 0; i < FuelGauge.MAX_FUEL ; i++) {
            fuel.fillUp();
        }
        while (fuel.getCurrentFuel() > 0) {
            odometer.odoUp();
            System.out.println("Fuel left: " + fuel.getCurrentFuel() + " Current mileage: " + odometer.getMileage());
            ;
        }

    }
}
