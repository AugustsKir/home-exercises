package io.codelex.collections.practice.phonebook;

import java.util.Scanner;
import java.util.TreeMap;

public class PhoneDirectory {
    static Scanner in = new Scanner(System.in);


    private static TreeMap<String, String> data = new TreeMap<>();
    private static int dataCount;

    public PhoneDirectory() {
        data = new TreeMap<>();
        dataCount = 0;
    }

    public static TreeMap<String, String> getData() {
        return data;
    }

    public static int getDataCount() {
        return dataCount;
    }

    private static boolean find(String name) {
        return data.containsKey(name);
    }

    public static String getNumber(String name) {
        if (find(name)) {
            return data.get(name);
        } else return "Not found";
    }

    public static void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        if (data.containsKey(name)) {
            System.out.println("This name already exists, do you wish to overwrite the number? y/n");
            if (in.nextLine().equals("n")) {
                System.exit(0);
            }
        } else data.put(name, number);
        dataCount++;

    }

    @Override
    public String toString() {
        return data.toString();
    }


}
