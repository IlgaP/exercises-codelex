package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first integer number: ");
        int x = input.nextInt();
        System.out.print("Input the second integer number: ");
        int y = input.nextInt();
        System.out.print("The result is: "+calculate(x, y));

    }

    public static boolean calculate(int x, int y)
    {
        if(x == 15 || y == 15)
            return true;
        return ((x + y) == 15 || Math.abs(x - y) == 15);
    }
    }


