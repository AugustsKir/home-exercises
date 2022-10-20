package extrapractice.bta;

import java.io.*;
import java.util.HashMap;
import java.util.stream.Collectors;

public class LetterCounter {
    static File f = new File("resources/text_file_1000_chars.txt");

    public static void main(String[] args) {
        HashMap<String, Integer> letterHash = readChars(f);
        writeFile(letterHash);
    }


    public static <T, V> String mapToString(HashMap<T, V> map) {
        return map.keySet().stream().map(key -> key + "=" + map.get(key)).collect(Collectors.joining(", ", "{", "}"));
    }

    public static HashMap<String, Integer> readChars(File f) {
        BufferedReader reader;
        String line;
        HashMap<String, Integer> letterHash = new HashMap<>();
        try {
            reader = new BufferedReader(new FileReader(f));
            while ((line = reader.readLine()) != null) {
                String[] split = line.replaceAll(" ", "").replaceAll("[^a-zA-Z]", "").toUpperCase().split("");
                if (line.equals("")) {
                    continue;
                }
                for (String s : split) {
                    if (!letterHash.containsKey(s)) {
                        letterHash.put(s, 1);
                    } else {
                        letterHash.put(s, letterHash.get(s) + 1);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return letterHash;
    }

    public static void writeFile(HashMap<String, Integer> letterHash) {
        PrintWriter writer;
        File fNew = new File(f.getAbsolutePath().substring(0, f.getAbsolutePath().length() - 4) + "letterlist.txt");
        try {
            writer = new PrintWriter(fNew);
            String out = mapToString(letterHash);
            writer.println(out);
            writer.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
