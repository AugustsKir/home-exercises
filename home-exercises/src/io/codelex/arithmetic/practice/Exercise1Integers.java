package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1Integers {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        System.out.println("Enter the second number");
        int num2 = n2.nextInt();
        int diff1 = num1 - num2 ;
        int diff2 = num2 - num1 ;
        int sum = num1 + num2;

        if (diff1 == 15) {
            System.out.println("True");;
        } else if(diff2 == 15) {
            System.out.println("True");;
        } else if (sum == 15) {
            System.out.println("True");
        } else System.out.println("Wrong Numbers");
        }

    }

