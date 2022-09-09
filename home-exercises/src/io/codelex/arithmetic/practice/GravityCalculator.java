package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81;  // Earth's gravity in m/s^2

        Scanner iv = new Scanner(System.in);
        System.out.println("Enter the initial velocity!");
        double initialVelocity = iv.nextDouble();
        Scanner ft = new Scanner(System.in);
        System.out.println("Enter the falling time!");
        double fallingTime = ft.nextDouble();
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the initial position!");
        double initialPosition = ip.nextDouble();

        double finalPosition = 0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition;




        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
    }
}
