package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter server launch time(for ex. 01/01/2022): ");
        String launch = input.nextLine();
        LocalDate serverLaunched = LocalDate.parse(launch, formatter);
        System.out.println("To see update times, enter -");
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("Month: ");
        int month = input.nextInt();
        System.out.println();
        System.out.println("Server update:");
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
