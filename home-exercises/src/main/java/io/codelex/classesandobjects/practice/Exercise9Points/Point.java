package io.codelex.classesandobjects.practice.Exercise9Points;

public class Point {
    private int p1;
    private int p2;

    @Override
    public String toString() {
        return "Point{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public Point(int p1, int p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public static void swapPoints(Point p1) {
        int temp = p1.getP1();
        p1.setP1(p1.getP2());
        p1.setP2(temp);

    }
}
