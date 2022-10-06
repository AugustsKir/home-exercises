package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4Names {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        while (true) {
            System.out.println("Enter a name");
            String name = in.nextLine();
            if(name.isEmpty()) {
                System.out.println(names);
                break;
            }
            names.add(name);
        }
    }
}
