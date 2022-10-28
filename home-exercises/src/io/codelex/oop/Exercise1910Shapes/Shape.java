package io.codelex.oop.Exercise1910Shapes;

public abstract class Shape {
    private final int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract int getArea();

    public abstract int getPerimeter();


}
