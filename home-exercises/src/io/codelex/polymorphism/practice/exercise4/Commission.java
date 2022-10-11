package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double sales;
    private final double commRate;
    private int hoursWorked;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        sales = 0;
        hoursWorked = 0;
        this.commRate = commRate;
    }

    public void addSales(double sum) {
        sales += sum;
    }

    @Override
    public double pay() {
        double finalPay = super.payRate * hoursWorked + commRate * sales;
        sales = 0;
        return finalPay;
    }

    @Override
    public String toString() {
        return super.toString() + " " + pay();
    }

    @Override
    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }
}
