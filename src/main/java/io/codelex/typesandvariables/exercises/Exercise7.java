package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string of text: ");
        String text = input.nextLine();
        int upper = 0;

        for(int i = 0; i< text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                upper++;
            }
        }
        System.out.println("Uppercase letters: " + upper);

    }
}
