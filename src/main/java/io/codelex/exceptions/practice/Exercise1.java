package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the numerator: ");
            int numerator;
            String numeratorString = scanner.next();
            if (numeratorString.charAt(0) == 'q' || numeratorString.charAt(0) == 'Q') {
                break;
            }
            try {
                numerator = Integer.parseInt(numeratorString);
                System.out.print("Enter the divisor: ");
                int divisor;
                String divisorString = scanner.next();
                divisor = Integer.parseInt(divisorString);
                if (divisor == 0) {
                    System.out.println("You can`t divide " + numerator + " by " + divisor);
                } else {
                    System.out.println(numerator + " / " + divisor + " is " + numerator / divisor);
                }
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
            }
        }
    }
}


