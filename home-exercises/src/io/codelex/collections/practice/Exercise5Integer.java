package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5Integer {
    public static void main(String[] args) {
        System.out.println("Enter an integer!");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

    }
    private static int squareDigits(int number) {
        int sum = 0;
        int remaining = 0;
        while (number > 0) {
            remaining = number % 10;
            sum = (int) (sum + Math.pow(remaining, 2));
            number = number / 10;
        }
        return sum;
    }
}