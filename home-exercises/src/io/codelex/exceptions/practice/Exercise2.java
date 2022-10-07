package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            Thread.dumpStack();
        }

    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            Thread.dumpStack();
        }
    }

    public static void methodC() throws ArithmeticException {
        int res = 10 / 0;
    }

    public static void main(String[] args) {
        methodA();
    }
}
