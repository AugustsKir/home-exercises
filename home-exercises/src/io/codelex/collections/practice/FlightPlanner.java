package io.codelex.collections.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

public class FlightPlanner {
    private static final String file = "resources/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        Set<String> cities = new HashSet<>();
        Map<String, ArrayList<String>> routes = new HashMap<>();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String trimmed = line.replace(" ", "");
            String[] split = trimmed.split("->");
            cities.add(split[0]);
            cities.add(split[1]);
            // Daži galamērķi netiek savākti arraylistā, nezinu kāpēc. Varbūt kaut ko esmu palaidis garām?
            if (!routes.containsKey(split[0])) {
                routes.put(split[0], new ArrayList<>());
            } else {
                routes.get(split[0]).add(split[1]);
            }
        }

        System.out.println("What would you like to do?");
        System.out.println("To quit press #");
        System.out.println("To see all available cities press 1");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        switch (input) {
            case "1" -> System.out.println(cities);
            case "#" -> System.exit(0);
        }

        System.out.println("Enter your starting city! ");
        String startCity = in.nextLine();
        String currentCity;
        if (routes.containsKey(startCity)) {
            System.out.println("Here are the available routes! " + routes.get(startCity));
        } else {
            System.out.println("You entered an invalid city :(, shutting down. ");
            System.exit(0);
        }
        System.out.println("Enter your destination! ");
        currentCity = in.nextLine();
        if (routes.get(startCity).contains(currentCity)) {
            System.out.println("You successfully booked your flight from " + startCity + " to " + currentCity + " !");
        } else {
            System.out.println("Destination not found :(, shutting down. ");
            System.exit(0);
        }
        System.out.println("Now you need to book a returning flight! Here are the available routes from " + currentCity + " : " + routes.get(currentCity));
        String finalCity = in.nextLine();
        if (routes.get(currentCity).contains(finalCity) && finalCity.equals(startCity)) {
            System.out.println("Good choice, you will be returning to your starting city! ");
        } else if (routes.get(currentCity).contains(finalCity)) {
            System.out.println("This is not a return flight to the correct city, are you sure you want to continue? y/n");
            String answer = in.nextLine();
            if (answer.equals("n")) {
                System.out.println("Shutting down, try again!");
                System.exit(0);
            }
        }
        System.out.println("Your flight routes are as follows: " + startCity + " --> " + currentCity + " --> " + finalCity);

    }


}

