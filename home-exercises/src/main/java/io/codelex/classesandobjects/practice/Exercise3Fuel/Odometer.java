package io.codelex.classesandobjects.practice.Exercise3Fuel;

public class Odometer {
    private final int MAX_MILEAGE = 999999;
    private int mileage;
    private int startMileage;
    private FuelGauge fuelGauge;


    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Odometer(int mileage, FuelGauge fuelGauge) {
        this.startMileage = mileage;
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    public void odoUp() {
        if (mileage < MAX_MILEAGE) {
            mileage++;
        } else {
            mileage = 0;
        }
        int driven = startMileage - mileage;
        if (driven % 10 == 0) {
            fuelGauge.burnFuel();
        }
    }


}
