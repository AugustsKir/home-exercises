package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9Bmi {
    public static void main(String[] args) {
        Scanner wgt = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms! ");
        double weight = wgt.nextDouble();
        Scanner hgt = new Scanner(System.in);
        System.out.println("Enter your height in meters! (Double digits after coma)");
        double height = hgt.nextDouble();
        double bmiCalc = weight / (height * height);

        if (bmiCalc < 18.5) {
            System.out.println("Your BMI is " + bmiCalc + " That's considered underweight.");
        } else if (bmiCalc > 18.5 && bmiCalc < 25) {
            System.out.println("Your BMI is " + bmiCalc + " That's considered optimal.");
        } else {
            System.out.println("Your BMI is " + bmiCalc + " That's considered overweight,");
        }
    }
}
