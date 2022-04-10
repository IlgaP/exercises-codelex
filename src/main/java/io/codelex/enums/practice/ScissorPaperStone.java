package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class ScissorPaperStone {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int wins = 0;
        int losses = 0;
        int trials = 0;
        System.out.println("Let us begin...");

        while (true) {
            System.out.println();
            System.out.println("Scissor-Paper-Stone");
            System.out.print("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String playerMove = input.nextLine();

            if (playerMove.equals("q")) {
                System.out.println("Number of trials: " + trials);
                System.out.println("I won: " + losses);
                System.out.println("You won: " + wins);
                System.out.println("Bye!");
                break;
            }

            if (isValidInput(playerMove)) {
                trials++;
                String computerMove = getComputerMove();

                if (playerMove.equals(computerMove)) {
                    System.out.println("My turn: " + computerMove);
                    System.out.println("Tie!");
                } else if (isWinnerPlayer(playerMove, computerMove)) {
                    System.out.println("My turn: " + computerMove);

                    System.out.println("You won!");
                    wins++;
                } else {
                    System.out.println("My turn: " + computerMove);

                    System.out.println("You lost!");
                    losses++;
                }

            } else {
                System.out.println("Invalid input, try again...");
            }
        }

    }

    private static boolean isValidInput(String playerMove) {
        return playerMove.equals(Move.STONE.getValue()) || playerMove.equals(Move.PAPER.getValue()) || playerMove.equals(Move.SCISSOR.getValue());
    }

    private static String getComputerMove() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        return Move.values()[randomNumber].getValue();
    }

    private static boolean isWinnerPlayer(String playerMove, String computerMove) {
        return playerMove.equals(Move.STONE.getValue()) && computerMove.equals(Move.SCISSOR.getValue())
                || playerMove.equals(Move.SCISSOR.getValue()) && computerMove.equals(Move.PAPER.getValue())
                || playerMove.equals(Move.PAPER.getValue()) && computerMove.equals(Move.STONE.getValue());
    }
}