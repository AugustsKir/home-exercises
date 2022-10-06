package io.codelex.collections.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "resources/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file));
        int lines = 0;
        int chars = 0;
        int words = 0;
        String line1;
        String line2;


        while (bufferedReader1.readLine() != null) {
            lines++;
        }
        bufferedReader1.close();
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
        while ((line1 = bufferedReader2.readLine()) != null) {
            chars += line1.length();
        }
        bufferedReader2.close();
        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(file));
        while ((line2 = bufferedReader3.readLine()) != null) {
            words += line2.split(" ").length;
        }
        System.out.println("Lines = " + lines);
        System.out.println("Words = " + words);
        System.out.println("Chars = " + chars);
    }
}
