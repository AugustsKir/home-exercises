package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9Speed {
    public static void main(String[] args) {
        Scanner dist = new Scanner(System.in);
        System.out.println("Enter the distance in meters: ");
        int inputDistance = dist.nextInt();
        Scanner hrs = new Scanner(System.in);
        System.out.println("Enter the total number of hours: ");
        int inputHours = dist.nextInt();
        Scanner min = new Scanner(System.in);
        System.out.println("Enter the total number of minutes: ");
        int inputMinutes = min.nextInt();
        Scanner sec = new Scanner(System.in);
        System.out.println("Enter the total number of seconds: ");
        int inputSeconds = sec.nextInt();

        double toSeconds = (inputHours * 3600) + (inputMinutes * 60) + inputSeconds;
        double toKilometres = inputDistance / 1000;
        double toHours = toSeconds / 3600;
        double toMiles = toKilometres * 0.621;

        double speedMetersPerSec = inputDistance / toSeconds;
        double speedKilometresPerHour = toKilometres / toHours;
        double speedMilesPerHour = toMiles / toHours;

        System.out.println("Your speed in meters/second is " + speedMetersPerSec);
        System.out.println("Your speed in km/h is " + speedKilometresPerHour);
        System.out.println("Your speed in miles/h is " + speedMilesPerHour);





    }
}
