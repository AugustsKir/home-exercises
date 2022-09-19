package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise8Corporation {
    public static void main(String[] args) {
        Scanner hrs = new Scanner(System.in);
        System.out.println("Enter the total number of working hours");
        int workHours = hrs.nextInt();
        if (workHours > 60) {
            throw new Error("Too many Hours!");
        }
        Scanner bp = new Scanner(System.in);
        System.out.println("Enter the number of base pay!");
        double wagePerHr = bp.nextDouble();
        int otHours;
        double otWage = 0;
        double totalSalary = 0;
        double OtTotalSalary;
        if (wagePerHr < 8) {
            throw new Error("Wage is set too Low!");
        }

        if (workHours > 40 && workHours < 60) {
            otHours = workHours - 40;
            otWage = otHours * wagePerHr * 1.5;
            OtTotalSalary = 40 * wagePerHr + otWage;
            System.out.println("Final Salary With Overtime is: " + OtTotalSalary + " Total Hours Worked - " + workHours);
        } else {
            totalSalary = wagePerHr * workHours;
            System.out.println("Final Salary Without Overtime is: " + totalSalary + " Total Hours Worked - " + workHours);
        }
    }
}
