package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise2OddEven {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = n.nextInt();
        if (num % 2 == 0) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The given number is odd");
        }
    }
}
