package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        double weight;
        double height;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight (kg): ");
        weight = input.nextDouble();
        System.out.print("Enter your height (cm): ");
        height = input.nextDouble();

        System.out.println(calculateBMI(weight, height));

    }

    static String calculateBMI(double weight, double height) {
        double weightToPounds = weight * 2.20462262;
        double heightToInches = height * 0.393701;
        double bmi = weightToPounds * 703 / (heightToInches * heightToInches);

        if (bmi < 18.5) {
            return "You are underweight";
        } else if (bmi > 25) {
            return "You are overweight";
        } else {
            return "Your weight is optimal";
        }
    }

}
