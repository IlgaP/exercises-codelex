package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of minutes: ");
        int minutes = input.nextInt();
        int minutesInYear = 60*24*365;

        int years = minutes / minutesInYear;
        int remainingMinutes = minutes % minutesInYear;
        int days = remainingMinutes / (60*24);
        System.out.println(minutes + " minutes is " + years + " years and "  +  days + " days ");
    }

}
