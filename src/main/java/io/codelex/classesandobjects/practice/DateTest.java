package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(3,7,2022);
        date.displayDate();

        date.setDay(8);
        date.displayDate();
        System.out.println(date.getYear());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int myMonth = input.nextInt();
        date.setMonth(myMonth);

        System.out.print("Enter the day: ");
        int myDay = input.nextInt();
        date.setDay(myDay);

        System.out.print("Enter the year: ");
        int myYear = input.nextInt();
        date.setYear(myYear);

        date.displayDate();
    }
}
