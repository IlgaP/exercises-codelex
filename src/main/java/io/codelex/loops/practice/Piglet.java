package io.codelex.loops.practice;

import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        System.out.println("Welcome to Piglet!");
        int score = 0;
        int dice;
        Scanner input = new Scanner(System.in);
        String choice;


        while (true) {
            dice = (int) (Math.random() * 6 + 1);
            System.out.println("You rolled a " + dice + "!");
            score += dice;
            if (dice == 1) {
                System.out.print("You got 0 points.");
                break;
            } else {
                System.out.print("Roll again? ");
                choice = input.next();
                if (choice.equals("no") || choice.equals("n")) {
                    System.out.println("Your score is " + score);
                    break;
                }

            }

        }


    }


}



