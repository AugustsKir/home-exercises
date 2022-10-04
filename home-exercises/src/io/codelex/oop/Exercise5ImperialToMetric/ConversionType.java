package io.codelex.oop.Exercise5ImperialToMetric;


public enum ConversionType {
    METERS_TO_YARDS(1.09),
    YARDS_TO_METERS(0.91),
    CENTIMETERS_TO_INCHES(0.39),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETRES_TO_MILES(0.62),
    MILES_TO_KILOMETRES(1.6);

    private final double num;

    ConversionType(double num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }

}
