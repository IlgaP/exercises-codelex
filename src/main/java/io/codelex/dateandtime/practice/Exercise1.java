package io.codelex.dateandtime.practice;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first date");
        System.out.print("Year: ");
        int year1 = input.nextInt();
        System.out.print("Month: ");
        int month1 = input.nextInt();
        System.out.print("Day: ");
        int day1 = input.nextInt();

        System.out.println("Enter second date");
        System.out.print("Year: ");
        int year2 = input.nextInt();
        System.out.print("Month: ");
        int month2 = input.nextInt();
        System.out.print("Day: ");
        int day2 = input.nextInt();

        LocalDate date1 = LocalDate.of(year1, month1, day1);
        LocalDate date2 = LocalDate.of(year2, month2, day2);

        System.out.println(Exercise1.calculateHours(date1, date2));
    }

    private static int calculateHours(LocalDate date1, LocalDate date2) {
        int days = 0;
        final int hoursInDay = 8;

        while (ChronoUnit.DAYS.between(date1, date2.plusDays(1)) > 0) {
            if (!isWorkday(date1)) {
                days++;
            }
            date1 = date1.plusDays(1);
        }
        return days * hoursInDay;
    }

    private static boolean isWorkday(LocalDate date1) {
        return date1.getDayOfWeek() == DayOfWeek.SATURDAY || date1.getDayOfWeek() == DayOfWeek.SUNDAY;
    }


}
