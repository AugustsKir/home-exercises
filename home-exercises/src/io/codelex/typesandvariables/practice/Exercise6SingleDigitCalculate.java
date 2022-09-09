package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6SingleDigitCalculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number!");
        int n1 = in.nextInt();
        System.out.println("Enter the second number!");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.println("Final result:" + sum);


    }
}
