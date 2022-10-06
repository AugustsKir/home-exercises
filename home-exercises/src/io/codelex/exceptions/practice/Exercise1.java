package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator");
            String numerator = scanner.nextLine();
            if (numerator.charAt(0) == 'q' || numerator.charAt(0) == 'Q') {
                System.exit(0);
            }
            int numr = 0;
            try {
                numr = Integer.parseInt(numerator);
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data!");
            }
            System.out.println("Enter the divisor");
            int divisor = scanner.nextInt();
            if (divisor == 0) {
                System.out.println("The divisor can't be 0");
            }

            System.out.println(numerator + " / " + divisor + " = " + numr / divisor);
        }
    }
}
