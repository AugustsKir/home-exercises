package io.codelex.oop.Exercise1Shapes;

public class MainApp {
    public static void main(String[] args) {
        Rectangle test = new Rectangle(4, 5, 10);
        System.out.println(test.getNumSides());
        System.out.println(test.getArea());
        System.out.println(test.getPerimeter());
        Triangle test1 = new Triangle(3, 5, 10);
        System.out.println(test1.getNumSides());
        System.out.println(test1.getArea());
        System.out.println(test1.getPerimeter());

    }
}
