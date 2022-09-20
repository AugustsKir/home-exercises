package io.codelex.classesandobjects.practice.Exercise3Fuel;

public class FuelGauge {
    private double currentFuel;
    static final int MAX_FUEL = 70;

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }

    public FuelGauge(double currentFuel) {
        this.currentFuel = currentFuel;
    }
    public void fillUp() {
        if(currentFuel < MAX_FUEL) {
            currentFuel++;
        } else {
            System.out.println("Tank is Full!");
        }

    }
    public void burnFuel() {
        if (currentFuel > 0) {
            currentFuel--;
        } else {
            System.out.println("No fuel left!");
        }
    }
}
