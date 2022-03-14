package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        LocalDate serverLaunched = LocalDate.of(2022, 1, 1);
        Scanner input = new Scanner(System.in);
        System.out.println("To see update times, enter -");
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("Month: ");
        int month = input.nextInt();

        Exercise2.getUpdateDates(serverLaunched, year, month);

    }

    static void getUpdateDates(LocalDate serverLaunched, int year, int month) {
        while (serverLaunched.isBefore(LocalDate.of(year, month + 1, 1))) {
            serverLaunched = serverLaunched.plusWeeks(2);
            if (serverLaunched.getYear() == year && serverLaunched.getMonthValue() == month) {
                System.out.println(serverLaunched);
            }
        }
    }
}
