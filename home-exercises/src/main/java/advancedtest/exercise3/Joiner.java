package advancedtest.exercise3;

import java.util.function.BiFunction;

public class Joiner<T> {
    private final String seperator;
    private final T input;
    private final BiFunction<T, String, String> join;

    public Joiner( T input, String seperator, BiFunction<T, String, String> join) {
        this.seperator = seperator;
        this.join = join;
        this.input = input;
    }
    public String joinTogether() {
        return join.apply(input, seperator);
    }

    //Nebija idejas ka izmantot mainigu daudzumu ar objektiem ieks funkcijas



}
