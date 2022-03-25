package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        Set<Integer> sums = new HashSet<>();
        while (true) {
            n = numSquareSum(n);
            if (n == 1) {
                System.out.println("happy");
                break;
            }
            if (sums.contains(n)) {
                System.out.println("not happy");
                break;
            }
            sums.add(n);
        }
    }

    static int numSquareSum(int n) {
        int squareSum = 0;
        while (n != 0) {
            squareSum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return squareSum;
    }
}
