import extrapractice.bta.LetterCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;

public class LetterCounterTest {
    @Test
    void onlyLettersPresent() {
        File f = new File("resources/text_file_1000_chars.txt");
        HashMap<String, Integer> letterMap = LetterCounter.readChars(f);
        StringBuilder testKeys = new StringBuilder();
        for (String key : letterMap.keySet()) {
            testKeys.append(key);
        }
        Assertions.assertTrue(testKeys.chars().allMatch(Character::isLetter));
    }
}
