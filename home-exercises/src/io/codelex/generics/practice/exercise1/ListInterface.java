package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public interface ListInterface {
    List<?> list = new ArrayList<>();

    public static void add(int i, Object el) {

    }

    public Object get(int i);
}
