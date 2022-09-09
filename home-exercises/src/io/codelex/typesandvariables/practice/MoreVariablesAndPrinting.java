package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

       String name = "Zed A. Shaw";
        int age = 35;
        float height = (float) (74 * 2.54);  // cm
        float weight = (float) (180 / 2.20); // kg
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + String.format("%.2f", height)+ " centimeters tall.");
        System.out.println("He's " + String.format("%.2f", weight) + " kilograms heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + String.format("%.2f", height) + ", and " + String.format("%.2f", weight)
                + " I get " + (age + String.format("%.2f", height) + String.format("%.2f", weight)) + ".");
    }
}