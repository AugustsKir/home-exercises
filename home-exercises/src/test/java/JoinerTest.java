import advancedtest.exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {
    @Test
    void correctOutputInteger() {
        Joiner<Integer> joiner = new Joiner<>("-");
        String result = joiner.join(1, 2, 3, 4, 5);
        Assertions.assertEquals("1-2-3-4-5", result);
    }

    @Test
    void correctOutputString() {
        Joiner<String> joiner = new Joiner<>("+");
        String result = joiner.join("Java", "Advanced", "Tests");
        Assertions.assertEquals("Java+Advanced+Tests", result);
    }
}
