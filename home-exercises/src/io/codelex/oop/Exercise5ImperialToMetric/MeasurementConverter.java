package io.codelex.oop.Exercise5ImperialToMetric;

public class MeasurementConverter {
    public static double converter(int value, ConversionType conversionType) {
        return value * conversionType.getNum();
    }

}
