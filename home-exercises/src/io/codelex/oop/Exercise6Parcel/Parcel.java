package io.codelex.oop.Exercise6Parcel;

public class Parcel implements Validatable {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public boolean isExpress() {
        return isExpress;
    }


    @Override
    public boolean validate() {
        if (xLength + zLength + yLength <= 300 && xLength <= 30 && yLength <= 30 && zLength <= 30) {
            if (isExpress() && weight < 30.0) {
                return true;
            } else if (!isExpress() && weight < 15.0) {
                return true;
            } else throw new IllegalArgumentException("Weight is not correct for the package!");
        } else throw new IllegalArgumentException("Package does not match our criteria!");
    }
}
