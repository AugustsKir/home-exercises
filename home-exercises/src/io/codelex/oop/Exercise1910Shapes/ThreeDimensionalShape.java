package io.codelex.oop.Exercise1910Shapes;

abstract public class ThreeDimensionalShape extends Shape {
    public ThreeDimensionalShape(int numSides) {
        super(numSides);
    }

    @Override
    abstract public int getArea();

    @Override
    abstract public int getPerimeter();
    abstract public int calculateVolume();
}
