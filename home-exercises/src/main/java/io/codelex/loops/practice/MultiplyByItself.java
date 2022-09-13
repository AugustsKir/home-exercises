package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int p, n, result;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        result = 1;
        p = n;


        //todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (p = n; p != 0; p--) {
            result = result * n;

        }
        System.out.println("The result is " + result);

    }

}
