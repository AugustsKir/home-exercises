package extrapractice.bta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.stream.Collectors;

public class LetterCounter {
    static File f = new File("resources/text_file_1000_chars.txt");

    public static void main(String[] args) {
        HashMap<String, Integer> letterMap = readChars(f);
        System.out.println(mapToString(letterMap));
    }


    public static HashMap<String, Integer> readChars(File f) {
        HashMap<String, Integer> letterMap = new HashMap<>();
        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(f));
            while ((line = reader.readLine()) != null) {
                String[] split = line.replaceAll("[^a-zA-Z]", "").toUpperCase().split("");
                if (line.equals("")) {
                    continue;
                }
                for (String s : split) {
                    if (!letterMap.containsKey(s)) {
                        letterMap.put(s, 1);
                    } else {
                        letterMap.put(s, letterMap.get(s) + 1);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return letterMap;
    }

    private static String mapToString(HashMap<String, Integer> map) {
        return map.keySet().stream().map(key -> key + " is present " + map.get(key) + " times.").collect(Collectors.joining("\n "));
    }
}
