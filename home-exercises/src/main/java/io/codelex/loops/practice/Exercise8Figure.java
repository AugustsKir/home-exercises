package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise8Figure {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows! ");
        Scanner in = new Scanner(System.in);
        int numOfRows = in.nextInt();
        for (int i = 1; i <= numOfRows; i++) {
            for (int j = 1; j <= 20 - 4 * i; j++) {
                System.out.print("/");
            }
            for (int k = 1; k <= 8 * i - 8; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= 20 - 4 * i; l++ ) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

}
