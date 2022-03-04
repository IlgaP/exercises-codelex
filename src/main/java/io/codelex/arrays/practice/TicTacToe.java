package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean isPlayerX = true;
        boolean gameEmded = false;
        initBoard();
        System.out.println("Let`s play Tic Tac Toe! :)");

        while(!gameEmded){
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

            while(true) {
                System.out.print(symbol+" - choose your location (row, column): ");
                row = keyboard.nextInt();
                col = keyboard.nextInt();

                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Out of bounds! (row - 0,1,2, column - 0,1,2) ");
                } else if (board[row][col] != '-') {
                    System.out.println("Choose a different location");
                } else {
                    break;
                }
            }
            board[row][col] = symbol;
            if(hasWon(board) == 'X'){
                System.out.println("X has won");
                gameEmded = true;
            } else if(hasWon(board) == 'O'){
                System.out.println("O has won");
                gameEmded = true;
            } else {
                if(isTie(board)){
                    System.out.println("It`s a tie!");
                    gameEmded = true;
                } else {
                    isPlayerX = !isPlayerX;
                }
            }
        }
        System.out.println();
        displayBoard(board);
    }

    private static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = '-';
    }

    private static void displayBoard(char[][] board) {
        for (int r =0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                System.out.print(" "+board[r][c]+" ");
            }
            System.out.println();
        }
    }

    private static char hasWon (char[][] board){
        //row
        for (int r = 0; r < 3; r++){
            if(board[r][0] == board[r][1] && board[r][1] == board[r][2] && board[r][0] != '-'){
                return board[r][0];
            }
        }
        //col
        for (int c = 0; c < 3; c++){
            if(board[0][c] == board[1][c] && board[1][c] == board[2][c] && board[2][c] != '-'){
                return board[2][c];
            }
        }
        //diagonals
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-'){
            return board[0][0];
        }
        if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[0][2] != '–'){
            return board[0][2];
        }
        return '-';
    }

    private static boolean isTie(char[][] board){
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                if(board[r][c] == '-'){
                    return false;
                }
            }
        }
        return  true;
    }
}