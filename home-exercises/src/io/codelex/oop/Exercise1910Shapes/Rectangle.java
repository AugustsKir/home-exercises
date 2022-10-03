package io.codelex.oop.Exercise1910Shapes;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int numSides, int height, int width) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    @Override
    public int getArea() {
        return(this.height * this.width);
    }

    @Override
    public int getPerimeter() {
        return( 2 * (this.height + this.width));
    }
}
