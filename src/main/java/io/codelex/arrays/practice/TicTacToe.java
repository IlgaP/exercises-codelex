package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {
        char[][] board = new char[3][3];
        Scanner keyboard = new Scanner(System.in);
        boolean isPlayerX = true;
        boolean gameEnded = false;
        initBoard(board);
        System.out.println("Let`s play Tic Tac Toe! :)");

        while (!gameEnded) {
            System.out.println();
            displayBoard(board);
            System.out.println();

            int row;
            int col;

            char symbol;
            if (isPlayerX) {
                symbol = 'X';
            } else {
                symbol = 'O';
            }

            while (true) {
                System.out.print(symbol + " - choose your location (row, column): ");
                row = keyboard.nextInt();
                col = keyboard.nextInt();

                if (notValidRowOrCol(row, col)) {
                    System.out.println("Out of bounds! (row - 0,1,2, column - 0,1,2) ");
                } else if (board[row][col] != '-') {
                    System.out.println("Choose a different location");
                } else {
                    break;
                }
            }
            board[row][col] = symbol;
            if (hasWon(board) == 'X') {
                System.out.println("X has won");
                gameEnded = true;
            } else if (hasWon(board) == 'O') {
                System.out.println("O has won");
                gameEnded = true;
            } else {
                if (isTie(board)) {
                    System.out.println("It`s a tie!");
                    gameEnded = true;
                } else {
                    isPlayerX = !isPlayerX;
                }
            }
        }
        System.out.println();
        displayBoard(board);
    }

    private static boolean notValidRowOrCol(int row, int col) {
        return row < 0 || row > 2 || col < 0 || col > 2;
    }

    private static void initBoard(char[][] board) {
        // fills up the board with "-"
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = '-';
    }

    private static void displayBoard(char[][] board) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(" " + board[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static char hasWon(char[][] board) {
        Character wonRow = hasWonRow(board);
        if (wonRow != null) return wonRow;
        Character wonColumn = HasWonColumn(board);
        if (wonColumn != null) return wonColumn;
        Character wonDiagonal = hasWonDiagonal(board);
        if (wonDiagonal != null) return wonDiagonal;
        return '-';
    }

    private static Character hasWonDiagonal(char[][] board) {
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[0][2] != '–') {
            return board[0][2];
        }
        return null;
    }

    private static Character HasWonColumn(char[][] board) {
        for (int c = 0; c < 3; c++) {
            if (board[0][c] == board[1][c] && board[1][c] == board[2][c] && board[2][c] != '-') {
                return board[2][c];
            }
        }
        return null;
    }

    private static Character hasWonRow(char[][] board) {
        for (int r = 0; r < 3; r++) {
            if (board[r][0] == board[r][1] && board[r][1] == board[r][2] && board[r][0] != '-') {
                return board[r][0];
            }
        }
        return null;
    }

    private static boolean isTie(char[][] board) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}