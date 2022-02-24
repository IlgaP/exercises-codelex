package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input distance in meters : ");
        int distance = input.nextInt();
        System.out.print("Input hours: ");
        float hours = input.nextInt();
        System.out.print("Input minutes: ");
        float minutes = input.nextInt();
        System.out.print("Input seconds: ");
        float seconds = input.nextInt();

        float totalSeconds = seconds + (minutes * 60) + (hours * 3600);
        float totalHours = hours + (minutes / 60) + (seconds / 3600);
        float kilometers = (float) distance / 1000;
        double miles = distance * 0.000621;

        float speedMetersPerSecond = (float) distance / totalSeconds;
        float speedKilometersPerHour = kilometers / totalHours;
        float speedMilesPerHour = (float) miles / totalHours;
        System.out.println("Your speed in meters/seconds is: " + speedMetersPerSecond);
        System.out.println("Your speed in kilometers/hour is: " + speedKilometersPerHour);
        System.out.println("Your speed in miles/hour is: " + speedMilesPerHour);


    }
}
