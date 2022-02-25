package io.codelex.arithmetic.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int random = 1 + randomNumber.nextInt(100);
        System.out.println("I'm thinking ofa number between 1-100. Try to guess it.");
        System.out.print("> ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        if (guess > random) {
            System.out.println("Too high. I was thinking of " + random);
        } else if (guess < random) {
            System.out.println("Too low. I was thinking of " + random);
        } else {
            System.out.println("You guessed it! What are the odds?!?");
        }

    }
}
