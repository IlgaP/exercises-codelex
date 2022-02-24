package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a series of single digit numbers(with no spaces): ");
        String number = input.next();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum = sum + Character.getNumericValue(number.charAt(i));
        }
        System.out.println("The sum of digits of the entered number is: " + sum);
    }
}
