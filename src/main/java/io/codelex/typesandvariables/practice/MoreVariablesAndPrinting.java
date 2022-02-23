package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name;
        String eyes;
        String teeth;
        String hair;
        int age;
        double height;
        double weight;

        name = "Zed A. Shaw";
        age = 35;
        height = Math.round((74 * 2.54) * 100.0) / 100.0;  // inches to cm
        weight = Math.round((180 * 0.453592) * 100.0) / 100.0; // lbs to kg
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + height + " centimeters tall.");
        System.out.println("He's " + weight + " kilos heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + height + ", and " + weight
                + " I get " + (age + height + weight) + ".");
    }
}