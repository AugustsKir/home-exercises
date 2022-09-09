package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8Minutes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Minutes: ");
        int minutes = in.nextInt();
        int years = minutes / 525600;
        int remainMins = minutes % 525600;
        int days = remainMins / 1440;
        System.out.println(minutes + " minutes is " + years + " years and " + days + " days.");


    }
}
