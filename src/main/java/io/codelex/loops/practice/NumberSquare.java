package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min;
        int max;
        System.out.print("Min? ");
        min = input.nextInt();
        System.out.print("Max? ");
        max = input.nextInt();

        for(int i = min; i <= max; i++) {
            for(int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for(int k = 0; k < i - min; k++) {
                System.out.print(min + k);
            }
            System.out.println();
        }


    }
}
