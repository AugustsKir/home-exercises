package io.codelex.oop.Exercise1Shapes;

public class Triangle extends Shape {
    private int width;
    private int height;

    public Triangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getPerimeter() {
        return(this.height * 2 + this.width);
    }

    @Override
    public int getArea() {
        return((this.height * this.width) / 2);
    }
}
