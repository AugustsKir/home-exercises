package io.codelex.oop.Exercise1910Shapes;

public class MainApp {
    public static void main(String[] args) {
        Rectangle test = new Rectangle(4, 5, 10);
        System.out.println(test.getNumSides());
        System.out.println(test.getArea());
        System.out.println(test.getPerimeter());
        Triangle test1 = new Triangle(3, 5, 10, 5, 4);
        System.out.println(test1.getNumSides());
        System.out.println(test1.getArea());
        System.out.println(test1.getPerimeter());
        Cone test2 = new Cone(1, 4, 5);
        System.out.println(test2.getArea());
        System.out.println(test2.getPerimeter());
        System.out.println(test2.calculateVolume());
        Hexagon test3 = new Hexagon(6, 3);
        System.out.println(test3.getArea());
        System.out.println(test3.getPerimeter());
        Qube test4 = new Qube(6, 4);
        System.out.println(test4.getArea());
        System.out.println(test4.getPerimeter());
        System.out.println(test4.calculateVolume());

    }
}
