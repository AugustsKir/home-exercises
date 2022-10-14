import advancedtest.exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {
    @Test
    void correctOutput() {
        Joiner joiner = new Joiner<>(2, "-", (in, sep) -> in.toString() + sep);
        Assertions.assertEquals("2-", joiner.joinTogether());
    }
}
