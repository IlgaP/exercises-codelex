package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Product1ToNExercise4 {
    public static void main(String[] args) {
        int product = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int numN = input.nextInt();
        for(int i = product; i<=numN; i++){
            product *= i;
        }
        System.out.println("The product of integers from 1 to "+numN+" is "+product);

    }
}
