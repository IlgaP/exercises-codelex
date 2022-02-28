package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter max value: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("FizzBull");
            } else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }


    }
}
