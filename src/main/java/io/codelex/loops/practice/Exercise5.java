package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        String first;
        String second;
        String dots = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word: ");
        first = input.next();
        System.out.println("Enter second word: ");
        second = input.next();

        String words = first + second;
        int count =words.length();
        int dotCount = 0;

        if(count<=30){
            dotCount = 30 - count;
        }
        for(int i = 0; i<dotCount; i++){
            dots += ".";
        }
        System.out.println(first + dots + second);
    }
}
