package advancedtest.exercise4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class Reader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("paraugs.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        Path file = Paths.get("paraugsNew.txt");

        String line;
        while((line = reader.readLine()) != null) {
            Files.write(file, Collections.singleton(reverse(line)), StandardCharsets.UTF_8);
        }


    }
    public static String reverse(String text) {
        int ind = text.length();
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[--ind] = text.charAt(i);
        }
        return new String(reversed);
    }
}
