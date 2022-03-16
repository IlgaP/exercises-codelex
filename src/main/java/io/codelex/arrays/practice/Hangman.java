package io.codelex.arrays.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String[] WORDS = {"codelex", "exercise", "arrays", "game", "true"};
        Random rand = new Random();
        int misses = 0;

        String wordToGuess = WORDS[rand.nextInt(WORDS.length)];

        List<Character> playerGuesses = new ArrayList<>();
        List<Character> wrongGuess = new ArrayList<>();
        final int maxMisses = 5;
        System.out.println("Guess the word!");

        printWordState(wordToGuess, playerGuesses, wrongGuess);
        while (true) {
            if (!getPlayerGuess(input, playerGuesses, wordToGuess, wrongGuess)) {
                misses++;
            }
            if (printWordState(wordToGuess, playerGuesses, wrongGuess)) {
                System.out.println("YOU GOT IT!");
                break;
            }
            if (misses == maxMisses) {
                System.out.println();
                System.out.println("YOU LOST!");
                System.out.println("The word was: " + wordToGuess);
                break;
            }
        }
    }

    private static boolean printWordState(String wordToGuess, List<Character> playerGuesses, List<Character> wrongGuess) {
        int correct = 0;
        System.out.println("|===================================|");
        System.out.print("Word: ");
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (playerGuesses.contains(wordToGuess.charAt(i))) {
                System.out.print(wordToGuess.charAt(i));
                correct++;
            } else {
                System.out.print("_");
            }

        }
        System.out.println();
        System.out.print("Misses: ");
        printWrongGuesses(wrongGuess);

        return wordToGuess.length() == correct;
    }

    private static boolean getPlayerGuess(Scanner input, List<Character> playerGuesses, String wordToGuess, List<Character> wrongGuess) {
        System.out.println();
        System.out.print("Guess: ");
        String letterGuess = input.nextLine();
        playerGuesses.add(letterGuess.charAt(0));
        if (wordToGuess.contains(letterGuess)) {
            return wordToGuess.contains(letterGuess);
        } else {
            wrongGuess.add(letterGuess.charAt(0));
            return false;
        }
    }

    private static void printWrongGuesses(List<Character> wrongGuess) {
        for (Character guess : wrongGuess) {
            System.out.print(guess);
        }

    }


}
