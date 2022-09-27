package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long n = in.nextLong();
        if (n >= 10000000000L) {
            System.out.println("Number too large!");
            System.exit(0);
        } else if (n < 0) {
            n *= -1;
        }
        System.out.println("The number of digits is: " + String.valueOf(n).length());

    }
}

