package io.codelex.exceptions.practice;


import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            double d = getInput(in.nextLine());
            double root = Math.sqrt(d);

            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        }  //todo -
        catch (NonPositiveNumberException e) {
            System.out.println("Enter a positive number!, shutting down!");
        }

    }

    static double getInput(String s) throws NonPositiveNumberException {
        double d = new Double(s);
        if (d < 0) {
            throw new NonPositiveNumberException("");
        } else return d;
    }
}
