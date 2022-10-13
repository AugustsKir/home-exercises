package io.codelex.generics.practice.exercise2;

import java.util.List;


public class Program {

    String concatenate(List<?> list) {
        StringBuilder result = new StringBuilder();
        String separator = "";
        if (!list.isEmpty() && list.get(0) instanceof String) {
            result = new StringBuilder("String:");
            separator = " ";
        } else if (!list.isEmpty() && list.get(0) instanceof Integer) {
            result = new StringBuilder("Integers:");
            separator = "+";
        }
        for (Object el : list)
            result.append(separator).append(el.toString());
        return result.toString();
    }
}
