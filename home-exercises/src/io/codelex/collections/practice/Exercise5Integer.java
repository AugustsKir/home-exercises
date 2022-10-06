package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5Integer {
    public static void main(String[] args) {
        System.out.println("Enter an integer!");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        while (input != 1 && input !=4) {
            input = squareDigits(input);
        }
        if(input == 1) {
            System.out.println("Is a happy number");
        } else  {
            System.out.println("Not a happy number");
        }

    }
    private static int squareDigits(int number) {
        int sum = 0;
        int remaining;
        while (number > 0) {
            remaining = number % 10;
            sum = (int) (sum + Math.pow(remaining, 2));
            number = number / 10;
        }
        return sum;
    }
}
