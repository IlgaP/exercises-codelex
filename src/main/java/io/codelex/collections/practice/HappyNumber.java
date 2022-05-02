package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int inputNumber = input.nextInt();
        Set<Integer> sums = new HashSet<>();
        int number = inputNumber;
        while (true) {
            number = numSquareSum(number);
            if (number == 1) {
                System.out.println(inputNumber + " is happy");
                break;
            }
            if (sums.contains(number)) {
                System.out.println(inputNumber + " is not happy");
                break;
            }
            sums.add(number);
        }
    }

    private static int numSquareSum(int number) {
        int squareSum = 0;
        while (number != 0) {
            squareSum += (number % 10) * (number % 10);
            number = number / 10;
        }
        return squareSum;
    }
}
