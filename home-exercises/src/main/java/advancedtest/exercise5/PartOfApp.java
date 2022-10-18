package advancedtest.exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PartOfApp<T> {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");

        System.out.println(partOf(names, (String name) -> name.length() > 4));
    }


    public static <T> double partOf(List<T> list, Predicate<T> method) {
        double filtered = list.stream().filter(method).toList().size();
        return filtered / list.size();
    }


}
