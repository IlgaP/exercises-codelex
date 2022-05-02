package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        Files.readAllLines(path, charset);

        Scanner input = new Scanner(System.in);
        HashMap<String, ArrayList<String>> flights = getFlights(path);
        ArrayList<String> selectedCities = new ArrayList<>();
        getAllCities(flights);
        System.out.print("Choose a city to start: ");
        String startCity = input.nextLine();
        selectedCities.add(startCity);

        String nextCity = startCity;
        do {
            getNextCities(flights, nextCity);
            System.out.print("Choose next city to go to: ");
            nextCity = input.nextLine();
            selectedCities.add(nextCity);
        } while (!nextCity.equals(selectedCities.get(0)));
        printTripRoute(selectedCities);

    }

    private static void printTripRoute(ArrayList<String> selectedCities) {
        System.out.print("Trip: ");
        for (int i = 0; i < selectedCities.size(); i++) {
            if (i > 0) {
                System.out.print(" -> ");
            }
            System.out.print(selectedCities.get(i));
        }
    }

    private static void getNextCities(HashMap<String, ArrayList<String>> flights, String nextCity) {
        System.out.println("From " + nextCity + " you can go to: ");
        for (String nextCities : flights.get(nextCity)) {
            System.out.println(nextCities);
        }
    }

    private static void getAllCities(HashMap<String, ArrayList<String>> flights) {
        for (String city : flights.keySet()) {
            System.out.println(city);
        }
    }

    private static HashMap<String, ArrayList<String>> getFlights(Path path) throws IOException {
        HashMap<String, ArrayList<String>> flights = new HashMap<>();
        for (String line : Files.readAllLines(path)) {
            String[] lineArr = line.split(" -> ");
            if (!flights.containsKey(lineArr[0])) {
                flights.put(lineArr[0], new ArrayList<String>());
                flights.get(lineArr[0]).add(lineArr[1]);
            } else {
                flights.get(lineArr[0]).add(lineArr[1]);
            }
        }
        return flights;
    }
}
