package advancedtest.exercise3;


import java.util.Arrays;

public class Joiner<T> {
    private final String seperator;


    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    @SafeVarargs
    public final String join(T... obj) {
        StringBuilder out = new StringBuilder();
        Arrays.stream(obj).forEach(one -> out.append(one).append(seperator));
        return out.substring(0, out.length() - 1);
    }


}
