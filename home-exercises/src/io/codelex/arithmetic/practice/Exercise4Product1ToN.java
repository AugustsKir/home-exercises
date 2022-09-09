package io.codelex.arithmetic.practice;

public class Exercise4Product1ToN {
    public static void main(String[] args) {
        int sum = 1;


        for (int number = 1; number <= 10; ++number) {
            sum *= number;
        }
        System.out.println(sum);
    }
}
