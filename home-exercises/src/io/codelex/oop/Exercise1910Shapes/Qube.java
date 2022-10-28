package io.codelex.oop.Exercise1910Shapes;

public class Qube extends ThreeDimensionalShape {
    private final int side;

    public Qube(int numSides, int side) {
        super(numSides);
        this.side = side;
    }

    @Override
    public int getArea() {
        return (int) (6 * Math.pow(side, 2));
    }

    @Override
    public int getPerimeter() {
        return 12 * side;
    }

    @Override
    public int calculateVolume() {
        return (int) Math.pow(side, 3);
    }
}
