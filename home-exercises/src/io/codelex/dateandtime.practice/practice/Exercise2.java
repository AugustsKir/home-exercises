package io.codelex.dateandtime.practice.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the server start date [dd.MM.yyyy]");
        String date = in.nextLine();
        System.out.println("Enter the amount of update dates you want to see in advance! ");
        int times = in.nextInt();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(date, dtf);
        for (int i = 1; i <= times; i++) {
            LocalDate week2 = startDate.plusWeeks(2L * i);
            System.out.println("Update number " + i + " will be held on " + week2);
        }

    }
}
