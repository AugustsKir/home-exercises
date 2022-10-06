package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise7 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Violet");
        colors.add("White");
        colors.add("Black");

//      TODO: Check if list contains "White" element
        for (String color : colors) {
            if (color.equals("White")) {
                System.out.println("It contains white!");
            }
        }
    }

}
