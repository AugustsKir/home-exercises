package io.codelex.oop.Exercise1910Shapes;

public class Hexagon extends Shape {
    private int side;

    public Hexagon(int numSides, int side) {
        super(numSides);
        side = this.side;
    }


    @Override
    public int getArea() {
        return (int) ((int) ((3 * Math.sqrt(3)) / 2) * Math.pow(this.side, 2));
    }

    @Override
    public int getPerimeter() {
        return 6 * this.side;
    }
}
