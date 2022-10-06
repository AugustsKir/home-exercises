package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> stringList = new ArrayList<>();

        //TODO: Add 10 values to list
        stringList.add("0");
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");
        stringList.add("6");
        stringList.add("7");
        stringList.add("8");
        stringList.add("9");

        //TODO: Add new value at 5th position
        stringList.remove(4);
        stringList.add(4, "new value");

        //TODO: Change value at last position (Calculate last position programmatically)
        stringList.remove(stringList.size() - 1);
        stringList.add("value changed!");

        //TODO: Sort your list in alphabetical order
        Collections.sort(stringList);
        //TODO: Check if your list contains "Foobar" element
        for (String s : stringList) {
            if (s.equals("Foobar")) {
                System.out.println("Found!");
            }
        }
        //TODO: Print each element of list using loop
        for (String s : stringList) {
            System.out.println(s);
        }
    }

}
