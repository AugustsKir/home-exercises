package io.codelex.exceptions.practice;

public class NonPositiveNumberException extends Exception {
    public NonPositiveNumberException(String message) {
        super(message);
    }

    public static void validate(double number) throws NonPositiveNumberException {
        if (number < 0) {
            throw new NonPositiveNumberException("The number is negative!");
        }
    }
}
