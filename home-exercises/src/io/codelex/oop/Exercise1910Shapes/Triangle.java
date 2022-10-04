package io.codelex.oop.Exercise1910Shapes;

public class Triangle extends Shape {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int height;

    public Triangle(int numSides, int sideA, int sideB, int sideC, int height) {
        super(numSides);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public int getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public int getArea() {
        return (height * sideB) / 2;
    }
}
