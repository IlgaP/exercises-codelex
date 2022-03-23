package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter: ");
        String in = input.nextLine();
        try {
            double d = getInput(in);
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        }  //todo -
        catch (NonPositiveNumberException e) {
            System.out.println("Result will be imaginary number.");
        }

    }

    static double getInput(String s) throws NonPositiveNumberException {
        double d = Double.parseDouble(s);
        if (d < 0) {
            throw new NonPositiveNumberException();
        }
        return d;
    }

    public static class NonPositiveNumberException extends Exception {
        public NonPositiveNumberException() {
            super("Number is less than zero");
        }
    }
}
