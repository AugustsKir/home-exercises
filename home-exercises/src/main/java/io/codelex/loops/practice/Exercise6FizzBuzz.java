package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise6FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the max value! ");
        int maxValue = in.nextInt();
        int i;

        for (i = 1; i <= maxValue; i++) {
            if(i % 5 == 0 & i % 3 == 0) {
                System.out.print(" FizzBuzz ");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz ");
            } else if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else System.out.print(" " + i + " ");
            if (i % 20 == 0) {
                System.out.print("\n");
            }
        }
    }
}
