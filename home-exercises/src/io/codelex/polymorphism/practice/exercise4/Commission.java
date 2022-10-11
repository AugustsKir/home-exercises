package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double sales = 0;
    private double commRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.sales = sales;
        this.commRate = commRate;
    }
    public void addSales(double sum) {
        sales += sum;
    }

    @Override
    public double pay() {
        double finalPay = super.pay() + commRate * sales;
        sales = 0;
        return finalPay;
    }

    @Override
    public String toString() {
        return super.toString() + " " + pay();
    }

    @Override
    public void addHours(int moreHours) {
        super.addHours(moreHours);
    }
}
