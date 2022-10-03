package io.codelex.oop.Exercise1910Shapes;

public class Cone extends ThreeDimensionalShape {
    private final int radius;
    private final int height;
    public Cone(int numSides, int radius, int height) {
        super(numSides);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))));
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public int calculateVolume() {
        return (int) ((Math.PI * Math.pow(radius, 2)) / (height / 3));
    }
}
