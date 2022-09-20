package io.codelex.classesandobjects.practice.Exercise5Date;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        String year, month, day;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = in.nextLine();
        System.out.println("Enter the month: ");
        month = in.nextLine();
        System.out.println("Enter the day: ");
        day = in.nextLine();
        Date date = new Date(year, month, day);
        date.displayDate();
    }
}
