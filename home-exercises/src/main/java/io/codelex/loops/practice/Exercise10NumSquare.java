package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise10NumSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number! ");
        int num1 = in.nextInt();;
        System.out.println("Enter the second number! ");
        int num2 = in.nextInt();
        for(int i = num1; i <= num2; i++) {
            for(int j = i; j <= num2; j++ ) {
                System.out.print(j);
            }
            for (int k = num1; k < i; k++){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
