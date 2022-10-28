package io.codelex.oop.Exercise6Parcel;

public class ParcelApp {
    public static void main(String[] args) {
        Parcel test = new Parcel(15, 30, 30, 25.0F, true);
        System.out.println(test.validate());
    }
}
