package io.codelex.oop.Exercise1Shapes;

public abstract class Shape {
    private int numSides;

    public int getNumSides() {
        return numSides;
    }

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public abstract int getArea();
    public abstract int getPerimeter();


}
