package io.codelex.enums.practice;

import java.util.Scanner;

public enum CardinalPoints {
    NORTH(0, "up"),
    SOUTH(1, "down"),
    EAST(2, "right"),
    WEST(3, "left");
    private final int value;
    private final String direction;

    CardinalPoints(int value, String direction) {
        this.value = value;
        this.direction = direction;
    }

    public static void main(String[] args) {
        System.out.println("Enter a cardinal point");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        switch (input) {
            case "North" -> System.out.println(NORTH + ":" + NORTH.direction + ":" + NORTH.value);
            case "South" -> System.out.println(SOUTH + ":" + SOUTH.direction + ":" + SOUTH.value);
            case "East" -> System.out.println(EAST + ":" + EAST.direction + ":" + EAST.value);
            case "West" -> System.out.println(WEST + ":" + WEST.direction + ":" + WEST.value);
            default -> System.out.println("Incorrect input!");

        }
    }

    public int getValue() {
        return value;
    }

    public String getDirection() {
        return direction;
    }
}
