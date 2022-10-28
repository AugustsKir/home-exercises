package io.codelex.dateandtime.practice.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a date [dd.MM.yyyy]");
        String date1 = in.nextLine();
        System.out.println("Enter a second date [dd.MM.yyyy]");
        String date2 = in.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate loDate1 = LocalDate.parse(date1, dtf);
        LocalDate loDate2 = LocalDate.parse(date2, dtf);
        Long workDays = loDate1.datesUntil(loDate2).filter(day -> day.getDayOfWeek().getValue() <= 5).count();
        System.out.println("Total hours will be: " + "" + workDays * 8);


    }
}
