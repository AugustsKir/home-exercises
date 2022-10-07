package io.codelex.collections.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "resources/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        System.out.println(scores);
    }

    private static String fileContent() throws URISyntaxException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String score;
        StringBuilder to10 = new StringBuilder("00-09: ");
        StringBuilder to20 = new StringBuilder("10-19: ");
        StringBuilder to30 = new StringBuilder("20-29: ");
        StringBuilder to40 = new StringBuilder("30-39: ");
        StringBuilder to50 = new StringBuilder("40-49: ");
        StringBuilder to60 = new StringBuilder("50-59: ");
        StringBuilder to70 = new StringBuilder("60-69: ");
        StringBuilder to80 = new StringBuilder("70-79: ");
        StringBuilder to90 = new StringBuilder("80-89: ");
        StringBuilder to99 = new StringBuilder("90-99: ");
        StringBuilder oneHundred = new StringBuilder("100: ");

        List<Integer> listOfScores = new ArrayList<>();
        while ((score = reader.readLine()) != null) {
            String[] scoreArr = score.split(" ");
            for (int i = 0; i < scoreArr.length; i++) {
                listOfScores.add(Integer.parseInt(scoreArr[i]));
            }
        }
        for (int i = 0; i < listOfScores.size(); i++) {
            if (listOfScores.get(i) < 10) {
                to10.append('*');
            } else if (listOfScores.get(i) <= 20) {
                to20.append('*');
            } else if (listOfScores.get(i) <= 30) {
                to30.append('*');
            } else if (listOfScores.get(i) <= 40) {
                to40.append('*');
            } else if (listOfScores.get(i) <= 50) {
                to50.append('*');
            } else if (listOfScores.get(i) <= 60) {
                to60.append('*');
            } else if (listOfScores.get(i) <= 70) {
                to70.append('*');
            } else if (listOfScores.get(i) <= 80) {
                to80.append('*');
            } else if (listOfScores.get(i) <= 90) {
                to90.append('*');
            } else if (listOfScores.get(i) <= 99) {
                to99.append('*');
            } else if (listOfScores.get(i) == 100) {
                oneHundred.append('*');
            }
        }
        return to10 + "\n" + to20 + "\n" + to30 + "\n" + to40 + "\n" + to50 + "\n" + to60 + "\n" + to70 + "\n" + to80 + "\n" + to90 + "\n" + to99 + "\n" + oneHundred;
    }
}
