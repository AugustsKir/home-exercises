package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        Scanner lb = new Scanner(System.in);
        System.out.println("Enter the lowerbound number: ");
        int lowerBound = lb.nextInt();
        Scanner ub = new Scanner(System.in);
        System.out.println("Enter the upperbound number: ");
        int upperBound = ub.nextInt();

        int sum = 0;
        float average = (float)(lowerBound + upperBound) / 2;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        System.out.println("The sum of " + lowerBound + " to " + upperBound + " is " + sum );
        System.out.println("The average is " + average);

    }
}
