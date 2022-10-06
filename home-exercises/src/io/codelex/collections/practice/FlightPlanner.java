package io.codelex.collections.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "resources/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        Set<String> cities = new HashSet<>();
        List<String> start = new ArrayList<>();
        List<String> end = new ArrayList<>();
        String line;
        while((line = bufferedReader.readLine()) != null) {
            String trimmed = line.replace(" ", "");
            String[] split = trimmed.split("->");
            cities.add(split[0]);
            cities.add(split[1]);
            start.add(split[0]);
            end.add(split[1]);
        }

        System.out.println("What would you like to do?");
        System.out.println("To quit press #");
        System.out.println("To see all available cities press 1");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        switch (input) {
            case "1" -> System.out.println(cities.toString());
            case "#" -> System.exit(0);
        }

    }
}
