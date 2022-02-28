package io.codelex.loops.practice;

import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        System.out.print("Desire sum: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        int dice1;
        int dice2;

        do{
            dice1 = (int) (Math.random() * 6 + 1);
            dice2 = (int) (Math.random() * 6 + 1);
            sum = dice1+dice2;
            System.out.println(dice1 + " and " + dice2 + " = " + sum );
        } while (sum!=num);
    }
}
